/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import safe.views.Pharmacy_View;

/**
 *
 * @author chokayg3
 */
public class Pharmacy_Database_Model {
    
    //Creating instance variables
    Connection connection;
    Pharmacy_View pharmacy_view;
    
    /**
     * Constructor for the class
     */
    public Pharmacy_Database_Model(Pharmacy_View pharmacy_view){
//        connectTodatabase();
        this.pharmacy_view = pharmacy_view;
    }
    
        /**
     * A method to connect to the database
     */
    public final void connectTodatabase ( ){
    try
        {
            Class.forName ( "com.mysql.jdbc.Driver" ).newInstance ( );
             connection = java.sql.DriverManager.getConnection("jdbc:mysql://10.10.30.83/safe?user=safe&password=");
             System.out.println ( "Connected" );
        }//End Of Try
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e )
        {
            System.out.println ( "Not Connected " + e.toString ( ) );
        }//End Of Catch
    }//End of connectTodatabase
    
    /**
     * 
     * @param id
     */
    public void displayPatientdatabase (String id) {     
        try 
        {
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( "select patientFname, patientSname from patients where patientId='"+id+"'");
             if ( resultSet.next()){
//         while ( resultSet.next ( ) )
//         {  
             String fname = resultSet.getString ( "patientFname" );
             String sname = resultSet.getString("patientSname");
             pharmacy_view.setPatientFname(fname);
             pharmacy_view.setPatientSname(sname);
        }
//             System.out.println(""+Arrays.toString(w));
//         }//End Of While
         System.out.println("Displayed");
         JOptionPane.showMessageDialog(pharmacy_view, "Patient in the database", "Displayed", JOptionPane.INFORMATION_MESSAGE);     
        }//End Of Try
        catch ( SQLException e ) 
        {
            System.out.println(e.toString());
        JOptionPane.showMessageDialog(pharmacy_view, "Patient noT in database", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
        
    }//End of displayPatientdatabase
}
