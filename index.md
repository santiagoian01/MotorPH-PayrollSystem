# MotorPH Payroll System

Welcome to the official documentation for the MotorPH Payroll System. This platform is designed for efficient payroll processing, leave management, and employee record handling. Developed as part of a collaborative project, this system ensures secure, accurate, and streamlined HR operations.

---

## Group 12 – Development Team

| Name                      | Email                                      |
|---------------------------|--------------------------------------------|
| Christian Noel Busalanan  | lr.cnbusalanan@mmdc.mcl.edu.ph             |
| Claude Derick Gigante     | lr.cdgigante@mmdc.mcl.edu.ph               |
| Ian Federico Santiago     | lr.ifsantiago@mmdc.mcl.edu.ph              |
| James Earl Teriales       | lr.jeteriales@mmdc.mcl.edu.ph              |
| Joshua Ricohermozo        | lr.jricohermozo@mmdc.mcl.edu.ph            |
| Kimberly Guevara          | lr.kguevara@mmdc.mcl.edu.ph                |
| Ratherford Abaya          | lr.rabaya@mmdc.mcl.edu.ph                  |

---

## Project Overview

The MotorPH Payroll System is a desktop-based application tailored for HR operations at MotorPH. It provides functionalities for:

- Secure Login for employees and HR
- Leave Request Management
- Employee Data Management (CRUD)
- Accurate Payroll Processing with Deduction Calculations

---

## Features

### 1. Secure Login
- User authentication via login credentials
- Error handling for invalid login attempts

### 2. Employee Leave Management
- Submit leave requests (Vacation, Sick, Emergency, Maternity/Paternity)
- View leave history
- HR approval or rejection functionality

### 3. HR Manager Duties
- Create, read, update, delete (CRUD) employee records
- Review and manage leave requests

### 4. Payroll Processing
- Calculate salaries including deductions (SSS, PhilHealth, TIN, Pag-IBIG)
- Generate payslips
- Store payroll records

---

## Test Cases

| Scenario                            | Test Case ID | Test Description                                                  | Steps                                                                                      | Expected Result                                                | Actual Result                                                  | Test Result |
|------------------------------------|--------------|-------------------------------------------------------------------|--------------------------------------------------------------------------------------------|----------------------------------------------------------------|----------------------------------------------------------------|-------------|
| **Login Functionality**            | 1            | Launch Payroll System                                             | Run HRManagerDB class                                                                      | Redirect to Login Tab                                          | Redirect to Login Tab                                          | Pass        |
|                                    | 2            | Login with valid credentials                                      | Enter valid username and password, click Login                                            | Redirect to dashboard                                          | Redirect to dashboard                                          | Pass        |
|                                    | 3            | Login with invalid credentials                                    | Enter invalid credentials, click Login                                                    | Error message shown                                            | Error message shown                                            | Pass        |
| **Employee Leave Request**         | 4            | Access Leave Request page                                         | Login → Employee Dashboard → Leave Request page                                           | Leave request page shown                                       | Leave request page shown                                       | Pass        |
|                                    | 5            | Submit Leave Request                                              | Input start/end date, select leave type, submit                                           | Leave request submitted successfully                           | Leave request submitted successfully                           | Pass        |
|                                    | 6            | View recent leave requests                                        | Submit leave → Notification → View updated history                                        | Most recent request at top                                     | Most recent request at top                                     | Pass        |
| **HR Manager Duties**              | 7            | View Employee Details                                             | HR Dashboard → Click “Employee Details”                                                   | Employee details displayed                                     | Employee details displayed                                     | Pass        |
|                                    | 8            | Create, Update, Delete Employee Records                           | Fill form → Click Save/Update/Delete → Confirm                                            | Action completed (added/updated/deleted) successfully          | Action completed successfully                                  | Pass        |
|                                    | 9            | Approve/Reject Leave Requests                                     | Enter employee number → Status (Pending/Approved/Rejected) → Click “Update”               | Leave request updated                                          | Leave request updated                                          | Pass        |
| **Payroll Processing**             | 10           | Access Payroll Dashboard                                          | Login as HR/Admin → Click Process Payroll                                                 | Routed to payroll page                                         | Routed to payroll page                                         | Pass        |
|                                    | 11           | Process Payroll                                                   | Input hours, overtime, deductions → Click Calculate → Click Process Payroll               | Payroll processed successfully                                 | Payroll processed successfully                                 | Pass        |
|                                    | 12           | View Processed Payslip                                            | Process payroll → Confirmation → Review latest payslip                                    | Most recent payslip visible                                    | Most recent payslip visible                                    | Pass        |

---

## How to Use

1. Clone the repository from GitHub  
2. Compile the project using any Java IDE or via command line  
3. Launch the application and log in with valid credentials  
4. Access respective modules: Leave, Employee Management, Payroll  

---

## Naming Convention

**Filename for Submission:**  
`MO-IT110 MotorPH Payroll System Documentation A1101 Busalanan, C.`

---

Thank you for visiting our documentation! For any concerns or technical support, feel free to contact any group member.

