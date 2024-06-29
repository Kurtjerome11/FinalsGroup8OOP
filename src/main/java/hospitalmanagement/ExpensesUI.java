package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class ExpensesUI{
    private JFrame f1;
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, limg;
    private JTextField tfdate, tfdcptn, tfamnt, tfen;
    private JPanel p1; 
    private JButton bntback, bntadd, bntrmve;
    private JTable tbl;
    private DefaultTableModel tblm;
    private JScrollPane sp1;
    
    public ExpensesUI() {
        
        // Frame Settings
        f1 = new JFrame("Group8 OOP");
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.decode("#87CEEB"));
        
        // Label settings
        l1 = new JLabel("HOSPITAL EXPENSES");
        l1.setBounds(410, 0, 1000, 100);
        l1.setFont(new Font("Arial",Font.BOLD,35));
        l1.setForeground(Color.RED);
        
        l2 = new JLabel("List of Hospital Expenses:");
        l2.setBounds(100, 60, 1000, 100);
        l2.setFont(new Font("Arial",Font.BOLD,25));
        l2.setForeground(Color.BLACK);
        
        l4 = new JLabel("New Record:");
        l4.setBounds(750, 130, 200, 35);
        l4.setFont(new Font("Arial",Font.BOLD,25));
        l4.setForeground(Color.BLACK);
        
        l5 = new JLabel("Date:");
        l5.setBounds(750, 180, 200, 35);
        l5.setFont(new Font("Arial",Font.PLAIN,15));
        l5.setForeground(Color.BLACK);
        
        l6 = new JLabel("Description:");
        l6.setBounds(750, 250, 200, 35);
        l6.setFont(new Font("Arial",Font.PLAIN,15));
        l6.setForeground(Color.BLACK);
        
        l7 = new JLabel("Amount:");
        l7.setBounds(750, 320, 200, 35);
        l7.setFont(new Font("Arial",Font.PLAIN,15));
        l7.setForeground(Color.BLACK);
        
        l8 = new JLabel("Encoder Name:");
        l8.setBounds(750, 390, 200, 35);
        l8.setFont(new Font("Arial",Font.PLAIN,15));
        l8.setForeground(Color.BLACK);
        
        l3 = new JLabel();
        l3.setBounds(110, 20, 1000, 100);
                
        // Table settings 
        String[] columnNames = {"Date", "Description", "Amount", "Encoder"};
        tblm = new DefaultTableModel(columnNames, 0);
        tbl = new JTable(tblm);
        tbl.setBounds(585, 170, 550, 390);
       
        JScrollPane scrollPane = new JScrollPane(tbl);
        f1.add(scrollPane); 
        
        // This to costumize the column size
        TableColumn date = tbl.getColumnModel().getColumn(0);
        date.setPreferredWidth(50);
        
        TableColumn description = tbl.getColumnModel().getColumn(2);
        description.setPreferredWidth(50); 

        TableColumn amount = tbl.getColumnModel().getColumn(3);
        amount.setPreferredWidth(50);
        
        TableColumn encoder = tbl.getColumnModel().getColumn(3);
        encoder.setPreferredWidth(50);
        
        sp1 = new JScrollPane(tbl);
        sp1.setBounds(100, 130, 600, 420);
        
        // Textfields settings
        tfdate = new JTextField();
        tfdate.setBounds(750, 210, 200, 25);
        
        tfdcptn = new JTextField();
        tfdcptn.setBounds(750, 280, 200, 25);
        
        tfamnt = new JTextField();
        tfamnt.setBounds(750, 350, 200, 25);
        
        tfen = new JTextField();
        tfen.setBounds(750, 420, 200, 25);
        
        // Code for load image
        ImageIcon i1 = new ImageIcon("Images//Expenses.jpg");
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        
        // Label for the pic
        limg = new JLabel(i3);
        
        // Panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setBounds(-150, 90, 1500, 700);
        p1.setBackground(Color.BLACK);
        
        // Will add the label to the panel
        p1.add(limg);
        
        // Buttons settings
        bntback = new JButton("Back");
        bntback.setBounds(1060, 600, 80, 30);
        bntback.setFocusPainted(false);
        bntback.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                f1.dispose();
                new MainUi();
            }
        });
        
        bntadd = new JButton("Add Expense Record");
        bntadd.setBounds(750, 480, 200, 35);
        bntadd.setBackground(Color.ORANGE);
        bntadd.setForeground(Color.BLACK);
        bntadd.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
        bntadd.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        bntadd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bntadd.setFocusPainted(false);
        bntadd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                addexpense();
            }
        });
        
        bntrmve = new JButton("Delete Expense Record");
        bntrmve.setBounds(100, 570, 200, 35);
        bntrmve.setBackground(Color.PINK);
        bntrmve.setForeground(Color.BLACK);
        bntrmve.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
        bntrmve.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        bntrmve.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bntrmve.setFocusPainted(false);
        bntrmve.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                deleteexpense();
            }
        });
        
        // Add objects to the frame
        f1.add(l1);
        f1.add(l2);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(bntback);
        f1.add(bntadd);
        f1.add(bntrmve);
        f1.add(sp1);
        f1.add(p1);
        f1.add(tfdate);
        f1.add(tfdcptn);
        f1.add(tfamnt);
        f1.add(tfen);
        f1.add(l3);
        
        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void addexpense() 
    {
        String Date = tfdate.getText();
        String Description = tfdcptn.getText();
        String Amount = tfamnt.getText();
        String EncoderName = tfen.getText();
        if (Date.isEmpty() || Description.isEmpty() || Amount.isEmpty() || EncoderName.isEmpty()) 
        {
            JOptionPane.showMessageDialog(f1, "Please Fill In The Necessary Information!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tblm.addRow(new Object[]{Date, Description, Amount, EncoderName});

        // Clear input fields after adding
        tfdate.setText("");
        tfdcptn.setText("");
        tfamnt.setText("");
        tfen.setText("");
    }
    
    private void deleteexpense() 
    {
        int selectedRow = tbl.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(f1, "Select A Record To Delete!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tblm.removeRow(selectedRow);
    }
}