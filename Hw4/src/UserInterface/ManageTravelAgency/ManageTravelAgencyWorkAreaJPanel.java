/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageTravelAgency;

import business.AirLiner;
import business.AirLinerDirectory;
import business.Flight;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ManageTravelAgencyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyWorkAreaJPanel
     */
    JPanel userProcessContainer;
    AirLinerDirectory ald;
    public ManageTravelAgencyWorkAreaJPanel(JPanel userProcessContainer, AirLinerDirectory ald) {
        System.out.println(ald.getAld().size());
        this.ald = ald;
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
        sorce = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTabel = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dest = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Manage Travel Agency");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setText("Source: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 20));

        sorce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beijing", "Shanghai", "Boston" }));
        add(sorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        flightTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Flight", "Source", "Destination", "Time", "Schedule", "Price"
            }
        ));
        jScrollPane1.setViewportView(flightTabel);
        if (flightTabel.getColumnModel().getColumnCount() > 0) {
            flightTabel.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 540, 139));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jLabel5.setText("Destination:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 20));

        dest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beijing", "Shanghai", "Boston" }));
        add(dest, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel6.setText("Time:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, 20));

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Daytime", "Evening" }));
        add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String t = time.getSelectedItem().toString();
        String scr = sorce.getSelectedItem().toString();
        String de = dest.getSelectedItem().toString();
        System.out.println(t);
        System.out.println(scr);
        System.out.println(de);
        int rc = flightTabel.getModel().getRowCount()-1;
        while(rc>=0) {
            ((DefaultTableModel) flightTabel.getModel()).removeRow(rc);
            rc = rc - 1;
        }
        for(AirLiner aln : ald.getAld()){
            
            for(Flight fl : aln.getFls().getFls()){
                //System.out.println(fl);
                if(fl.getDeparAirport().equals(scr) && fl.getArrivAirport().equals(de) && fl.getTime().equals(t)){
                    Object[] row = new Object[7];
                    row[0] = fl.getAln();
                    row[1] = fl;
                    row[2] = fl.getDeparAirport();
                    row[3] = fl.getArrivAirport();
                    row[4] = fl.getTime();
                    row[5] = fl.getSchedule();
                    row[6] = fl.getSeatPrice();
                    ((DefaultTableModel) flightTabel.getModel()).addRow(row);
                    System.out.println(fl);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dest;
    private javax.swing.JTable flightTabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sorce;
    private javax.swing.JComboBox<String> time;
    // End of variables declaration//GEN-END:variables
}
