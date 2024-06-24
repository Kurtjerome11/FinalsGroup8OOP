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
    private JTextField tfd, td, ta, te;
    private JPanel p1; 
    private JButton b1, b2, b3;
    private JTable tbl;
    private DefaultTableModel tblm;
    private JScrollPane sp1;
    private JTextArea ta1, ta2;
    
    public ExpensesUI() {
        //Frame Settings
        f1 = new JFrame("Group8 OOP");
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.LIGHT_GRAY);
        
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
                
        // Table and its settings
        String[] columnNames = {"Date","Description","Amount","Encoder"};
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
        
        //textfields and its settings
        tfd = new JTextField();
        tfd.setBounds(750, 210, 200, 25);
        
        td = new JTextField();
        td.setBounds(750, 280, 200, 25);
        
        ta = new JTextField();
        ta.setBounds(750, 350, 200, 25);
        
        te = new JTextField();
        te.setBounds(750, 420, 200, 25);
        
        //TextArea for bigger Textfields
        ta1 = new JTextArea();
        ta1.setBounds(300, 210, 240, 115);
        
        ta2 = new JTextArea();
        ta2.setBounds(300, 400, 240, 115);
        
        //code for load image
        ImageIcon i1 = new ImageIcon("Images//expenses.jpg");
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        
        //label for the pic
        limg = new JLabel(i3);
        
        //panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setBounds(-150, 90, 1500, 700);
        p1.setBackground(Color.BLACK);
        
        //will add the label to the panel
        p1.add(limg);
        
        //Buttons settings
        b1 = new JButton("Back");
        b1.setBounds(1060, 600, 80, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MainUi();
            }
        });
        
        b2 = new JButton("Add Expense Record");
        b2.setBounds(750, 480, 200, 35);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorderPainted(false);
        
        b3 = new JButton("Delete Expense Record");
        b3.setBounds(100, 570, 200, 35);
        b3.setBackground(Color.PINK);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorderPainted(false);
        
        // Add objects to the frame
        f1.add(l1);
        f1.add(l2);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(sp1);
        f1.add(p1);
        f1.add(tfd);
        f1.add(td);
        f1.add(ta);
        f1.add(te);
        f1.add(l3);
        f1.add(ta1);
        f1.add(ta2);
        
        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}