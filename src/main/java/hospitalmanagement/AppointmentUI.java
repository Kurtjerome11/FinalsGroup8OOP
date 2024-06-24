package hospitalmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppointmentUI {
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, limg;
    private JPanel p1;
    private JButton b1, b2, b3;
    private JTextField tName, tAge, tGender, tDate, tTime, tContact, tEmail, tAddress, tPreferredPhysician, tReason;

    AppointmentUI() {
        // Frame settings
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.decode("#1f67ba"));

        // Label settings
        l1 = new JLabel("BOOK AN APPOINTMENT");
        l1.setBounds(380, 0, 1000, 100);
        l1.setFont(new Font("Cambria", Font.BOLD, 35));
        l1.setForeground(Color.WHITE);

        l4 = new JLabel("______________________________________________________________________________");
        l4.setBounds(0, 28, 2000, 100);
        l4.setFont(new Font("Arial", Font.BOLD, 30));
        l4.setForeground(Color.WHITE);

        l3 = new JLabel("");
        l3.setBounds(40, 80, 1000, 100);
        l3.setFont(new Font("DM Serif Display", Font.BOLD, 30));
        l3.setForeground(Color.WHITE);
        l3.setHorizontalAlignment(SwingConstants.CENTER);

        l5 = new JLabel("Name:");
        l5.setBounds(40, 180, 100, 25);
        l5.setFont(new Font("Aptos", Font.PLAIN, 15));
        l5.setForeground(Color.WHITE);

        l6 = new JLabel("Age:");
        l6.setBounds(40, 220, 100, 25);
        l6.setFont(new Font("Aptos", Font.PLAIN, 15));
        l6.setForeground(Color.WHITE);

        l7 = new JLabel("Gender:");
        l7.setBounds(40, 260, 100, 25);
        l7.setFont(new Font("Aptos", Font.PLAIN, 15));
        l7.setForeground(Color.WHITE);

        l8 = new JLabel("Date: ");
        l8.setBounds(40, 300, 100, 25);
        l8.setFont(new Font("Aptos", Font.PLAIN, 15));
        l8.setForeground(Color.WHITE);

        l9 = new JLabel("Time:");
        l9.setBounds(400, 180, 100, 25);
        l9.setFont(new Font("Aptos", Font.PLAIN, 15));
        l9.setForeground(Color.WHITE);

        l10 = new JLabel("Address:");
        l10.setBounds(40, 340, 100, 25);
        l10.setFont(new Font("Aptos", Font.PLAIN, 15));
        l10.setForeground(Color.WHITE);

        l11 = new JLabel("Email:");
        l11.setBounds(40, 380, 100, 25);
        l11.setFont(new Font("Aptos", Font.PLAIN, 15));
        l11.setForeground(Color.WHITE);

        l12 = new JLabel("Contact No:");
        l12.setBounds(400, 220, 100, 25);
        l12.setFont(new Font("Aptos", Font.PLAIN, 15));
        l12.setForeground(Color.WHITE);

        l13 = new JLabel("Preferred Physician:");
        l13.setBounds(400, 260, 150, 25);
        l13.setFont(new Font("Aptos", Font.PLAIN, 15));
        l13.setForeground(Color.WHITE);

        l14 = new JLabel("Reason for Appointment:");
        l14.setBounds(370, 300, 180, 25);
        l14.setFont(new Font("Aptos", Font.PLAIN, 15));
        l14.setForeground(Color.WHITE);

        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);

        // Load image
        ImageIcon i1 = new ImageIcon("Images/hospi.png");
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        // Label for the pic
        limg = new JLabel(i3);

        // Panel for image on the UI and its settings
        p1 = new JPanel();
        p1.setBounds(-150, 90, 1500, 700);
        p1.setBackground(Color.BLACK);

        // Add the label to the panel
        p1.add(limg);

        // TextFields and their settings
        tName = new JTextField();
        tName.setBounds(140, 180, 150, 25);

        tAge = new JTextField();
        tAge.setBounds(140, 220, 150, 25);

        tGender = new JTextField();
        tGender.setBounds(140, 260, 150, 25);

        tDate = new JTextField();
        tDate.setBounds(140, 300, 150, 25);

        tTime = new JTextField();
        tTime.setBounds(550, 180, 400, 25);

        tContact = new JTextField();
        tContact.setBounds(550, 220, 400, 25);

        tAddress = new JTextField();
        tAddress.setBounds(140, 340, 150, 25);

        tEmail = new JTextField();
        tEmail.setBounds(140, 380, 150, 25);

        tPreferredPhysician = new JTextField();
        tPreferredPhysician.setBounds(550, 260, 400, 25);

        tReason = new JTextField();
        tReason.setBounds(550, 300, 400, 200);

        // Buttons and their settings
        b1 = new JButton("Save Appointment");
        b1.setBounds(70, 500, 150, 40);
        
        b2 = new JButton("Back");
        b2.setBounds(1060, 600, 80, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MainUi();
            }
        });
        
        b3 = new JButton("Pending Appointments");
        b3.setBounds(270, 500, 180, 40);


        f1.add(l1);
        f1.add(l4);
        f1.add(l3);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(l10);
        f1.add(l11);
        f1.add(l12);
        f1.add(l13);
        f1.add(l14);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(p1);
        f1.add(tName);
        f1.add(tAge);
        f1.add(tGender);
        f1.add(tDate);
        f1.add(tTime);
        f1.add(tContact);
        f1.add(tEmail);
        f1.add(tAddress);
        f1.add(tPreferredPhysician);
        f1.add(tReason);
        f1.add(l2);

        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
