/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airliner;
import Business.Plane;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author gaorong
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Airliner aln;
    public CreateJPanel(Airliner aln) {
        initComponents();
        this.aln = aln;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MaintenGroup = new javax.swing.ButtonGroup();
        AvailaGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTakeoffTime = new javax.swing.JTextField();
        txtManufacturer = new javax.swing.JTextField();
        txtSeatsNumber = new javax.swing.JTextField();
        txtManufacturedYear = new javax.swing.JTextField();
        txtAirport = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnItIsAvailable = new javax.swing.JCheckBox();
        btnExpired = new javax.swing.JCheckBox();
        btnVaild = new javax.swing.JCheckBox();
        btnUnavailable = new javax.swing.JCheckBox();

        jPanel1.setPreferredSize(new java.awt.Dimension(1164, 643));

        jLabel1.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Create Airplane Information");

        jLabel2.setFont(new java.awt.Font("Muna", 1, 14)); // NOI18N
        jLabel2.setText("Serial Number:");

        jLabel3.setFont(new java.awt.Font("Muna", 1, 14)); // NOI18N
        jLabel3.setText("Model Number:");

        jLabel4.setFont(new java.awt.Font("Muna", 1, 14)); // NOI18N
        jLabel4.setText("Manufacturer:");

        jLabel5.setFont(new java.awt.Font("Menlo", 1, 14)); // NOI18N
        jLabel5.setText("Seats Number:");

        jLabel6.setFont(new java.awt.Font("Menlo", 1, 14)); // NOI18N
        jLabel6.setText("Take-off time:");

        jLabel7.setFont(new java.awt.Font("Menlo", 1, 14)); // NOI18N
        jLabel7.setText("Airport:");

        jLabel8.setFont(new java.awt.Font("Menlo", 1, 14)); // NOI18N
        jLabel8.setText("Manufactured year:");

        jLabel9.setFont(new java.awt.Font("Muna", 1, 14)); // NOI18N
        jLabel9.setText("Maintenance certificate:");

        jLabel10.setFont(new java.awt.Font("Menlo", 1, 14)); // NOI18N
        jLabel10.setText("Availablity:");

        txtTakeoffTime.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtTakeoffTime.setForeground(new java.awt.Color(204, 51, 0));
        txtTakeoffTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTakeoffTimeActionPerformed(evt);
            }
        });

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setMaximumSize(new java.awt.Dimension(69, 23));
        btnSave.setMinimumSize(new java.awt.Dimension(69, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        AvailaGroup.add(btnItIsAvailable);
        btnItIsAvailable.setFont(new java.awt.Font("Al Bayan", 1, 13)); // NOI18N
        btnItIsAvailable.setText("Available");
        btnItIsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItIsAvailableActionPerformed(evt);
            }
        });

        MaintenGroup.add(btnExpired);
        btnExpired.setFont(new java.awt.Font("Al Bayan", 1, 13)); // NOI18N
        btnExpired.setText("Expired");

        MaintenGroup.add(btnVaild);
        btnVaild.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnVaild.setText("Vaild");
        btnVaild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaildActionPerformed(evt);
            }
        });

        AvailaGroup.add(btnUnavailable);
        btnUnavailable.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnUnavailable.setText("Unavailable");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(300, 300, 300)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtManufacturer)
                                        .addComponent(txtSeatsNumber)
                                        .addComponent(txtTakeoffTime, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtAirport, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSerialNumber)
                                        .addComponent(txtModelNumber)
                                        .addComponent(txtManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnExpired)
                                            .addGap(57, 57, 57)
                                            .addComponent(btnVaild)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnItIsAvailable)
                                        .addGap(47, 47, 47)
                                        .addComponent(btnUnavailable))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTakeoffTime)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAirport)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModelNumber)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExpired)
                            .addComponent(btnVaild))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnItIsAvailable)
                            .addComponent(btnUnavailable)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String takeOffTime = txtTakeoffTime.getText();
        String airport = txtAirport.getText();
        String serialNumber = txtSerialNumber.getText();
        String modelNumber = txtModelNumber.getText();
        int seatNumber = Integer.parseInt(txtSeatsNumber.getText());
        String manufacturer = txtManufacturer.getText();
        String manufacturedYear = txtManufacturedYear.getText();
        boolean avail = btnItIsAvailable.isSelected();  
        boolean expired = btnExpired.isSelected();
        Plane p = aln.addPlanes();
        p.getSchedule().setAirport(airport);
        p.getSchedule().setIsavailable(avail);
        p.getSchedule().setTakeOffTime(takeOffTime);
        p.setIsExpired(expired);
        p.setManufacture(manufacturer);
        p.setSeatsNumber(seatNumber);
        p.setModelNumber(modelNumber);
        p.setYear(manufacturedYear);
        p.setSerialNumber(serialNumber);
        JOptionPane.showMessageDialog(null,"Plane Added Successfully");
        
        txtAirport.setText("");
        txtManufacturedYear.setText("");
        txtManufacturer.setText("");
        txtModelNumber.setText("");
        txtSeatsNumber.setText("");
        txtSerialNumber.setText("");
        txtTakeoffTime.setText("");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnVaildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVaildActionPerformed

    private void btnItIsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItIsAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnItIsAvailableActionPerformed

    private void txtTakeoffTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTakeoffTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTakeoffTimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AvailaGroup;
    private javax.swing.ButtonGroup MaintenGroup;
    private javax.swing.JCheckBox btnExpired;
    private javax.swing.JCheckBox btnItIsAvailable;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox btnUnavailable;
    private javax.swing.JCheckBox btnVaild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAirport;
    private javax.swing.JTextField txtManufacturedYear;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeatsNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtTakeoffTime;
    // End of variables declaration//GEN-END:variables
}