/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class CreateNewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightJPanel
     */
    JPanel userProcessContainer;
    public CreateNewFlightJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Create New Flights");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 23, -1, -1));

        jLabel2.setText("Airliners");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 70, -1, -1));

        jLabel3.setText("Emirates");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 70, -1, -1));

        jLabel4.setText("Model Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 105, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 102, 82, -1));

        jLabel5.setText("Other Flight Attributes");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 140, -1, -1));

        jButton1.setText("Create New Flights");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 165, -1, -1));

        jButton2.setText("<<back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
