/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.EmployeeInformation;
import Model.EmployeeInformationHistory;
import javax.swing.JOptionPane;



//EmployeeInformationHistory history;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krishna
 */
public class DisplayJPanel extends javax.swing.JPanel {

    
    EmployeeInformationHistory history;
    /**
     * Creates new form DisplayJPanel
     */
    public DisplayJPanel(EmployeeInformationHistory history) {
        initComponents();
        this.history  = history; // the reference of history from this function is stored in this.history which is declared above.
        populateDataToTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        lblEmployeePhoto = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 1200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1062, -1));

        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Age", "Gender", "Phone", "E-mail", "Start Date", "Level", "Team Info", "Position Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(displayTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 98, 1048, 209));

        btnView.setText("View");
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 319, 74, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(988, 319, -1, -1));

        jLabel2.setText("Employee Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 361, 111, -1));

        jLabel3.setText("Employee Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 406, -1, -1));

        jLabel4.setText("Age");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 451, 111, -1));

        jLabel5.setText("Gender");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 496, 111, -1));

        jLabel6.setText("Phone");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 541, 111, -1));

        jLabel7.setText("E-mail");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 368, 111, 17));

        jLabel8.setText("Start Date");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 406, 111, -1));

        jLabel9.setText("Level");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 451, 111, -1));

        jLabel10.setText("Team Info");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 496, 111, -1));

        jLabel11.setText("Position Title");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 541, 111, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 358, 219, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 403, 219, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 448, 219, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 493, 219, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 538, 219, -1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 358, 219, -1));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 403, 219, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 448, 219, -1));
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 493, 219, -1));
        add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 538, 219, -1));

        lblEmployeePhoto.setText(" ");
        add(lblEmployeePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 376, 157, 151));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = displayTable.getSelectedRow();  // gives index of selected rows
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an employee profile");
           return;
           // int selectedRowIndex = displayTable.getSelectedRow();  // gives index of selected rows
        }
        DefaultTableModel model = (DefaultTableModel)displayTable.getModel();
        //DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        // getting reference of selected entry.
        EmployeeInformation selectedEntry = (EmployeeInformation) model.getValueAt(selectedRowIndex, 0);  // to get any value cells from table through row and column
        history.deleteProfile(selectedEntry);
        JOptionPane.showMessageDialog(this, "Selected Employee Deleted");
        populateDataToTable();
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JTable displayTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblEmployeePhoto;
    // End of variables declaration//GEN-END:variables

    private void populateDataToTable() {
        //TableModel is used to manipulate table content.
        // type casts tablemodel to defaultTableModel.
    DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
    model.setRowCount(0); // used to delete empty records from table
    
    // looping over EmployeeInformationHistory of employees 
    // getProfileHistory returns the arrayList of history of EmployeeInformation.
    for (EmployeeInformation ep : history.getHistory()){
        
        // row is array of objects with 9 menbers. (1 for each column)
        Object[] row =  new Object[10];
        row[0] = ep.getEmployeeId();
        row[1] = ep.getEmployeeName();
        row[2] = ep.getEmployeeAge();
        row[3] = ep.getEmployeeGender();
        row[4] = ep.getEmployeePhnNumber();
        row[5] = ep.getEmployeeEmail();
        row[6] = ep.getEmployeeStartDate();
        row[7] = ep.getEmployeeLevel();
        row[8] = ep.getEmployeeTeamInfo();
        row[9] = ep.getEmployeePositionTitle();

        model.addRow(row); // adds row to model

    }
    }
}
