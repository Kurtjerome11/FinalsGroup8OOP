package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUi{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l4, l5, limg;
    private JButton b1, b2, b3, b4, b5, b6, b7; 
    private JPanel p1;
    

    MainUi() {
        // Frame settings
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.BLACK);
        
        // Label settings
        l1 = new JLabel("What do you want to do?");
        l1.setBounds(40, 0, 1000, 100);
        l1.setFont(new Font("Cambria",Font.PLAIN,35));
        l1.setForeground(Color.BLACK);
        
        l4 = new JLabel("______________________________________________________________________________");
        l4.setBounds(0, 30, 2000, 100);
        l4.setFont(new Font("Arial",Font.PLAIN,30));
        l4.setForeground(Color.BLACK);
        
        l5 = new JLabel("______________________________________________________________________________");
        l5.setBounds(0, 510, 2000, 100);
        l5.setFont(new Font("Arial",Font.PLAIN,30));
        l5.setForeground(Color.BLACK);
        
        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);
        
        //buttons and its settings
        b1 = new JButton("Manage Patients Information");
        b1.setBounds(100, 175, 250, 100);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 f1.dispose();
                 new ManageUI();
                } 
        });
        
        b2 = new JButton("Hospital's Inventory");
        b2.setBounds(830, 175, 250, 100);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new InventoryUI();
                
            }
        });
        
        b3 = new JButton("Reports");
        b3.setBounds(100, 400, 250, 90);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new ReportUI();
                
            }
        });
        
        b4 = new JButton("Others");
        b4.setBounds(830, 400, 250, 90);
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new OthersUI();
                
            }
        });
        
        
        b5 = new JButton("Expenses");
        b5.setBounds(460, 400, 250, 90);
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
        b5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new ExpensesUI();
                
            }
        });
        
        b6 = new JButton("Appointments");
        b6.setBounds(460, 175, 250, 100);
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
        b6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new AppointmentUI();
                
            }
        });
        
        b7 = new JButton("Logout");
        b7.setBounds(1060, 600, 80, 30);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(f1, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if (response == JOptionPane.YES_OPTION) {
                    f1.dispose();
                    }
                }
            });
        
        //code for load image
        ImageIcon i1 = new ImageIcon("Images/hi.jpeg");
        Image i2 = i1.getImage().getScaledInstance(1300, 670, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        
        //label for the pic
        limg = new JLabel(i3);
        
        //panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setBounds(-150, -10, 1500, 700);
        p1.setBackground(Color.BLACK);
        
        //will add the label to the panel
        p1.add(limg);
        
        // Add objects to the frame
        f1.add(l1);
        f1.add(l4);
        f1.add(l5); 
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(p1);
        f1.add(l2);
        
        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

