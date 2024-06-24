package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReportUI{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15,limg;
    private JPanel p1;
    private JButton b1, b2, b3;
    private JTextField tID, tRBnumber, tAdmitDate, tDischargeDate, tDocName, tCLIOutcome, tDiagnose, tProcedure;
    private JTextArea tItem, tTotal;
    private JList Lreports;
    

    ReportUI() {
        // Frame settings
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.decode("#94c2e1"));
        
        // Label settings
        l1 = new JLabel("HOSPITAL REPORT");
        l1.setBounds(370, -10, 1090, 100);
        l1.setFont(new Font("Open Sans",Font.BOLD,50));
        l1.setForeground(Color.decode("#333333"));
        
        l2 = new JLabel();
        l2.setBounds(0, 0, 2000, 100);
        l2.setFont(new Font("Arial",Font.PLAIN,30));
        l2.setForeground(Color.decode("#042757"));
       
        l4 = new JLabel("______________________________________________________________________________");
        l4.setBounds(0, 30, 2000, 100);
        l4.setFont(new Font("Arial",Font.PLAIN,30));
        l4.setForeground(Color.WHITE);
        
        l5 = new JLabel("Patient ID: ");
        l5.setBounds(37, 70, 2000, 100);
        l5.setFont(new Font("Arial",Font.PLAIN,15));
        l5.setForeground(Color.decode("#333333"));
        
        l6 = new JLabel("Room/Bed No.: ");
        l6.setBounds(37, 155, 2000, 100);
        l6.setFont(new Font("Arial",Font.PLAIN,15));
        l6.setForeground(Color.decode("#333333"));
        
        l7 = new JLabel("Clinical Outcome:  ");
        l7.setBounds(37, 240, 2000, 100);
        l7.setFont(new Font("Arial",Font.PLAIN,15));
        l7.setForeground(Color.decode("#333333"));
        
        l8 = new JLabel("Diagnosis: ");
        l8.setBounds(37, 325, 2000, 100);
        l8.setFont(new Font("Arial",Font.PLAIN,15));
        l8.setForeground(Color.decode("#333333"));
        
        l9 = new JLabel("Admission Date:");
        l9.setBounds(317, 70, 2000, 100);
        l9.setFont(new Font("Arial",Font.PLAIN,15));
        l9.setForeground(Color.decode("#333333"));
        
        l10 = new JLabel("Discharge Date:");
        l10.setBounds(317, 155, 2000, 100);
        l10.setFont(new Font("Arial",Font.PLAIN,15));
        l10.setForeground(Color.decode("#333333"));
        
        l11 = new JLabel("Doctor Name:");
        l11.setBounds(317, 240, 2000, 100);
        l11.setFont(new Font("Arial",Font.PLAIN,15));
        l11.setForeground(Color.decode("#333333"));
        
        l12 = new JLabel("Procedures Performed:");
        l12.setBounds(317, 325, 2000, 100);
        l12.setFont(new Font("Arial",Font.PLAIN,15));
        l12.setForeground(Color.decode("#333333"));
        
        l13 = new JLabel("Itemized Charges:");
        l13.setBounds(37, 420, 2000, 100);
        l13.setFont(new Font("Arial",Font.PLAIN,15));
        l13.setForeground(Color.decode("#333333"));;
        
        l14 = new JLabel("Total Charges:");
        l14.setBounds(317, 420, 2000, 100);
        l14.setFont(new Font("Arial",Font.PLAIN,15));
        l14.setForeground(Color.decode("#333333"));
       
        l15 = new JLabel("Medical Report Records: ");
        l15.setBounds(670, 90, 2000, 100);
        l15.setFont(new Font("Open Sans",Font.BOLD,30));
        l15.setForeground(Color.decode("#333333"));
        
        
        //code for load image
        ImageIcon i1 = new ImageIcon("Images/report.jpg");
        Image i2 = i1.getImage().getScaledInstance(1196, 570, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        
        
        //label for the pic
        limg = new JLabel(i3);
        
        
        //panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setBounds(-150, 90, 1500, 700);
        p1.setBackground(Color.WHITE);
        
        
        //will add the label to the panel
        p1.add(limg);
        
        
       
        //textfield settings
        tID = new JTextField();
        tID.setBounds(37, 135, 200, 25);
        tID.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        tRBnumber = new JTextField();
        tRBnumber.setBounds(37, 220, 200, 25);
        tRBnumber.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        tCLIOutcome = new JTextField();
        tCLIOutcome.setBounds(37, 305, 200, 30);
        tCLIOutcome.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        tDiagnose = new JTextField();
        tDiagnose.setBounds(37, 390, 200, 30);
        tDiagnose.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        tAdmitDate = new JTextField();
        tAdmitDate.setBounds(317, 135, 200, 25);
        tAdmitDate.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        tDischargeDate = new JTextField();
        tDischargeDate.setBounds(317, 220, 200, 25);
        tDischargeDate.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        tDocName = new JTextField();
        tDocName.setBounds(317, 305, 200, 30);
        tDocName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        tProcedure = new JTextField();
        tProcedure.setBounds(317, 390, 200, 30);
        tProcedure.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        
        //TextArea Settings
        tItem = new JTextArea();
        tItem.setBounds(37, 485, 200, 160);
        tItem.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        tTotal = new JTextArea();
        tTotal.setBounds(317, 485, 200, 160);
        tTotal.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        
        //List Settings
        Lreports = new JList();
        Lreports.setBounds(670, 160, 469, 255);
        Lreports.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        
        //button that goes back to the dashboard
        b1 = new JButton("Back");
        b1.setBounds(1060, 620, 80, 30);
        b1.setForeground(Color.black);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MainUi();
            }  
        });
        
        b2 = new JButton("ADD REPORT");
        b2.setForeground(Color.decode("#042757"));
        b2.setBounds(670, 435, 189, 54);
        b2.setFont(new Font("ARIAL", Font.BOLD, 20));
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        b3 = new JButton("DELETE REPORT");
        b3.setForeground(Color.decode("#042757"));
        b3.setBounds(950, 435, 189, 54);
        b3.setFont(new Font("ARIAL", Font.BOLD, 20));
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
   
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
        f1.add(tID);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(tRBnumber);
        f1.add(tCLIOutcome);
        f1.add(tDiagnose);
        f1.add(tAdmitDate);
        f1.add(tDischargeDate);
        f1.add(tDocName);
        f1.add(tProcedure);
        f1.add(tItem);
        f1.add(tTotal);
        f1.add(Lreports);
        f1.add(p1);
        
        f1.add(l2);
        
        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

