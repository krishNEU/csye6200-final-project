/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CaseManagerRole;

import Business.BloodTypes.BloodInventory;
import Business.BloodTypes.BloodTransaction;
import Business.BloodTypes.PersonBloodTypes.BloodType;
import Business.EcoSystem;
import Business.Requests.DonorRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krish19
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private JPanel userProcessContainer;

    ManageInventoryJPanel(EcoSystem system, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        populateInventoryBalances();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblPageTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBloodAvailability = new javax.swing.JTable();
        lblTableTitle = new javax.swing.JLabel();
        btnPrepareOrder1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(1100, 720));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        lblPageTitle.setBackground(new java.awt.Color(0, 153, 153));
        lblPageTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPageTitle.setForeground(new java.awt.Color(204, 255, 204));
        lblPageTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPageTitle.setText("                                                                         Manage Inventory");
        jPanel3.add(lblPageTitle);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));

        tblBloodAvailability.setBackground(new java.awt.Color(0, 102, 102));
        tblBloodAvailability.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tblBloodAvailability.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Types", "Count", "Last transaction time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBloodAvailability.setRowHeight(30);
        jScrollPane1.setViewportView(tblBloodAvailability);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 1100, 170));

        lblTableTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTableTitle.setForeground(new java.awt.Color(204, 255, 204));
        lblTableTitle.setText("Current Inventory Balance");
        add(lblTableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 330, 30));

        btnPrepareOrder1.setBackground(new java.awt.Color(0, 102, 102));
        btnPrepareOrder1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPrepareOrder1.setForeground(new java.awt.Color(204, 255, 204));
        btnPrepareOrder1.setText("<< Back");
        btnPrepareOrder1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrepareOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrepareOrder1ActionPerformed(evt);
            }
        });
        add(btnPrepareOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrepareOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrepareOrder1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnPrepareOrder1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrepareOrder1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblTableTitle;
    private javax.swing.JTable tblBloodAvailability;
    // End of variables declaration//GEN-END:variables

    private void populateInventoryBalances() {
        DefaultTableModel dtm = (DefaultTableModel) tblBloodAvailability.getModel();

        dtm.setRowCount(0);

        BloodInventory inventory = system.getInventory();
        
        for (BloodType bt : inventory.getInventoryBalance().keySet()) {
            Object row[] = new Object[3];
            row[0] = bt;
            row[1] = inventory.getBloodTypeBalance(bt);
            BloodTransaction lastTrans = inventory.findLastTransactions(bt);
            row[2] = (lastTrans != null) ? lastTrans.getTimestamp() : "No transaction recorded.";

            dtm.addRow(row);
        }
        
    }
}
