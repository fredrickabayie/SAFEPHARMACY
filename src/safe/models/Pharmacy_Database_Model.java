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
import javax.swing.ImageIcon;
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
     * @param pharmacy_view
     */
    public Pharmacy_Database_Model(Pharmacy_View pharmacy_view){
        this.pharmacy_view = pharmacy_view;
    }
    
    /**
     * A method to connect to the database
     */
    public final void connectTodatabase ( ){
    try
        {
            Class.forName ( "com.mysql.jdbc.Driver" ).newInstance ( );
             connection = java.sql.DriverManager.getConnection("jdbc:mysql://169.254.60.63/safe?user=safe&password=");
             JOptionPane.showMessageDialog(pharmacy_view, "Connected to Database", "Connected", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println ( "Connected" );
        }//End Of Try
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e )
        {
            System.out.println ( "Not Connected " + e.toString ( ) );
            JOptionPane.showMessageDialog(pharmacy_view, "Not Connected to Database", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
    }//End of connectTodatabase
    
    /**
     * Method to display patient details
     * @param id
     */
    public void displayPatientdatabase (String id) {     
        try 
        {
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( "select patientFname,patientSname,patientAge,patientBloodgroup,"
                  + "patientDisease,patientSymptom,drugName,drugInstruction,patientImage from patients where patientId='"+id+"'");
             if ( resultSet.next()){
             String fname = resultSet.getString ( "patientFname" );
             String sname = resultSet.getString("patientSname");
             String age = resultSet.getString("patientAge");
             String blood = resultSet.getString("patientBloodgroup");
             String disease = resultSet.getString("patientDisease");
             String symptom = resultSet.getString("patientSymptom");
             String drug = resultSet.getString("drugName");
             String instruction = resultSet.getString("drugInstruction");
             byte[] imagedata = resultSet.getBytes("patientImage");
             ImageIcon format = new ImageIcon (imagedata);
             
             pharmacy_view.setPatientFname(fname);
             pharmacy_view.setPatientSname(sname);
             pharmacy_view.setPatientAge(age);
             pharmacy_view.setPatientBlood(blood);
             pharmacy_view.setPatientDisease(disease);
             pharmacy_view.setPatientSymptom(symptom);
             pharmacy_view.setPatientDrug(drug);
             pharmacy_view.setDrugInstruction(instruction);
             pharmacy_view.setPatientImage().setIcon(format);
//             pharmacy_view.setIm(format);
//             format.getImage();
             System.out.println(format.getImage());
             JOptionPane.showMessageDialog(pharmacy_view, "Patient in the database", "Displayed", JOptionPane.INFORMATION_MESSAGE);
        }
         System.out.println("Displayed");
//         JOptionPane.showMessageDialog(pharmacy_view, "Patient in the database", "Displayed", JOptionPane.INFORMATION_MESSAGE);     
        }//End Of Try
        catch ( SQLException e ) 
        {
            System.out.println(e.toString());
        JOptionPane.showMessageDialog(pharmacy_view, "Patient not in database", "Failed", JOptionPane.ERROR_MESSAGE);
        }//End Of Catch
        
    }//End of displayPatientdatabase
}
