package hospitalmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        l1.setBounds((getWidth() - 400) / 2, 20, 400, 35);
        l1.setFont(new Font("Cambria", Font.BOLD, 25));
        l1.setForeground(Color.WHITE);

        JLabel l5 = new JLabel("First Name:");
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

        JLabel l9 = new JLabel("Last Name:");
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
        tReason.setBounds(950, 160, 200, 25);

        // Buttons
        JButton b1 = new JButton("ADD");
        b1.setBounds(450, 250, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addAppointment();
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

        JButton bUpdate = new JButton("EDIT");
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
                new String[]{"First Name", "Last Name", "Gender", "Date of Birth", "Age", "Contact No", "Address", "Email", "Date", "Time", "Reason"}, 0);
        table = new JTable(tableModel);
        table.setBackground(new Color(173, 216, 230)); 
        table.setGridColor(Color.GRAY); 
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setBounds(50, 320, 1200, 260); 


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

        tableModel.addRow(new Object[]{name, lastName, gender, dateofBirth, age, contact, address, email, date, time, reason});
        clearFields();
    }

 
    private void deleteAppointment() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }

   
    private void updateAppointment() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            tableModel.setValueAt(tName.getText(), selectedRow, 0);
            tableModel.setValueAt(tLast.getText(), selectedRow, 1);
            tableModel.setValueAt(tGender.getText(), selectedRow, 2);
            tableModel.setValueAt(tDateofBirth.getText(), selectedRow, 3);
            tableModel.setValueAt(tAge.getText(), selectedRow, 4);
            tableModel.setValueAt(tContact.getText(), selectedRow, 5);
            tableModel.setValueAt(tAddress.getText(), selectedRow, 6);
            tableModel.setValueAt(tEmail.getText(), selectedRow, 7);
            tableModel.setValueAt(tDate.getText(), selectedRow, 8);
            tableModel.setValueAt(tTime.getText(), selectedRow, 9);
            tableModel.setValueAt(tReason.getText(), selectedRow, 10);
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
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