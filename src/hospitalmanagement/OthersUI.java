package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OthersUI{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l4, l5, limg;
    private JPanel p1;
    private JButton b1;
    

    OthersUI() {
        // Frame settings
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.BLACK);
        
        // Label settings
        l1 = new JLabel("Others");
        l1.setBounds(40, 0, 1000, 100);
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
        
        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);
        
       
        //code for load image
        ImageIcon i1 = new ImageIcon("C:\\Users\\Mhacee Caryl\\Desktop\\bubuy\\.jpg");
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

