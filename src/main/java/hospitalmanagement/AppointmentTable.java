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
    private JTextField physicianField;
    private JTextField reasonField;
    private JTable table;
    private DefaultTableModel tableModel;

    public AppointmentTable() {
        setTitle("Appointment Management");
        setSize(1300, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Color lightBlue = new Color(173, 216, 230); 
        getContentPane().setBackground(lightBlue);

        nameField = new JTextField(20);
        ageField = new JTextField(20);
        genderField = new JTextField(20);
        dateField = new JTextField(20);
        timeField = new JTextField(20);
        contactField = new JTextField(20);
        physicianField = new JTextField(20);
        reasonField = new JTextField(20);
        JButton addButton = new JButton("ADD DATA");
        JButton deleteButton = new JButton("DELETE");
        JButton updateButton = new JButton("UPDATE");

        tableModel = new DefaultTableModel(
                new String[]{"Name", "Age", "Gender", "Date", "Time", "ContactNumber", "Physician", "Reason"}, 0);
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
        inputPanel.add(new JLabel("Name"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age"));
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Gender"));
        inputPanel.add(genderField);
        inputPanel.add(new JLabel("Date"));
        inputPanel.add(dateField);
        inputPanel.add(new JLabel("Time"));
        inputPanel.add(timeField);
        inputPanel.add(new JLabel("Contact"));
        inputPanel.add(contactField);
        inputPanel.add(new JLabel("Physician"));
        inputPanel.add(physicianField);
        inputPanel.add(new JLabel("Reason"));
        inputPanel.add(reasonField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addData() {
        String name = nameField.getText();
        String age = ageField.getText();
        String gender = genderField.getText();
        String date = dateField.getText();
        String time = timeField.getText();
        String contact = contactField.getText();
        String physician = physicianField.getText();
        String reason = reasonField.getText();
        tableModel.addRow(new Object[]{name, age, gender, date, time, contact, physician, reason});
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
            tableModel.setValueAt(physicianField.getText(), selectedRow, 6);
            tableModel.setValueAt(reasonField.getText(), selectedRow, 7);
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
        physicianField.setText("");
        reasonField.setText("");
    }

    void addAppointment(String name, String gender, String age, String date, String time, String contact, String address, String email, String physician, String reason) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
