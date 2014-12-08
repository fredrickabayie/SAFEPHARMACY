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

/**
 *
 * @author chokayg3
 */
public class Database_Model {
    
    //Creating instance variables
    Connection connection;
    
    /**
     * Constructor for the class
     */
    public Database_Model(){
        connectTodatabase();
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
     */
    public void displayPatientdatabase ( ) {
//         patient_table_view.setRowCount(0);        
        try 
        {
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( "SELECT patientFname=?,patientSname=? FROM patients where patientId=?" );
//         while ( resultSet.next ( ) )
//         {
             Object [] w = {resultSet.getString ( "patientFname" ),resultSet.getString ( "patientSname" )};   
             System.out.println(""+Arrays.toString(w));
             System.out.println(resultSet.getString("patientId"));
//         }//End Of While
         System.out.println("Displayed");
//         JOptionPane.showMessageDialog(null, "Successfully Dispalyed The Data In The DataBase", "Displayed", JOptionPane.INFORMATION_MESSAGE);     
        }//End Of Try
        catch ( SQLException e ) 
        {
            System.out.println(e.toString());
//        JOptionPane.showMessageDialog(null, "Failed To Display The Data In The DataBase", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
        
    }//End of displayPatientdatabase
}
