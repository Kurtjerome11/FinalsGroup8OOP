package hospitalmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppointmentTable extends JFrame {
    private JTextField nameField;
    private JTextField ageField;
    private JTextField genderField;
    private JTextField dateField;
    private JTextField timeField;
    private JTextField contactField;
    private JTextField addressField;                 
    private JTextField physicianField;
    private JTextField reasonField;
    private JTable table;
    private DefaultTableModel tableModel;

    public AppointmentTable() {
        setTitle("BOOK AN APPOINTMENT");
        setSize(1300, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Color lightBlue = new Color(173, 216, 230);
        Color buttonColor = new Color(100, 149, 237);
        Color inputColor = new Color(240, 248, 255);

        getContentPane().setBackground(lightBlue);

        nameField = new JTextField(20);
        ageField = new JTextField(20);
        genderField = new JTextField(20);
        dateField = new JTextField(20);
        timeField = new JTextField(20);
        contactField = new JTextField(20);
        addressField = new JTextField(20);
        physicianField = new JTextField(20);
        reasonField = new JTextField(20);

        nameField.setBackground(inputColor);
        ageField.setBackground(inputColor);
        genderField.setBackground(inputColor);
        dateField.setBackground(inputColor);
        timeField.setBackground(inputColor);
        contactField.setBackground(inputColor);
        addressField.setBackground(inputColor);
        physicianField.setBackground(inputColor);
        reasonField.setBackground(inputColor);

        JButton addButton = new JButton("ADD DATA");
        JButton deleteButton = new JButton("DELETE");
        JButton updateButton = new JButton("UPDATE");

        addButton.setBackground(buttonColor);
        deleteButton.setBackground(buttonColor);
        updateButton.setBackground(buttonColor);

        addButton.setForeground(Color.WHITE);
        deleteButton.setForeground(Color.WHITE);
        updateButton.setForeground(Color.WHITE);

        tableModel = new DefaultTableModel(
                new String[]{"Name", "Age", "Gender", "Date", "Time", "ContactNumber", "Address", "Physician", "Reason"}, 0);
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addData();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteData();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateData();
            }
        });

        JPanel inputPanel = new JPanel(new GridLayout(9, 2, 5, 5));
        inputPanel.setBackground(lightBlue);
        inputPanel.add(new JLabel("Full Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:"));
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Gender:"));
        inputPanel.add(genderField);
        inputPanel.add(new JLabel("Date:"));
        inputPanel.add(dateField);
        inputPanel.add(new JLabel("Time:"));
        inputPanel.add(timeField);
        inputPanel.add(new JLabel("Contact Number:"));
        inputPanel.add(contactField);
        inputPanel.add(new JLabel("Adddress:"));
        inputPanel.add(addressField);
        inputPanel.add(new JLabel("Preferred Physician:"));
        inputPanel.add(physicianField);
        inputPanel.add(new JLabel("Reason for Appointment:"));
        inputPanel.add(reasonField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(lightBlue);
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);

        JPanel paddingPanel = new JPanel();
        paddingPanel.setPreferredSize(new Dimension(0, 20)); // Add vertical padding
        paddingPanel.setBackground(lightBlue);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);
        add(paddingPanel, BorderLayout.SOUTH); // Add padding panel
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addData() {
        String name = nameField.getText();
        String age = ageField.getText();
        String gender = genderField.getText();
        String date = dateField.getText();
        String time = timeField.getText();
        String contact = contactField.getText();
        String address = addressField.getText();
        String physician = physicianField.getText();
        String reason = reasonField.getText();
        tableModel.addRow(new Object[]{name, age, gender, date, time, contact, address, physician, reason});
        clearFields();
    }

    private void deleteData() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }

    private void updateData() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            tableModel.setValueAt(nameField.getText(), selectedRow, 0);
            tableModel.setValueAt(ageField.getText(), selectedRow, 1);
            tableModel.setValueAt(genderField.getText(), selectedRow, 2);
            tableModel.setValueAt(dateField.getText(), selectedRow, 3);
            tableModel.setValueAt(timeField.getText(), selectedRow, 4);
            tableModel.setValueAt(contactField.getText(), selectedRow, 5);
            tableModel.setValueAt(addressField.getText(), selectedRow, 6);
            tableModel.setValueAt(physicianField.getText(), selectedRow, 7);
            tableModel.setValueAt(reasonField.getText(), selectedRow, 8);
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
    }

    private void clearFields() {
        nameField.setText("");
        ageField.setText("");
        genderField.setText("");
        dateField.setText("");
        timeField.setText("");
        contactField.setText("");
        addressField.setText("");
        physicianField.setText("");
        reasonField.setText("");
    }

    void addAppointment(String name, String gender, String age, String date, String time, String contact, String address, String email, String physician, String reason) {
        // Method implementation here if needed
    
    }
}
