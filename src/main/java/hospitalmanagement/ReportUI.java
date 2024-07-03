package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ReportUI{
    private JFrame f1 = new JFrame("Group8 OOP");
    private JLabel l1, l2, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15,limg;
    private JPanel p1;
    private JButton b1, b2, b3, b4;
    private JTextField tID, tRBnumber, tAdmitDate, tDischargeDate, tDocName, tCLIOutcome, tDiagnose, tProcedure;
    private JTextArea tItem, tTotal;
    private JScrollPane stable;
    private JTable treport; 
    private DefaultTableModel tlreport;
            
            
    ReportUI() {
        // Frame settings
        f1.setSize(1255, 700);
        f1.getContentPane().setBackground(Color.decode("#94c2e1"));
        
        // Label settings
        l1 = new JLabel("HOSPITAL REPORT");
        l1.setBounds(380, -10, 1090, 100);
        l1.setFont(new Font("Cambria",Font.BOLD,50));
        l1.setForeground(Color.decode("#333333"));
        
        l2 = new JLabel();
        l2.setBounds(0, 0, 2000, 100);
        l2.setFont(new Font("Arial",Font.PLAIN,30));
        l2.setForeground(Color.decode("#042757"));
       
        l4 = new JLabel("______________________________________________________________________________");
        l4.setBounds(0, 20, 2000, 100);
        l4.setFont(new Font("Arial",Font.PLAIN,30));
        l4.setForeground(Color.WHITE);
        
        l5 = new JLabel("Patient ID: ");
        l5.setBounds(37, 65, 2000, 100);
        l5.setFont(new Font("Arial",Font.PLAIN,15));
        l5.setForeground(Color.decode("#333333"));
        
        l6 = new JLabel("Room No.: ");
        l6.setBounds(37, 130, 2000, 100);
        l6.setFont(new Font("Arial",Font.PLAIN,15));
        l6.setForeground(Color.decode("#333333"));
        
        l7 = new JLabel("Clinical Outcome:  ");
        l7.setBounds(37, 195, 2000, 100);
        l7.setFont(new Font("Arial",Font.PLAIN,15));
        l7.setForeground(Color.decode("#333333"));
        
        l8 = new JLabel("Diagnosis: ");
        l8.setBounds(280, 65, 2000, 100);
        l8.setFont(new Font("Arial",Font.PLAIN,15));
        l8.setForeground(Color.decode("#333333"));
        
        l9 = new JLabel("Admission Date:");
        l9.setBounds(280, 130, 2000, 100);
        l9.setFont(new Font("Arial",Font.PLAIN,15));
        l9.setForeground(Color.decode("#333333"));
        
        l10 = new JLabel("Discharge Date:");
        l10.setBounds(280, 195, 2000, 100);
        l10.setFont(new Font("Arial",Font.PLAIN,15));
        l10.setForeground(Color.decode("#333333"));
        
        l11 = new JLabel("Doctor Name:");
        l11.setBounds(523, 65, 2000, 100);
        l11.setFont(new Font("Arial",Font.PLAIN,15));
        l11.setForeground(Color.decode("#333333"));
        
        l12 = new JLabel("Procedures Performed:");
        l12.setBounds(523, 130, 2000, 100);
        l12.setFont(new Font("Arial",Font.PLAIN,15));
        l12.setForeground(Color.decode("#333333"));
        
        l13 = new JLabel("Itemized Charges:");
        l13.setBounds(766, 65, 2000, 100);
        l13.setFont(new Font("Arial",Font.PLAIN,15));
        l13.setForeground(Color.decode("#333333"));
        
        l14 = new JLabel("Total Charges:");
        l14.setBounds(1009, 65, 2000, 100);
        l14.setFont(new Font("Arial",Font.PLAIN,15));
        l14.setForeground(Color.decode("#333333"));
       
        l15 = new JLabel("List of Medical Report: ");
        l15.setBounds(72, 286, 2000, 100);
        l15.setFont(new Font("Open Sans",Font.BOLD,20));
        l15.setForeground(Color.decode("#333333"));
        
        
        //code for load image
        ImageIcon i1 = new ImageIcon("Images/report.jpg");
        Image i2 = i1.getImage().getScaledInstance(1286, 579, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        
        
        //label for the pic
        limg = new JLabel(i3);
        
        
        //panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setBounds(-132, 80, 1500, 700);
        p1.setBackground(Color.WHITE);
        
        
        //will add the label to the panel
        p1.add(limg);
        
        //Table Settings
        String[] Columns = {"Patient ID", "Room no", "Clinical Outcome", "Diagnosis", "Admit Date", "Discharge Date", "Doctor", "Procedures Performed", "Itemized Charges", "Total Charges"};
        tlreport = new DefaultTableModel(Columns, 0);
        treport = new JTable(tlreport);
        treport.setBounds(67, 360, 1110, 200);
        
        try {
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                        String query = "select * from rep" ;
                        
                        Statement sta = connection.createStatement();
                        ResultSet rs = sta.executeQuery(query);
                        
                        while(rs.next()){
                            
                            String id = rs.getString("patID");
                            String room = rs.getString("room");
                            String outcome = rs.getString("clic");
                            String diagnosis = rs.getString("diag");
                            String admitDate = rs.getString("ad");
                            String dischargeDate = rs.getString("dis");
                            String doctor = rs.getString("doc");
                            String procedure = rs.getString("pro");
                            String ItemCharges = rs.getString("item1");
                            String TotalCharges = rs.getString("tot");

                            
                            
                            String tbData[] = {id,room,outcome,diagnosis,admitDate,dischargeDate,doctor,procedure,ItemCharges,TotalCharges};
                            tlreport.addRow(tbData);
                            
                        }
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
        
        
        //Customizes column size
        TableColumn id = treport.getColumnModel().getColumn(0);
        id.setPreferredWidth(20);
        
        TableColumn room = treport.getColumnModel().getColumn(1);
        room.setPreferredWidth(20);

        TableColumn outcome = treport.getColumnModel().getColumn(2);
        outcome.setPreferredWidth(55);
        
        TableColumn diagnosis = treport.getColumnModel().getColumn(3);
        diagnosis.setPreferredWidth(40);
        
        TableColumn admitDate = treport.getColumnModel().getColumn(4);
        admitDate.setPreferredWidth(50);
        
        TableColumn dischargeDate = treport.getColumnModel().getColumn(5);
        dischargeDate.setPreferredWidth(50);
        
        TableColumn doctor = treport.getColumnModel().getColumn(6);
        doctor.setPreferredWidth(50);
        
        TableColumn procedure = treport.getColumnModel().getColumn(7);
        procedure.setPreferredWidth(80);
        
        TableColumn ItemCharges = treport.getColumnModel().getColumn(8);
        ItemCharges.setPreferredWidth(60);
        
        TableColumn TotalCharges = treport.getColumnModel().getColumn(9);
        TotalCharges.setPreferredWidth(60);
      
        //ScrollPane settings
        stable = new JScrollPane(treport);
        stable.setBounds(67, 360, 1110, 200);
       
        
        //Textfields settings
        tID = new JTextField();
        tID.setBounds(37, 130, 200, 25);
        
        tRBnumber = new JTextField();
        tRBnumber.setBounds(37, 195, 200, 25);      
        
        tCLIOutcome = new JTextField();
        tCLIOutcome.setBounds(37, 260, 200, 25);       
        
        tDiagnose = new JTextField();
        tDiagnose.setBounds(280, 130, 200, 25);       
        
        tAdmitDate = new JTextField();
        tAdmitDate.setBounds(280, 195, 200, 25);       
        
        tDischargeDate = new JTextField();
        tDischargeDate.setBounds(280, 260, 200, 25);        
        
        tDocName = new JTextField();
        tDocName.setBounds(523, 130, 200, 25);       
        
        tProcedure = new JTextField();
        tProcedure.setBounds(523, 195, 200, 25);
     
        
        //TextArea Settings
        tItem = new JTextArea();
        tItem.setBounds(766, 130, 200, 100);   
        
        tTotal = new JTextArea();
        tTotal.setBounds(1009, 130, 200, 100);
        
        
        //button that goes back to the dashboard
        b1 = new JButton("Back");
        b1.setBounds(1100, 600, 80, 30);
        b1.setForeground(Color.black);
        b1.setFocusable(false);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MainUi();
            }  
        });
        
        b2 = new JButton("ADD REPORT");
        b2.setForeground(Color.decode("#042757"));
        b2.setBounds(72, 590, 95, 40);
        b2.setFont(new Font("ARIAL", Font.BOLD, 10));
        b2.setFocusable(false);
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                addReport();
                
                String id = tID.getText();
                String room = tRBnumber.getText();
                String outcome = tCLIOutcome.getText();
                String diagnosis = tDiagnose.getText();
                String admitDate = tAdmitDate.getText();
                String dischargeDate = tDischargeDate.getText();
                String doctor = tDocName.getText();
                String procedure = tProcedure.getText();
                String ItemCharges = tItem.getText();
                String TotalCharges = tTotal.getText();
                
                
                try {
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                        String query = "INSERT INTO rep (patID, room, clic ,diag,ad,dis,doc,pro,item1,tot) Values('" + id + "','" + room + "','" + outcome + "','" +
                                diagnosis + "','" + admitDate + "','" + dischargeDate + "','"+doctor+"','"+procedure+"','"+ItemCharges+"','"+TotalCharges+"')";
                        
                        Statement sta = connection.createStatement();
                        int x = sta.executeUpdate(query);
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
                tID.setText("");
                tRBnumber.setText("");
                tAdmitDate.setText("");
                tDischargeDate.setText("");
                tDocName.setText("");
                tCLIOutcome.setText("");
                tDiagnose.setText("");
                tProcedure.setText("");
                tTotal.setText("");
                tItem.setText("");
            }
        });
                
        b3 = new JButton("DELETE REPORT");
        b3.setForeground(Color.decode("#042757"));
        b3.setBounds(202, 590, 95, 40);
        b3.setFont(new Font("ARIAL", Font.BOLD, 10));
        b3.setFocusable(false);
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                deleteReport();
            }
        });
        
        b4 = new JButton("UPDATE REPORT");
        b4.setForeground(Color.decode("#042757"));
        b4.setBounds(332, 590, 95, 40);
        b4.setFont(new Font("ARIAL", Font.BOLD, 10));
        b4.setFocusable(false);
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                updateReport();
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
        f1.add(tID);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        //f1.add(b4);
        f1.add(stable);
        f1.add(tRBnumber);
        f1.add(tCLIOutcome);
        f1.add(tDiagnose);
        f1.add(tAdmitDate);
        f1.add(tDischargeDate);
        f1.add(tDocName);
        f1.add(tProcedure);
        f1.add(tItem);
        f1.add(tTotal);       
        f1.add(p1);     
        f1.add(l2);
        
        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
        private void addReport() {
            String id = tID.getText();
            String room = tRBnumber.getText();
            String outcome = tCLIOutcome.getText();
            String diagnosis = tDiagnose.getText();
            String admitDate = tAdmitDate.getText();
            String dischargeDate = tDischargeDate.getText();
            String doctor = tDocName.getText();
            String procedure = tProcedure.getText();
            String ItemCharges = tItem.getText();
            String TotalCharges = tTotal.getText();
        

            if (id.isEmpty() || room.isEmpty() || outcome.isEmpty() || diagnosis.isEmpty() || admitDate.isEmpty() || dischargeDate.isEmpty()) {
            JOptionPane.showMessageDialog(f1, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
                tlreport.addRow(new Object[]{ id, room, outcome, diagnosis, admitDate, dischargeDate, doctor, procedure, ItemCharges, TotalCharges});
        }
        
        private void deleteReport(){
            int selectedRow = treport.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(f1, "Please select a report to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = (String) treport.getValueAt(selectedRow, 0);

        try {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                String query = "DELETE FROM rep WHERE patID='" + name + "'";
                Statement sta = connection.createStatement();
                int x = sta.executeUpdate(query);

                if (x == 1) {
                    tlreport.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(f1, "Report deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(f1, "Error deleting Report", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        }
        
        private void updateReport(){
            int selectedRow = treport.getSelectedRow();
            if (selectedRow == -1){
                JOptionPane.showMessageDialog(f1, "Please select a report you want to update.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Retrieves the current values from the selected row
            Object[] currentValues = new Object[tlreport.getColumnCount()];
            for (int i = 0; i < tlreport.getColumnCount(); i++){
                currentValues[i] = tlreport.getValueAt(selectedRow, i);
            }
            
            //Input dialogs for each values
            for(int i = 0; i < tlreport.getColumnCount(); i++){
                String columnName = tlreport.getColumnName(i);
                String newValue = JOptionPane.showInputDialog(f1,"Update " + columnName + ":",currentValues[i]);
                if (newValue != null){
                    tlreport.setValueAt(newValue, selectedRow, i);
                }
                
                
            }
            
            
        }

    
}

