/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Salesman;

import Business.business;
import Business.market_offer;
import Business.salesFunction.order;
import Business.salesFunction.order_item;
import Business.sales_person;
import Interface.LoginJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yin
 */
public class reviewOrdersPanel extends javax.swing.JPanel {

    /**
     * Creates new form reviewOrdersPanel
     */
    JPanel upc;
    business b;
    sales_person s;
   

    reviewOrdersPanel(JPanel upc, business b, sales_person s) {
        initComponents();
        this.upc = upc;
        this.b = b;
        this.s = s;
        populateTable();
        
        displayTotal();
        displayGap();
        
    }
    
    public void displayTotal(){
        
        int total = 0;     
        for(order o: s.getOa()){
            total = total + o.getTotal_price();
        }
        txtTotalRevenue.setText(String.valueOf(total));
    }
    
    public void displayGap(){
        int gap = 0;
        for(order o: s.getOa()){
            for(order_item oi: o.getOia()){
                market_offer mo = b.getMoc().findOffer(o.getMarket(), oi.getProduct());
                
                System.out.println(oi.getActualPrice());
                System.out.println(mo.getTarget());
                gap = gap+(oi.getActualPrice()-mo.getTarget())*oi.getQuantity();
                
            }
        }
        
        txtGap.setText(String.valueOf(gap));
    }
    
    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        for (order o: s.getOa()){
            
            Object[] row = new Object[7];
            row[0] = o;
            row[1] = o.getCustomer();
            row[2] = o.getTotal_price();
            
           dtm.addRow(row);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotalRevenue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGap = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderItem = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "For Customer", "TotalPrice", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        jLabel1.setFont(new java.awt.Font("DIN Alternate", 0, 18)); // NOI18N
        jLabel1.setText("Review All your order: ");

        BtnBack.setText("<Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Didot", 0, 18)); // NOI18N
        jLabel2.setText("Total Revenue: ");

        txtTotalRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalRevenueActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Didot", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Target Gap:");

        txtGap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGapActionPerformed(evt);
            }
        });

        tblOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ProductID", "ProductName", "Quantity", "ActualPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderItem);

        jButton1.setText("View Order Detail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnBack)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(txtGap, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtGap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(BtnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
       
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
        
    }//GEN-LAST:event_BtnBackActionPerformed

    private void txtTotalRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalRevenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalRevenueActionPerformed

    private void txtGapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGapActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        
        if(selectedRow<0){  //未选择
            JOptionPane.showMessageDialog(null,"Please select Order");
        }else{
            order o = (order) tblOrder.getValueAt(selectedRow, 0);
            populateItems(o);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void populateItems(order o){
    
        DefaultTableModel dtm = (DefaultTableModel) tblOrderItem.getModel();
        dtm.setRowCount(0);
        
        for (order_item oi: o.getOia()){
            
            Object[] row = new Object[7];
            row[0] = oi;
            row[1] = oi.getProduct().getName();
            row[2] = oi.getQuantity();
            row[3] = oi.getActualPrice();
            dtm.addRow(row);

        }
            
        
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblOrderItem;
    private javax.swing.JTextField txtGap;
    private javax.swing.JTextField txtTotalRevenue;
    // End of variables declaration//GEN-END:variables
}
