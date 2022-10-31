/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.CityDirectory;
import Model.CommunityDirectory;
import Model.Doctor;
import Model.DoctorDirectory;
import Model.EncounterHistory;
import Model.Hospital;
import Model.HospitalDirectory;
import Model.Patient;
import Model.PatientDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author Krishnakanth Naik Jarapala
 */
public class userLoginPage extends javax.swing.JFrame {
    PatientDirectory patientlist;
    Patient patient;
    
    DoctorDirectory doctorlist;
    Doctor doctor;
    
    EncounterHistory encounterhistory;
    
    HospitalDirectory hospitallist;
    Hospital hospital;
    
    CommunityDirectory communitylist;
    CityDirectory citylist;
    
    /**
     * Creates new form userLoginPage
     */
    public userLoginPage() {
        initComponents();
        this.patientlist = new PatientDirectory();
        this.doctorlist = new DoctorDirectory();
        this.encounterhistory = new EncounterHistory();
        this.communitylist = new CommunityDirectory();
        this.citylist = new CityDirectory();
    }

    public userLoginPage(PatientDirectory patientlist, DoctorDirectory doctorlist, EncounterHistory encounterhistory, CityDirectory citylist, CommunityDirectory communitylist) {
        initComponents();
        this.patientlist = patientlist;
        this.doctorlist = doctorlist;
        this.encounterhistory = encounterhistory;
        this.citylist = citylist;
        this.communitylist = communitylist;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlebox = new javax.swing.JLabel();
        lbl_role = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        comboBox_roleMenu = new javax.swing.JComboBox<>();
        pass_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        titlebox.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        titlebox.setForeground(new java.awt.Color(255, 255, 255));
        titlebox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlebox.setText("Welcome to Medical Resource Management!");

        lbl_role.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbl_role.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_role.setText("User:");

        lbl_Password.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbl_Password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_Password.setText("Password:");

        lbl_username.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbl_username.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_username.setText("Username:");

        txt_username.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        comboBox_roleMenu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        comboBox_roleMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Hospital Admin", "Doctor", "Patient", "Community Admin" }));
        comboBox_roleMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_roleMenuActionPerformed(evt);
            }
        });

        pass_password.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        pass_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_passwordActionPerformed(evt);
            }
        });

        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titlebox, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pass_password, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_role, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(comboBox_roleMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titlebox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_role, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_roleMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_roleMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_roleMenuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboBox_roleMenuActionPerformed

    private void pass_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_passwordActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        String role = comboBox_roleMenu.getSelectedItem().toString();
        if((role.equals("System Admin")) && (txt_username.getText().equals(""))  && (pass_password.getText().equals(""))){
            this.setVisible(false);
            SystemAdmin sa = new SystemAdmin(patientlist, doctorlist, encounterhistory, citylist, communitylist);
//            JOptionPane.showMessageDialog(this, "USER Credentials are correct!");
            sa.setVisible(true);
        }
        else if(role.equals("Community Admin") && (txt_username.getText().equals(""))  && (pass_password.getText().equals(""))){
            this.setVisible(false);
            CommunityAdminPage ca = new CommunityAdminPage(patientlist, doctorlist, encounterhistory, citylist, communitylist);
            ca.setVisible(true);        
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid Credentials");

        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(userLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> comboBox_roleMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField pass_password;
    private javax.swing.JLabel titlebox;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
