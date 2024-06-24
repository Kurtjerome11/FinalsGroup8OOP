package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ManageUI{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, limg;
    private JPanel p1;
    private JButton b1,b2,b3;
    private JTextField tID, tName, tAge, tGender, tDate;
    private JTextArea tMed, tPres;
    private JTable lpatient;
    private DefaultTableModel ltpatient;
    private JScrollPane sp1;

    ManageUI() {
        // Frame settings
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.decode("#1f67ba"));

        // Label settings
        l1 = new JLabel("Manage Patient's Information");
        l1.setBounds(360, 0, 1000, 100);
        l1.setFont(new Font("Cambria", Font.BOLD, 35));
        l1.setForeground(Color.WHITE);

        l4 = new JLabel("______________________________________________________________________________");
        l4.setBounds(0, 28, 2000, 100);
        l4.setFont(new Font("Arial", Font.BOLD, 30));
        l4.setForeground(Color.WHITE);

        l3 = new JLabel("Please fill up the Patient's Information:");
        l3.setBounds(40, 80, 1000, 100);
        l3.setFont(new Font("Aptos", Font.PLAIN, 20));
        l3.setForeground(Color.CYAN);

        l5 = new JLabel("Patient ID:");
        l5.setBounds(40, 140, 1000, 100);
        l5.setFont(new Font("Aptos", Font.PLAIN, 15));
        l5.setForeground(Color.CYAN);

        l6 = new JLabel("Name:");
        l6.setBounds(40, 230, 1000, 100);
        l6.setFont(new Font("Aptos", Font.PLAIN, 15));
        l6.setForeground(Color.CYAN);

        l7 = new JLabel("Age:");
        l7.setBounds(40, 320, 1000, 100);
        l7.setFont(new Font("Aptos", Font.PLAIN, 15));
        l7.setForeground(Color.CYAN);

        l8 = new JLabel("Gender: (M/F or Others)");
        l8.setBounds(40, 410, 1000, 100);
        l8.setFont(new Font("Aptos", Font.PLAIN, 15));
        l8.setForeground(Color.CYAN);

        l9 = new JLabel("Date of Admission:");
        l9.setBounds(40, 500, 1000, 100);
        l9.setFont(new Font("Aptos", Font.PLAIN, 15));
        l9.setForeground(Color.CYAN);

        l10 = new JLabel("Medical History:");
        l10.setBounds(300, 140, 1000, 100);
        l10.setFont(new Font("Aptos", Font.PLAIN, 15));
        l10.setForeground(Color.CYAN);

        l11 = new JLabel("Prescriptions:");
        l11.setBounds(300, 330, 1000, 100);
        l11.setFont(new Font("Aptos", Font.PLAIN, 15));
        l11.setForeground(Color.CYAN);

        l12 = new JLabel("List of Patients:");
        l12.setBounds(585, 80, 1000, 100);
        l12.setFont(new Font("Aptos", Font.PLAIN, 20));
        l12.setForeground(Color.CYAN);

        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);

        // Table and its settings
        String[] columnNames = {"Patient ID", "Name", "Age", "Gender", "Date of Admit", "Medical H.", "Prescriptions"};
        ltpatient = new DefaultTableModel(columnNames, 0);
        lpatient = new JTable(ltpatient);
        lpatient.setBounds(585, 170, 550, 390);

        // This to customize the column size
        TableColumn id = lpatient.getColumnModel().getColumn(0);
        id.setPreferredWidth(50);

        TableColumn age = lpatient.getColumnModel().getColumn(2);
        age.setPreferredWidth(40);

        TableColumn gender = lpatient.getColumnModel().getColumn(3);
        gender.setPreferredWidth(50);

        sp1 = new JScrollPane(lpatient);
        sp1.setBounds(585, 170, 550, 390);

        // Text fields and its settings
        tID = new JTextField();
        tID.setBounds(40, 210, 200, 25);

        tName = new JTextField();
        tName.setBounds(40, 300, 200, 25);

        tAge = new JTextField();
        tAge.setBounds(40, 390, 200, 25);

        tGender = new JTextField();
        tGender.setBounds(40, 480, 200, 25);

        tDate = new JTextField();
        tDate.setBounds(40, 570, 200, 25);

        // TextArea for bigger text fields
        tMed = new JTextArea();
        tMed.setBounds(300, 210, 240, 115);

        tPres = new JTextArea();
        tPres.setBounds(300, 400, 240, 115);

        // Code for loading image
        ImageIcon i1 = new ImageIcon("Images/man.jpg");
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        // Label for the picture
        limg = new JLabel(i3);

        // Panel for image on the UI and its settings
        p1 = new JPanel();
        p1.setBounds(-150, 90, 1500, 700);
        p1.setBackground(Color.BLACK);

        // Will add the label to the panel
        p1.add(limg);

        // Buttons and their settings
        b1 = new JButton("Back");
        b1.setBounds(1060, 600, 80, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MainUi();
            }
        });

        b2 = new JButton("Add Patient");
        b2.setBounds(300, 550, 115, 35);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addPatient();
            }
        });

        b3 = new JButton("Delete Patient");
        b3.setBounds(425, 550, 115, 35);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletePatient();
            }
        });

        // Add objects to the frame
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
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(sp1);
        f1.add(tMed);
        f1.add(tPres);
        f1.add(p1);
        f1.add(tID);
        f1.add(tName);
        f1.add(tAge);
        f1.add(tGender);
        f1.add(tDate);
        f1.add(l2);

        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addPatient() {
        String id = tID.getText();
        String name = tName.getText();
        String age = tAge.getText();
        String gender = tGender.getText();
        String date = tDate.getText();
        String medHistory = tMed.getText();
        String prescriptions = tPres.getText();

        if (id.isEmpty() || name.isEmpty() || age.isEmpty() || gender.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(f1, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ltpatient.addRow(new Object[]{id, name, age, gender, date, medHistory, prescriptions});

        // Clear input fields after adding
        tID.setText("");
        tName.setText("");
        tAge.setText("");
        tGender.setText("");
        tDate.setText("");
        tMed.setText("");
        tPres.setText("");
    }

    private void deletePatient() {
        int selectedRow = lpatient.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(f1, "Please select a patient to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ltpatient.removeRow(selectedRow);
    }

    
}
