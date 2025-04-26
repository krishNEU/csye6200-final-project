/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LocalClinicStaffRole;

import Business.BloodTypes.PersonBloodTypes;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Magic.Design.*;
import Business.Organization.Organization;
import Business.Organization.LocalClinicOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Magic.Design.MyJLabel;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krish19
 */
public class BloodDonationRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BoneMarrowRequestJPanel
     */
    private UserAccount userAccount;
    private LocalClinicOrganization marroworganization;
    private Enterprise enterprise;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;

    public BloodDonationRequestJPanel(UserAccount userAccount, LocalClinicOrganization bmBankOrganization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.marroworganization = bmBankOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;

        tblBoneMarrowCoordinator.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblHlaAvailability.getTableHeader().setDefaultRenderer(new MyTableFormat());

        populateBoneMarrowCoordinatorTable();
        populateHlaAvailabilityTable();
    }

    public void populateBoneMarrowCoordinatorTable() {
        DefaultTableModel model = (DefaultTableModel) tblBoneMarrowCoordinator.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
            row[3] = request.getPatient().getEmailID();
            row[4] = String.join(", ", request.getPatient().getBloodType().toString());
            row[5] = request.getStatus();

            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnOnHold = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBoneMarrowCoordinator = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHlaAvailability = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(1150, 720));
        setPreferredSize(new java.awt.Dimension(1150, 830));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("List of Blood Transfusion Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 247, -1, -1));

        btnApprove.setBackground(new java.awt.Color(0, 102, 102));
        btnApprove.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(204, 255, 204));
        btnApprove.setText("Approve Request");
        btnApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 210, 40));

        btnOnHold.setBackground(new java.awt.Color(0, 102, 102));
        btnOnHold.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnOnHold.setForeground(new java.awt.Color(204, 255, 204));
        btnOnHold.setText("Hold Request");
        btnOnHold.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOnHold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnHoldActionPerformed(evt);
            }
        });
        add(btnOnHold, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 190, 40));

        tblBoneMarrowCoordinator.setBackground(new java.awt.Color(0, 102, 102));
        tblBoneMarrowCoordinator.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblBoneMarrowCoordinator.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Request Number", "Patient ID", "Patient Name", "Email ID", "Blood Group", "Status"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblBoneMarrowCoordinator.setGridColor(new java.awt.Color(0, 0, 0));
        tblBoneMarrowCoordinator.setRowHeight(30);
        tblBoneMarrowCoordinator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBoneMarrowCoordinatorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBoneMarrowCoordinator);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 890, 170));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel25.setBackground(new java.awt.Color(255, 153, 153));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Blood Donation Bank");
        jPanel3.add(jLabel25);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, -1));

        tblHlaAvailability.setBackground(new java.awt.Color(0, 102, 102));
        tblHlaAvailability.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblHlaAvailability.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Blood Types", "Count"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblHlaAvailability.setRowHeight(30);
        jScrollPane1.setViewportView(tblHlaAvailability);
        if (tblHlaAvailability.getColumnModel().getColumnCount() > 0) {
            tblHlaAvailability.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 900, 170));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Blood Bank Inventory");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 330, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblBoneMarrowCoordinator.getSelectedRow();

        if (selectedRow < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Please select a row from the table</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        } else {
            WorkRequest request = (WorkRequest) tblBoneMarrowCoordinator.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Legally Approved. Passing to BoneMarrowBank")
                    || request.getStatus().equals("On Hold Due to BoneMarrow unavailability")) {

                dB4OUtil.storeSystem(system);
                populateBoneMarrowCoordinatorTable();

                Enterprise ent = null;
                Organization org = null;

                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getEnterpriseType().toString().equals("Hospital")) {
                        ent = enterprise;
                        break;
                    }
                }

                if (ent == null) {
                    JOptionPane.showMessageDialog(null,
                            new JLabel("<html><b>There is no Hospital Enterprise.<br> Cannot proceed..</b></html>"),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }

//  
                if (org != null) {
                    request.setStatus("BoneMarrowBank Approved. Passing to System Coordinator");
                    org.getWorkQueue().getWorkRequestList().add(request);
                } else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, new JLabel("<html><b>Work Request is already in progress!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            }
        }

        dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnOnHoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnHoldActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblBoneMarrowCoordinator.getSelectedRow();

        if (selectedRow < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );

            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Please select a row from the table!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        } else {
            WorkRequest request = (WorkRequest) tblBoneMarrowCoordinator.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Legally Approved. Passing to BoneMarrowBank")) {
                request.setStatus("On Hold Due to BoneMarrow unavailability");

                dB4OUtil.storeSystem(system);
                populateBoneMarrowCoordinatorTable();
            } else {
                JOptionPane.showMessageDialog(null, new JLabel("<html><b>Work Request is already in progress!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

                //  JOptionPane.showMessageDialog(null, "Work Request is already in progress!" ); 
            }
        }

    }//GEN-LAST:event_btnOnHoldActionPerformed

    private void tblBoneMarrowCoordinatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBoneMarrowCoordinatorMouseClicked
        // TODO add your handling code here:

        int selectedRow = tblBoneMarrowCoordinator.getSelectedRow();
        // jPanel1.setVisible(true);
        if (selectedRow < 0) {
            //JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row from the table!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            WorkRequest request = (WorkRequest) tblBoneMarrowCoordinator.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Legally Approved. Passing to BoneMarrowBank")) {
                //request.setStatus("On Hold Due to BoneMarrow unavailability");
                if (request.getPatient().isEmergencyStatus() == true) {
                    JOptionPane.showMessageDialog(null, new JLabel("Legally Approved. Passing to BoneMarrowBank"), "Warning", JOptionPane.WARNING_MESSAGE);
                }
                //dB4OUtil.storeSystem(system);
                //populateBoneMarrowCoordinatorTable();   
            } else {
                //JOptionPane.showMessageDialog(null, new JLabel("<html><b>Work Request is already in progress!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
//                 jPanel1.setVisible(false);
                //  JOptionPane.showMessageDialog(null, "Work Request is already in progress!" ); 
            }
        }

    }//GEN-LAST:event_tblBoneMarrowCoordinatorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnOnHold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBoneMarrowCoordinator;
    private javax.swing.JTable tblHlaAvailability;
    // End of variables declaration//GEN-END:variables

    private void populateHlaAvailabilityTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblHlaAvailability.getModel();
        dtm.setRowCount(0);
//        marroworganization.getInventory().HLACountAdd(new PersonHLA().updateHLAlist("HLA_A,HLA_B"),6);
//        marroworganization.getInventory().HLACountAdd(new PersonHLA().updateHLAlist("HLA_A"),5);
//        marroworganization.getInventory().HLACountAdd(new PersonHLA().updateHLAlist("HLA_A,HLA_B,HLA_C"),7);
//        dB4OUtil.storeSystem(system);
        for (Map.Entry<String, Integer> hlaCount : marroworganization.getInventoryData().entrySet()) {

            Object row[] = new Object[2];
            row[0] = hlaCount.getKey().toString();
            row[1] = hlaCount.getValue();

            dtm.addRow(row);

        }
    }
}
