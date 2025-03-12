/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motorph.v4;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KrisChan
 */
public class EmployeeDB extends javax.swing.JFrame {
    private static String username;
    private Employee loggedInEmployee;
    /**
     * Creates new form Employee
     */
    public EmployeeDB(String username) {
        this.username = username;
        initComponents();
        setLocationRelativeTo(null);
        loggedInEmployee = Database.getEmployeeDetails(username);

        if (loggedInEmployee == null) {
            JOptionPane.showMessageDialog(this, "Error: Employee not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        loadEmployeeDetails();
        loadEmployeeLeaveData(); 
}

    
    
    private void loadEmployeeDetails() {
    if (loggedInEmployee == null) {
        JOptionPane.showMessageDialog(this, "Error loading employee details. Employee not found.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    System.out.println("Loading details for: " + loggedInEmployee.getUsername()); // Debugging log

    lblEmployeeID.setText(loggedInEmployee.getEmployeeId());
    lblFullName.setText(loggedInEmployee.getFirstName() + " " + loggedInEmployee.getLastName());
    lblBirthday.setText(loggedInEmployee.getBirthDay() != null ? loggedInEmployee.getBirthDay() : "N/A");
    lblAddress.setText(loggedInEmployee.getAddress());
    lblPhone.setText(loggedInEmployee.getPhoneNumber());
    
    lblStatus.setText(loggedInEmployee.getStatus());
    lblPosition.setText(loggedInEmployee.getPosition());
    lblDepartment.setText(loggedInEmployee.getDepartment());
    lblSupervisor.setText(loggedInEmployee.getSupervisor());
    lblRate.setText(String.valueOf(loggedInEmployee.getHourlyRate()));
    lblBasicSalary.setText(String.valueOf(loggedInEmployee.getBasicSalary()));
    
    lblEmployeeID1.setText(loggedInEmployee.getEmployeeId());
}

    
    
    
    private void loadEmployeeLeaveData() {
    DefaultTableModel model = (DefaultTableModel) tblLeave.getModel();
    model.setRowCount(0); // Clear existing data

    if (loggedInEmployee == null) {
        JOptionPane.showMessageDialog(this, "Error loading employee details. Employee not found.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String employeeId = loggedInEmployee.getEmployeeId(); // Get the current employee ID
    ResultSet rs = Database.getEmployeeLeave(employeeId);

    try {
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("id"),
                rs.getString("employee_id"),
                rs.getString("leave_type"),
                rs.getString("start_date"),
                rs.getString("end_date"),
                rs.getString("status")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading leave requests: " + e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        btnEmpDetails = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnRequestLeave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        parentPanel = new javax.swing.JPanel();
        EmpDataPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSupervisor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblRate = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblBasicSalary = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        requestLeavePanel = new javax.swing.JPanel();
        lblEmployeeID1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLeave = new javax.swing.JTable();
        btnRequestLeaveProcess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Dashboard");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpDetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnEmpDetails.setText("Employee Details");
        btnEmpDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 40));

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 180, 40));

        btnRequestLeave.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRequestLeave.setText("Request Leave");
        btnRequestLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestLeaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRequestLeave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        parentPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentPanel.setLayout(new java.awt.CardLayout());

        EmpDataPanel.setBackground(new java.awt.Color(255, 255, 255));
        EmpDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Full Name:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 20));

        lblFullName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(0, 0, 0));
        lblFullName.setText("Fullname");
        lblFullName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 370, 20));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Birthday:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 70, 20));

        lblBirthday.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblBirthday.setForeground(new java.awt.Color(0, 0, 0));
        lblBirthday.setText("birthday");
        lblBirthday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 160, 20));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Address:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 20));

        lblAddress.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 0, 0));
        lblAddress.setText("address");
        lblAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 610, 20));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Phone:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 20));

        lblPhone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(0, 0, 0));
        lblPhone.setText("phone_number");
        lblPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, 20));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Status:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, 20));

        lblStatus.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 0, 0));
        lblStatus.setText("status");
        lblStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 140, 20));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("Deparment:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 80, 20));

        lblDepartment.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(0, 0, 0));
        lblDepartment.setText("department");
        lblDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 150, 20));

        lblPosition.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(0, 0, 0));
        lblPosition.setText("postion");
        lblPosition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 150, 20));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Position:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 60, 20));

        lblSupervisor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblSupervisor.setForeground(new java.awt.Color(0, 0, 0));
        lblSupervisor.setText("supervisor");
        lblSupervisor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 380, 20));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("Supervisor:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 20));

        EmpDataPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 720, 170));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblRate.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(lblRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 20));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 102));
        jLabel22.setText("Salary:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 20));

        lblBasicSalary.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblBasicSalary.setForeground(new java.awt.Color(0, 0, 0));
        lblBasicSalary.setText("salary");
        lblBasicSalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblBasicSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, 20));

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 102));
        jLabel23.setText("Rate:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 20));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Salary Details");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 20));

        EmpDataPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 720, 160));

        lblEmployeeID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(0, 0, 0));
        lblEmployeeID.setText("employee_id");
        EmpDataPanel.add(lblEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 20));

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 0, 153));
        jLabel21.setText("Employee ID:");
        EmpDataPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Basic Information");
        EmpDataPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 20));

        parentPanel.add(EmpDataPanel, "card2");

        requestLeavePanel.setBackground(new java.awt.Color(255, 255, 255));
        requestLeavePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmployeeID1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblEmployeeID1.setForeground(new java.awt.Color(0, 0, 0));
        lblEmployeeID1.setText("employee_id");
        requestLeavePanel.add(lblEmployeeID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 20));

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 153));
        jLabel24.setText("Leave Type:");
        requestLeavePanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 20));

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 153));
        jLabel25.setText("Employee ID:");
        requestLeavePanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 153));
        jLabel26.setText("Start Date:");
        requestLeavePanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));
        requestLeavePanel.add(lblEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 170, -1));
        requestLeavePanel.add(lblStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 170, -1));

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacation Leave", "Sick Leave", "Emergency Leave", "Maternity/Paternity Leave" }));
        requestLeavePanel.add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 170, -1));

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 0, 153));
        jLabel27.setText("End Date:");
        requestLeavePanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        tblLeave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Employee ID", "Leave Type", "Start Date", "End Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLeave);

        requestLeavePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 720, 310));

        btnRequestLeaveProcess.setText("Request Leave");
        btnRequestLeaveProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestLeaveProcessActionPerformed(evt);
            }
        });
        requestLeavePanel.add(btnRequestLeaveProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 160, 30));

        parentPanel.add(requestLeavePanel, "card3");

        getContentPane().add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 740, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpDetailsActionPerformed
        // TODO add your handling code here:
        parentPanel.removeAll();
        parentPanel.add(EmpDataPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_btnEmpDetailsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        dispose(); // Close current dashboard
        new LoginForm().setVisible(true); // Return to login screen
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRequestLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestLeaveActionPerformed
        // TODO add your handling code here:
        parentPanel.removeAll();
        parentPanel.add(requestLeavePanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        
    }//GEN-LAST:event_btnRequestLeaveActionPerformed

    private void btnRequestLeaveProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestLeaveProcessActionPerformed
        // TODO add your handling code here:
        String employee_id= loggedInEmployee.getEmployeeId();
        String start_date= lblStartDate.getText();
        String end_date= lblEndDate.getText();
        String id= employee_id+"-"+start_date+"-"+end_date;
        String status= "Pending";
        String leave_type= combobox.getSelectedItem().toString();
        
        
        if (start_date.isEmpty() || end_date.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Start Date and End date cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }try {
        boolean success = Database.requestLeave(id, employee_id, leave_type, start_date, end_date, status);

        if (success) {
            JOptionPane.showMessageDialog(this, "Leave Request submitted successfully!");
            loadEmployeeLeaveData(); 
        } else {
            JOptionPane.showMessageDialog(this, "Error Requesting Leave.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnRequestLeaveProcessActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDB(username).setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmpDataPanel;
    private javax.swing.JButton btnEmpDetails;
    private javax.swing.JButton btnRequestLeave;
    private javax.swing.JButton btnRequestLeaveProcess;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBasicSalary;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblEmployeeID1;
    private javax.swing.JTextField lblEndDate;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblRate;
    private javax.swing.JTextField lblStartDate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSupervisor;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel requestLeavePanel;
    private javax.swing.JTable tblLeave;
    // End of variables declaration//GEN-END:variables
}
