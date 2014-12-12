/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import safe.models.Pharmacy_Database_Model;
import safe.views.Pharmacy_View;

/**
 *
 * @author Abayie Fredrick
 * @version 1.02
 */
public class Pharmacy_Controller {
    Pharmacy_View pharmacy_view;
    Pharmacy_Database_Model database_model;
    private ActionListener actionListener;
    
    /**
     * Constructor for the class
     * @param pharmacy_view instance of the pharmacy view class
     * @param database_model instance of the database model class
     */
    public Pharmacy_Controller(Pharmacy_View pharmacy_view,Pharmacy_Database_Model database_model){
        this.pharmacy_view = pharmacy_view;
        this.database_model = database_model;
        pharmacy_view.setVisible(true);
        database_model.connectTodatabase();
    }//End of constructor
    
/**
 * method to handle buttons pressed
 */
public void pharmacyButton (){
    try
    {
        actionListener = (ActionEvent e) -> {
            
            //Get search button
            if (e.getSource().equals(pharmacy_view.getSearch())){
                search();
                System.out.println("Search button pressed");
            }//End of if
            
            //Get close button
            if (e.getSource().equals(pharmacy_view.getClose())){
                pharmacy_view.dispose();
            }
            
            //Get print button
            if(e.getSource().equals(pharmacy_view.getPrint())){
                print();
            }
        };
         pharmacy_view.getSearch().addActionListener ( actionListener );
         pharmacy_view.getClose().addActionListener ( actionListener );
         pharmacy_view.getPrint().addActionListener ( actionListener );
                }
    catch(Exception e){
        System.out.println(e.toString());
    }
}

/**
 * Method to search for patient
 */
public void search(){
    try{
        String id = pharmacy_view.getPatientId();
        database_model.displayPatientdatabase(id);
    }
    catch(Exception e){
        System.out.println(e.toString());
    }
    
}//End of search

/**
 * Method to print data in the table
 */
public void print(){
    String fname = pharmacy_view.getPatientFname();
    String sname = pharmacy_view.getPatientSname();
    String dname = pharmacy_view.getPatientDrug();
    String dIns = pharmacy_view.getDrugIns();
    
    Object [] m = {fname,sname,dname,dIns};
    pharmacy_view.list(""+Arrays.toString(m));
}
    
}//End of class
