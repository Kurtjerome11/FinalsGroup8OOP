package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OthersUI{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l4,l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, limg;
    private JPanel p1;
    private JButton b1;
    

    OthersUI() {
        // Frame settings
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.decode("#0e417c"));
        
        // Label settings
        l1 = new JLabel("Hospital Hierarchy");
        l1.setBounds(345, 0, 1000, 100);
        l1.setFont(new Font("Cambria",Font.BOLD,60));
        l1.setForeground(Color.WHITE);
        
        l4 = new JLabel("______________________________________________________________________________");
        l4.setBounds(0, 30, 2000, 100);
        l4.setFont(new Font("Arial",Font.PLAIN,30));
        l4.setForeground(Color.WHITE);
        
        l6 = new JLabel("Board of Directors");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Georgia",Font.BOLD,30));
        l6.setBackground(Color.decode("#104b8e"));
        l6.setOpaque(true);
        l6.setBounds(445, 130, 300, 40);
        
        l7 = new JLabel(" Kurt Jerome Oliva");
        l7.setForeground(Color.white);
        l7.setFont(new Font("Georgia",Font.PLAIN,30));
        l7.setBackground(Color.decode("#12549f"));
        l7.setOpaque(true);
        l7.setBounds(455, 200, 270, 40);
        
        l19 = new JLabel("Chief Executive Director");
        l19.setBounds(510, 245, 225, 15);          
        l19.setFont(new Font("Aptos", Font.BOLD, 15));
        l19.setForeground(Color.BLACK);
        
        l8 = new JLabel("  Angelica Herrera");
        l8.setForeground(Color.white);
        l8.setFont(new Font("Georgia",Font.PLAIN,30));
        l8.setBackground(Color.decode("#145db1"));
        l8.setOpaque(true);
        l8.setBounds(20, 300, 260, 40);
        
        l20 = new JLabel("Chief Administrative Officer");
        l20.setBounds(60, 345, 270, 20);
        l20.setFont(new Font("Aptos", Font.BOLD, 15));
        l20.setForeground(Color.BLACK);
        
        l9 = new JLabel(" Allysandra Redondo");
        l9.setForeground(Color.white);
        l9.setFont(new Font("Georgia",Font.PLAIN,30));
        l9.setBackground(Color.decode("#145db1"));
        l9.setOpaque(true);
        l9.setBounds(295, 300, 290, 40);
        
        l21 = new JLabel("Chief HR Officer");
        l21.setBounds(370, 345, 180, 20);
        l21.setFont(new Font("Aptos", Font.BOLD, 15));
        l21.setForeground(Color.BLACK);
        
        l10 = new JLabel(" Jethro Sarmiento");
        l10.setForeground(Color.white);
        l10.setFont(new Font("Georgia",Font.PLAIN,30));
        l10.setBackground(Color.decode("#145db1"));
        l10.setOpaque(true);
        l10.setBounds(595, 300, 260, 40);
        
        l22 = new JLabel("Chief Financial Officer");
        l22.setBounds(650, 345, 180, 20);
        l22.setFont(new Font("Aptos", Font.BOLD, 15));
        l22.setForeground(Color.BLACK);
        
        
        l11 = new JLabel(" Mark Neo Escobarte");
        l11.setForeground(Color.white);
        l11.setFont(new Font("Georgia",Font.PLAIN,30));
        l11.setBackground(Color.decode("#145db1"));
        l11.setOpaque(true);
        l11.setBounds(870, 300, 290, 40);
        
        l23 = new JLabel("Service Support Director");
        l23.setBounds(930, 345, 200, 20);
        l23.setFont(new Font("Aptos", Font.BOLD, 15));
        l23.setForeground(Color.BLACK);
        
        l12 = new JLabel("    Dr. Yza Axel");
        l12.setForeground(Color.white);
        l12.setFont(new Font("Georgia",Font.PLAIN,30));
        l12.setBackground(Color.decode("#1666c3"));
        l12.setOpaque(true);
        l12.setBounds(25, 400, 260, 40);
        
        l24 = new JLabel("ER Doctor");
        l24.setBounds(100, 445, 180, 20);
        l24.setFont(new Font("Aptos", Font.BOLD, 15));
        l24.setForeground(Color.BLACK);
        
        l13 = new JLabel("   Salve Villlanueva");
        l13.setForeground(Color.white);
        l13.setFont(new Font("Georgia",Font.PLAIN,30));
        l13.setBackground(Color.decode("#1666c3"));
        l13.setOpaque(true);
        l13.setBounds(305,400, 285, 40);
        
        l25 = new JLabel(" Medicine Department");
        l25.setBounds(360, 445, 180, 20);
        l25.setFont(new Font("Aptos", Font.BOLD, 15));
        l25.setForeground(Color.BLACK);
        
        l14 = new JLabel("  Sunshine Rode");
        l14.setForeground(Color.white);
        l14.setFont(new Font("Georgia",Font.PLAIN,30));
        l14.setBackground(Color.decode("#1666c3"));
        l14.setOpaque(true);
        l14.setBounds(600,400, 250, 40);
        
        l26 = new JLabel("Nursing Department");
        l26.setBounds(670, 445, 180, 20);
        l26.setFont(new Font("Aptos", Font.BOLD, 15));
        l26.setForeground(Color.BLACK);

        l15 = new JLabel("  Leilani Ann Ching");
        l15.setForeground(Color.white);
        l15.setFont(new Font("Georgia",Font.PLAIN,30));
        l15.setBackground(Color.decode("#1666c3"));
        l15.setOpaque(true);
        l15.setBounds(870,400,290, 40);
        
        l27 = new JLabel("Surgery Department");
        l27.setBounds(930, 445, 180, 20);
        l27.setFont(new Font("Aptos", Font.BOLD, 15));
        l27.setForeground(Color.BLACK);
        
        l16 = new JLabel(" Dorotheo Floresca");
        l16.setForeground(Color.white);
        l16.setFont(new Font("Georgia",Font.PLAIN,30));
        l16.setBackground(Color.decode("#1870d4"));
        l16.setOpaque(true);
        l16.setBounds(90,500, 270, 40);
        
        
        l28 = new JLabel("Dentistry Department");
        l28.setBounds(130, 545, 180, 20);
        l28.setFont(new Font("Aptos", Font.BOLD, 15));
        l28.setForeground(Color.BLACK);
       
        
        l17 = new JLabel("  Rimuru Tempest");
        l17.setForeground(Color.white);
        l17.setFont(new Font("Georgia",Font.PLAIN,30));
        l17.setBackground(Color.decode("#1870d4"));
        l17.setOpaque(true);
        l17.setBounds(430,500, 270, 40);
        
        l29 = new JLabel("Radiology Department");
        l29.setBounds(470, 545, 180, 20);
        l29.setFont(new Font("Aptos", Font.BOLD, 15));
        l29.setForeground(Color.BLACK);
        
        l18 = new JLabel(" Emmanuel Gracious");
        l18.setForeground(Color.white);
        l18.setFont(new Font("Georgia",Font.PLAIN,30));
        l18.setBackground(Color.decode("#1870d4"));
        l18.setOpaque(true);
        l18.setBounds(770,500, 300, 40);
        
        l30 = new JLabel("Pediatrics Department");
        l30.setBounds(820, 545, 180, 20);
        l30.setFont(new Font("Aptos", Font.BOLD, 15));
        l30.setForeground(Color.BLACK);
        
        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);
        
       
        //code for load image
        ImageIcon i1 = new ImageIcon("C:Images/New.jpg");
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
        f1.add(l19);
        f1.add(l20);
        f1.add(l21);
        f1.add(l22);
        f1.add(l23);
        f1.add(l24);
        f1.add(l25);
        f1.add(l26);
        f1.add(l27);
        f1.add(l28);
        f1.add(l29);
        f1.add(l30);
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


