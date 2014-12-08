/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.views;

import javax.swing.JButton;

/**
 *
 * @author chokayg3
 */
public class Pharmacist_View extends javax.swing.JFrame {

    /**
     * Creates new form Pharmacist_View
     */
    public Pharmacist_View() {
        initComponents();
    }
    
    /**
     * Method to get patient id text field
     * @return 
     */
    public String getPatientId(){
        return patientId.getText();
    }//End of getPatientId
    
    /**
     * Method to return the search button
     * @return 
     */
    public JButton getSearch(){
        return search_button;
    }//End of getSearch
    
    /**
     * Method to set text for patient first name
     */
    public void setPatientFname(){
        patientFname.setText("");
    }//End of setPatientFname
    
    /**
     * Method to set text for patient surname
     */
    public void setPatientSname(){
        patientSname.setText("");
    }//End ofPatientSname

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        patientId = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientFname = new javax.swing.JTextField();
        patientAge = new javax.swing.JTextField();
        patientSname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        patientBloodgroup = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, 192, 149));
        getContentPane().add(patientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 191, 37));

        search_button.setText("Search");
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 37));

        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 20, 30));
        getContentPane().add(patientFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 200, 40));
        getContentPane().add(patientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 200, 40));
        getContentPane().add(patientSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 200, 40));

        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel3.setText("Surname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, 30));

        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        jLabel5.setText("Bloodgroup");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, 40));
        getContentPane().add(patientBloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 200, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pharmacist_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacist_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacist_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacist_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacist_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField patientAge;
    private javax.swing.JTextField patientBloodgroup;
    private javax.swing.JTextField patientFname;
    private javax.swing.JTextField patientId;
    private javax.swing.JTextField patientSname;
    private javax.swing.JButton search_button;
    // End of variables declaration//GEN-END:variables
}
