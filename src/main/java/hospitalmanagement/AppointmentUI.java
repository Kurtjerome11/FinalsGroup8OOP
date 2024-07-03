package hospitalmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AppointmentUI extends JFrame {
    private JTextField tName, tAge, tGender, tDateofBirth, tLast, tContact, tEmail, tAddress, tDate, tTime, tReason;
    private JTable table;
    private DefaultTableModel tableModel;

    public AppointmentUI() {
        setTitle("Hospital Management System");
        setSize(1300, 730); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        JLabel background = new JLabel(new ImageIcon("Images/hospi.png"));
        background.setBounds(0, 0, 1300, 800); 
        background.setLayout(null);

      
        JLabel l1 = new JLabel("BOOK AN APPOINTMENT");
        l1.setBounds(500, 20, 400, 35);
        l1.setFont(new Font("Cambria", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);

        JLabel l5 = new JLabel("Patient ID:");
        l5.setBounds(50, 80, 100, 25);
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.WHITE);

        JLabel l6 = new JLabel("Age:");
        l6.setBounds(50, 120, 100, 25);
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.WHITE);

        JLabel l7 = new JLabel("Gender:");
        l7.setBounds(50, 160, 100, 25);
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.WHITE);

        JLabel l8 = new JLabel("Date of Birth:");
        l8.setBounds(50, 200, 100, 25);
        l8.setFont(new Font("Arial", Font.PLAIN, 15));
        l8.setForeground(Color.WHITE);

        JLabel l9 = new JLabel("Name:");
        l9.setBounds(450, 80, 100, 25);
        l9.setFont(new Font("Arial", Font.PLAIN, 15));
        l9.setForeground(Color.WHITE);

        JLabel l10 = new JLabel("Address:");
        l10.setBounds(450, 120, 100, 25);
        l10.setFont(new Font("Arial", Font.PLAIN, 15));
        l10.setForeground(Color.WHITE);

        JLabel l11 = new JLabel("Email:");
        l11.setBounds(450, 160, 100, 25);
        l11.setFont(new Font("Arial", Font.PLAIN, 15));
        l11.setForeground(Color.WHITE);

        JLabel l12 = new JLabel("Contact No:");
        l12.setBounds(450, 200, 100, 25);
        l12.setFont(new Font("Arial", Font.PLAIN, 15));
        l12.setForeground(Color.WHITE);

        JLabel l13 = new JLabel("Date:");
        l13.setBounds(870, 80, 100, 25);
        l13.setFont(new Font("Arial", Font.PLAIN, 15));
        l13.setForeground(Color.WHITE);

        JLabel l14 = new JLabel("Time:");
        l14.setBounds(870, 120, 100, 25);
        l14.setFont(new Font("Arial", Font.PLAIN, 15));
        l14.setForeground(Color.WHITE);

        JLabel l15 = new JLabel("Reason:");
        l15.setBounds(870, 160, 100, 25);
        l15.setFont(new Font("Arial", Font.PLAIN, 15));
        l15.setForeground(Color.WHITE);

        // Text fields
        tName = new JTextField();
        tName.setBounds(150, 80, 200, 25);

        tAge = new JTextField();
        tAge.setBounds(150, 120, 200, 25);

        tGender = new JTextField();
        tGender.setBounds(150, 160, 200, 25);

        tDateofBirth = new JTextField();
        tDateofBirth.setBounds(150, 200, 200, 25);

        tLast = new JTextField();
        tLast.setBounds(550, 80, 300, 25);

        tAddress = new JTextField();
        tAddress.setBounds(550, 120, 300, 25);

        tEmail = new JTextField();
        tEmail.setBounds(550, 160, 300, 25);

        tContact = new JTextField();
        tContact.setBounds(550, 200, 300, 25);

        tDate = new JTextField();
        tDate.setBounds(950, 80, 200, 25);

        tTime = new JTextField();
        tTime.setBounds(950, 120, 200, 25);

        tReason = new JTextField();
        tReason.setBounds(950, 160, 200, 80);

        // Buttons
        JButton b1 = new JButton("ADD");
        b1.setBounds(450, 250, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addAppointment();
                String name = tName.getText();
                String lastName = tLast.getText();
                String gender = tGender.getText();
                String dateofBirth = tDateofBirth.getText();
                String age = tAge.getText();
                String address = tAddress.getText();
                String email = tEmail.getText();
                String contact = tContact.getText();
                String date = tDate.getText();
                String time = tTime.getText();
                String reason = tReason.getText();
                
                
                try {
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                        String query = "INSERT INTO appointment (name1, lname, gender ,dateofb,age,add1,ema,cont,date1,time1,reason) Values('" + name + "','" + lastName + "','" + gender + "','" +
                                dateofBirth + "','" + age + "','" + address + "','"+email+"','"+contact+"','"+date+"','"+time+"','"+reason+"')";
                        
                        Statement sta = connection.createStatement();
                        int x = sta.executeUpdate(query);
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
                clearFields();
            }
        });

        JButton bDelete = new JButton("DELETE");
        bDelete.setBounds(570, 250, 100, 30);
        bDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteAppointment();
            }
        });

        JButton bUpdate = new JButton("UPDATE");
        bUpdate.setBounds(690, 250, 100, 30);
        bUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAppointment();
            }
        });

        JButton bBack = new JButton("BACK"); 
        bBack.setBounds(1150, 620, 100, 30); 
        bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                dispose(); 
                new MainUi();
            }
        });

     
        tableModel = new DefaultTableModel(
                new String[]{"Patient ID", "Last Name", "Gender", "Date of Birth", "Age", "Contact No", "Address", "Email", "Date", "Time", "Reason"}, 0);
        table = new JTable(tableModel); 
        table.setGridColor(Color.GRAY); 
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setBounds(50, 320, 1200, 260); 
        
        try {
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                        String query = "select * from appointment" ;
                        
                        Statement sta = connection.createStatement();
                        ResultSet rs = sta.executeQuery(query);
                        
                        while(rs.next()){
                            
                            
                            String name = rs.getString("name1");
                            String lastName = rs.getString("lname");
                            String gender = rs.getString("gender");
                            String dateofBirth = rs.getString("dateofb");
                            String age = rs.getString("age");
                            String address = rs.getString("add1");
                            String email = rs.getString("ema");
                            String contact = rs.getString("cont");
                            String date = rs.getString("date1");
                            String time = rs.getString("time1");
                            String reason = rs.getString("reason");
                            
                            String tbData[] = {name,lastName,gender,dateofBirth,age,address,email,contact,date,time,reason};
                            tableModel.addRow(tbData);
                            
                        }
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
        
        
        
        


        background.add(l1);
        background.add(l5);
        background.add(l6);
        background.add(l7);
        background.add(l8);
        background.add(l9);
        background.add(l10);
        background.add(l11);
        background.add(l12);
        background.add(l13);
        background.add(l14);
        background.add(l15);
        background.add(tName);
        background.add(tLast);
        background.add(tGender);
        background.add(tDateofBirth);
        background.add(tAge);
        background.add(tAddress);
        background.add(tEmail);
        background.add(tContact);
        background.add(tDate);
        background.add(tTime);
        background.add(tReason);
        background.add(b1);
        background.add(bDelete);
        background.add(bUpdate);
        background.add(bBack); 
        background.add(tableScrollPane);

      
        setContentPane(background);

        setVisible(true);
    }

    private void addAppointment() {
        String name = tName.getText();
        String lastName = tLast.getText();
        String gender = tGender.getText();
        String dateofBirth = tDateofBirth.getText();
        String age = tAge.getText();
        String address = tAddress.getText();
        String email = tEmail.getText();
        String contact = tContact.getText();
        String date = tDate.getText();
        String time = tTime.getText();
        String reason = tReason.getText();

        tableModel.addRow(new Object[]{name, lastName, gender, dateofBirth, age, address, email, contact, date, time, reason});
    }

 
    private void deleteAppointment() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a appointment to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = (String) tableModel.getValueAt(selectedRow, 0);

        try {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                String query = "DELETE FROM appointment WHERE name1='" + name + "'";
                Statement sta = connection.createStatement();
                int x = sta.executeUpdate(query);

                if (x == 1) {
                    tableModel.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(this, "Appointment deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error deleting Appointment", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

   
    private void updateAppointment() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select appointment to edit", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = tName.getText();
        String lastName = tLast.getText();
        String gender = tGender.getText();
        String dateofBirth = tDateofBirth.getText();
        String age = tAge.getText();
        String address = tAddress.getText();
        String email = tEmail.getText();
        String contact = tContact.getText();
        String date = tDate.getText();
        String time = tTime.getText();
        String reason = tReason.getText();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11");
            Statement sta = connection.createStatement();
            int x = 0;

            if (!lastName.isEmpty()) {
                String query = "UPDATE appointment SET lname='" + lastName + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(lastName, selectedRow, 1);
            }

            if (!gender.isEmpty()) {
                String query = "UPDATE appointment SET gender='" + gender + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(gender, selectedRow, 2);
            }

            if (!dateofBirth.isEmpty()) {
                String query = "UPDATE appointment SET dateofb='" + dateofBirth + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(dateofBirth, selectedRow, 3);
            }

            if (!age.isEmpty()) {
                String query = "UPDATE appointment SET age='" + age + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(age, selectedRow, 4);
            }

            if (!address.isEmpty()) {
                String query = "UPDATE appointment SET add1='" + address + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(address, selectedRow, 5);
            }
            
            if (!email.isEmpty()) {
                String query = "UPDATE appointment SET ema='" + email + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(email, selectedRow, 6);
            }
            
            if (!contact.isEmpty()) {
                String query = "UPDATE appointment SET cont='" + contact + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(contact, selectedRow,7);
            }
            
            if (!date.isEmpty()) {
                String query = "UPDATE appointment SET date1='" + date + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(date, selectedRow, 8);
            }
            
            if (!time.isEmpty()) {
                String query = "UPDATE appointment SET time1='" + time + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(time, selectedRow, 9);
            }
            
            if (!reason.isEmpty()) {
                String query = "UPDATE appointment SET reason='" + reason + "' WHERE name1='" + name + "'";
                x += sta.executeUpdate(query);
                tableModel.setValueAt(reason, selectedRow, 10);
            }

            if (x > 0) {
                JOptionPane.showMessageDialog(this, "Appointment updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No changes made to the appointment", "Info", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


    private void clearFields() {
        tName.setText("");
        tLast.setText("");
        tGender.setText("");
        tDateofBirth.setText("");
        tAge.setText("");
        tAddress.setText("");
        tEmail.setText("");
        tContact.setText("");
        tDate.setText("");
        tTime.setText("");
        tReason.setText("");
    } 
}