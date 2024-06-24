package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OthersUI{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l4, l5, l6, l7, l8,l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, limg;
    private JPanel p1;
    private JButton b1;
    

    OthersUI() {
        // Frame settings
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.decode("#5098eb"));
        
        // Label settings
        l1 = new JLabel("Hospital Hierarchy");
        l1.setBounds(450, 0, 1000, 100);
        l1.setFont(new Font("Cambria",Font.PLAIN,35));
        l1.setForeground(Color.WHITE);
        
        l4 = new JLabel("______________________________________________________________________________");
        l4.setBounds(0, 30, 2000, 100);
        l4.setFont(new Font("Arial",Font.PLAIN,30));
        l4.setForeground(Color.WHITE);
        
        l5 = new JLabel("______________________________________________________________________________");
        l5.setBounds(0, 510, 2000, 100);
        l5.setFont(new Font("Arial",Font.PLAIN,30));
        l5.setForeground(Color.WHITE);
        
        l6 = new JLabel(" Board of Directors");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Aptos",Font.PLAIN,20));
        l6.setBackground(Color.decode("#5098eb"));
        l6.setOpaque(true);
        l6.setBounds(500, 150, 180, 30);
        
        l7 = new JLabel(" Chief Executive Director");
        l7.setForeground(Color.white);
        l7.setFont(new Font("Aptos",Font.PLAIN,20));
        l7.setBackground(Color.decode("#5098eb"));
        l7.setOpaque(true);
        l7.setBounds(480, 200, 225, 30);
        
        l8 = new JLabel(" Chief Administrative Officer");
        l8.setForeground(Color.white);
        l8.setFont(new Font("Aptos",Font.PLAIN,20));
        l8.setBackground(Color.decode("#5098eb"));
        l8.setOpaque(true);
        l8.setBounds(50, 300, 270, 30);
        
        l9 = new JLabel(" Chief HR Officer");
        l9.setForeground(Color.white);
        l9.setFont(new Font("Aptos",Font.PLAIN,20));
        l9.setBackground(Color.decode("#5098eb"));
        l9.setOpaque(true);
        l9.setBounds(370, 300, 180, 30);
        
        l10 = new JLabel(" Chief Financial Officer");
        l10.setForeground(Color.white);
        l10.setFont(new Font("Aptos",Font.PLAIN,20));
        l10.setBackground(Color.decode("#5098eb"));
        l10.setOpaque(true);
        l10.setBounds(600, 300, 220, 30);
        
        l11 = new JLabel(" Service Support Director");
        l11.setForeground(Color.white);
        l11.setFont(new Font("Aptos",Font.PLAIN,20));
        l11.setBackground(Color.decode("#5098eb"));
        l11.setOpaque(true);
        l11.setBounds(870, 300, 230, 30);
        
        l12 = new JLabel("Emergency Department");
        l12.setForeground(Color.white);
        l12.setFont(new Font("Aptos",Font.PLAIN,20));
        l12.setBackground(Color.decode("#5098eb"));
        l12.setOpaque(true);
        l12.setBounds(40,400, 230, 30);
        
        l13 = new JLabel(" Medicine Department");
        l13.setForeground(Color.white);
        l13.setFont(new Font("Aptos",Font.PLAIN,20));
        l13.setBackground(Color.decode("#5098eb"));
        l13.setOpaque(true);
        l13.setBounds(150,450, 230, 30);
        
        
        l14 = new JLabel("Nursing Department");
        l14.setForeground(Color.white);
        l14.setFont(new Font("Aptos",Font.PLAIN,20));
        l14.setBackground(Color.decode("#5098eb"));
        l14.setOpaque(true);
        l14.setBounds(325,400, 220, 30);
        
        l15 = new JLabel(" Surgery Department");
        l15.setForeground(Color.white);
        l15.setFont(new Font("Aptos",Font.PLAIN,20));
        l15.setBackground(Color.decode("#5098eb"));
        l15.setOpaque(true);
        l15.setBounds(450,450,220, 30);
        
        l16 = new JLabel(" Dentistry Department");
        l16.setForeground(Color.white);
        l16.setFont(new Font("Aptos",Font.PLAIN,20));
        l16.setBackground(Color.decode("#5098eb"));
        l16.setOpaque(true);
        l16.setBounds(600,400, 230, 30);
        
        l17 = new JLabel(" Radiology Department");
        l17.setForeground(Color.white);
        l17.setFont(new Font("Aptos",Font.PLAIN,20));
        l17.setBackground(Color.decode("#5098eb"));
        l17.setOpaque(true);
        l17.setBounds(740,450, 230, 30);
        
        l18 = new JLabel(" Pediatrics Department");
        l18.setForeground(Color.white);
        l18.setFont(new Font("Aptos",Font.PLAIN,20));
        l18.setBackground(Color.decode("#5098eb"));
        l18.setOpaque(true);
        l18.setBounds(885,400, 230, 30);
        
        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);
        
       
        //code for load image
        ImageIcon i1 = new ImageIcon("C:Images/New.jpg");
        Image i2 = i1.getImage().getScaledInstance(1200, 480, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        
        //label for the pic
        limg = new JLabel(i3);
        
        //panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setBounds(-150, 90, 1500, 700);
        p1.setBackground(Color.BLACK);
        
        //will add the label to the panel
        p1.add(limg);
        
        //button that goes back to the dashboard
        b1 = new JButton("Back");
        b1.setBounds(1060, 600, 80, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MainUi();
            }
        });
        
        // Add objects to the frame
        f1.add(l1);
        f1.add(l4);
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
        f1.add(l15);
        f1.add(l16);
        f1.add(l17);
        f1.add(l18);
        f1.add(p1);
        f1.add(b1);
        f1.add(l2);
        
        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

