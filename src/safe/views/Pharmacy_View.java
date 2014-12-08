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
public class Pharmacy_View extends javax.swing.JFrame {

    /**
     * Creates new form Pharmacist_View
     */
    public Pharmacy_View() {
        initComponents();
    }//End of constructor
    
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
     * @param fname
     */
    public void setPatientFname(String fname){
        patientFname.setText(fname);
    }//End of setPatientFname
    
    /**
     * Method to set text for patient surname
     * @param sname
     */
    public void setPatientSname(String sname){
        patientSname.setText(sname);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        patientBloodgroup = new javax.swing.JTextField();
        patientSname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        patientFname = new javax.swing.JTextField();
        patientAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        patientDisease = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientSymptom = new javax.swing.JTextArea();
        patientDrug = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        DrugInstruction = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, 192, 190));
        getContentPane().add(patientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 191, 37));

        search_button.setText("Search");
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, 37));

        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 20, 30));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Bloodgroup");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, 40));

        patientBloodgroup.setEditable(false);
        jPanel1.add(patientBloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 200, 40));

        patientSname.setEditable(false);
        jPanel1.add(patientSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 200, 40));

        jLabel3.setText("Surname");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, 30));

        patientFname.setEditable(false);
        jPanel1.add(patientFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 200, 40));

        patientAge.setEditable(false);
        jPanel1.add(patientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, 40));

        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 30));

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 30));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Patient Disease");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        patientDisease.setEditable(false);
        jPanel2.add(patientDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 50));

        jLabel7.setText("Patient Symptom");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel8.setText("Drugs");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel9.setText("Instruction");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        patientSymptom.setEditable(false);
        patientSymptom.setColumns(20);
        patientSymptom.setRows(5);
        jScrollPane1.setViewportView(patientSymptom);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 190, 120));

        patientDrug.setEditable(false);
        jPanel2.add(patientDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 130, 50));

        DrugInstruction.setEditable(false);
        DrugInstruction.setColumns(20);
        DrugInstruction.setRows(5);
        jScrollPane2.setViewportView(DrugInstruction);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 60, 220, 110));

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 910, 200));

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
            java.util.logging.Logger.getLogger(Pharmacy_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacy_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DrugInstruction;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField patientAge;
    private javax.swing.JTextField patientBloodgroup;
    private javax.swing.JTextField patientDisease;
    private javax.swing.JTextField patientDrug;
    private javax.swing.JTextField patientFname;
    private javax.swing.JTextField patientId;
    private javax.swing.JTextField patientSname;
    private javax.swing.JTextArea patientSymptom;
    private javax.swing.JButton search_button;
    // End of variables declaration//GEN-END:variables
}
