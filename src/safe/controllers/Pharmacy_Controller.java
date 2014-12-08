/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import safe.models.Pharmacy_Database_Model;
import safe.views.Pharmacy_View;

/**
 *
 * @author Abayie Fredrick
 */
public class Pharmacy_Controller {
    Pharmacy_View pharmacy_view;
    Pharmacy_Database_Model database_model;
    private ActionListener actionListener;
    
    /**
     * Constructor for the class
     * @param pharmacy_view
     * @param database_model
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
        };
         pharmacy_view.getSearch().addActionListener ( actionListener );
                }
    catch(Exception e){
        System.out.println(e.toString());
    }
}


public void search(){
    try{
        String id = pharmacy_view.getPatientId();
        database_model.displayPatientdatabase(id);
    }
    catch(Exception e){
        System.out.println(e.toString());
    }
    
}//End of search
    
}//End of class
