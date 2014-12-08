/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.Main;

import safe.controllers.Pharmacy_Controller;
import safe.models.Pharmacy_Database_Model;
import safe.views.Pharmacy_View;

/**
 *
 * @author Abayie Fredrick
 */
public class SAFEPHARMACY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pharmacy_View pharmacy_view = new Pharmacy_View ();
        
        Pharmacy_Database_Model database_model = new Pharmacy_Database_Model(pharmacy_view);
        
        Pharmacy_Controller controller = new Pharmacy_Controller(pharmacy_view,database_model);
        controller.pharmacyButton();
    }
    
}
