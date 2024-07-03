package hospitalmanagement;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public class InventoryUI {
Connection con = null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    
    int q;

    private JFrame  f1;                                                       //Main Frame
                                                                     //Frame for Button Actions
    private JLabel  l1,l2, l4, l5, l6, l7, limg,                                   // Main Label
                    lfadd, llotn,lcate, lprodname, lsize, ltype,lstock, lloc, limg1, lsear;  //Labels for the Add Action 
                      //Labels for the Update Action
    private JPanel  p1;                                                         //Main Panel
                                                
    private JButton b1,bsear, badd, bupd, bdel;                                       //Main Buttons
                                                             
    private JTextField tprodname, texdt,                                        
                       tadd1, tadd2, tadd3, tadd4, tadd5, tadd6, tadd7, tsear;                
                                            //TextField for the 
    private JComboBox cbtype;                                                   
    private DefaultTableModel t1;                                                          //Table for Database
    private JTable inventable;
    private JScrollPane spt; 
    

    InventoryUI() {

      
        // Frame settings
        f1 = new JFrame("Group8 OOP");
        f1.setSize(1200, 700);
        
        
        


        
        // Label settings
        l1 = new JLabel("Inventory");
        l1.setBounds(40, 0, 600, 100);
        l1.setFont(new Font("Arial Black",Font.PLAIN,50));
        l1.setForeground(Color.white);
        
        l2 = new JLabel();
        l2.setBounds(110, 20, 1000, 100);
        
        
//Table
        t1 = new DefaultTableModel(
            new String[]{"Inventory ID", "Category", "Name", "Size", "Type", "Stock", "Location"}, 0);
        
        inventable = new JTable(t1);
        inventable.setBounds(520, 100, 610, 400);
        
        try {
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                        String query = "select * from inventory" ;
                        
                        Statement sta = connection.createStatement();
                        ResultSet rs = sta.executeQuery(query);
                        
                        while(rs.next()){
                            
                            
                            String Number = rs.getString("lotno");
                            String Category = rs.getString("cat");
                            String Name = rs.getString("prod");
                            String Size = rs.getString("size");
                            String Type = rs.getString("type1");
                            String Stock = rs.getString("sto");
                            String Location = rs.getString("loc1");
                            
                            
                            
                            String tbData[] = {Number,Category,Name,Size,Type,Stock,Location};
                            t1.addRow(tbData);
                            
                        }
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
        
        spt = new JScrollPane(inventable);

        spt.setBounds(550, 100, 580, 400);
                
                    llotn = new JLabel("Inventory ID:");
                    llotn.setBounds(52, 120, 120, 20);
                    llotn.setFont(new Font("Arial",Font.PLAIN,18));
                    llotn.setForeground(Color.white);
                    tadd1 = new JTextField();
                    tadd1.setBounds(200, 120, 150, 27);
                                               

                        lcate = new JLabel("Category:");
                        lcate.setBounds(50, 170, 100, 20);
                        lcate.setFont(new Font("Arial",Font.PLAIN,18));
                        lcate.setForeground(Color.white);
                        tadd2 = new JTextField();
                        tadd2.setBounds(200, 170, 150, 27);                    
                                

                        lprodname = new JLabel("Product Name:");
                        lprodname.setBounds(50, 220, 150, 20);
                        lprodname.setFont(new Font("Arial",Font.PLAIN,18));
                        lprodname.setForeground(Color.white);
                        tadd3 = new JTextField();
                        tadd3.setBounds(200, 220, 150, 27);
                                

                        lsize = new JLabel("Size:");
                        lsize.setBounds(50, 270, 150, 20);
                        lsize.setFont(new Font("Arial",Font.PLAIN,18));
                        lsize.setForeground(Color.white);
                        tadd4 = new JTextField();
                        tadd4.setBounds(200, 270, 150, 27);                    
                               
                  
                    ltype = new JLabel("Type:");
                    ltype.setBounds(50, 320, 150, 20);
                    ltype.setFont(new Font("Arial",Font.PLAIN,18));
                    ltype.setForeground(Color.white);
                    tadd5 = new JTextField();
                    tadd5.setBounds(200, 320, 150, 27);
                            
                              
                    lstock = new JLabel("Stock:");
                    lstock.setBounds(50, 370, 150, 20);
                    lstock.setFont(new Font("Arial",Font.PLAIN,18));
                    lstock.setForeground(Color.white);
                    tadd6 = new JTextField();
                    tadd6.setBounds(200, 370, 150, 27);         
                            
                               
                    lloc = new JLabel("Location:");
                    lloc.setBounds(50, 420, 100, 20);
                    lloc.setFont(new Font("Arial",Font.PLAIN,18));
                    lloc.setForeground(Color.white);
                    tadd7 = new JTextField();                    
                    tadd7.setBounds(200, 420, 150, 27);          
                            

                            
                    lsear = new JLabel("Search Information:");
                    lsear.setBounds(600, 50, 200, 20);
                    lsear.setFont(new Font("Arial",Font.PLAIN,18));
                    lsear.setForeground(Color.white);
                    tsear = new JTextField();
                    tsear.setBounds(780, 50, 150, 27);
                              
//----------------------------BUTTONS-------------------------------------------
                            
        badd = new JButton("Add New Item");
        badd.setBounds(50, 550, 130, 60);
        badd.setFont(new Font("Arial",Font.PLAIN,12));
        badd.setForeground(Color.black);        
        badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItem();
                String Number = tadd1.getText();
                String Category = tadd2.getText();
                String Name = tadd3.getText();
                String Size = tadd4.getText();
                String Type = tadd5.getText();
                String Stock = tadd6.getText();
                String Location = tadd7.getText();
                
                
                try {
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                        String query = "INSERT INTO inventory (lotno, cat, prod ,size,type1,sto,loc1) Values('" + Number + "','" + Category + "','" + Name + "','" +
                                Size + "','" + Type + "','" + Stock + "','"+Location+"')";
                        
                        Statement sta = connection.createStatement();
                        int x = sta.executeUpdate(query);
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
                clearFields();
            }
        });
        
        bupd = new JButton("Update a Item");
        bupd.setBounds(210, 550, 130, 60);
        bupd.setFont(new Font("Arial",Font.PLAIN,12));
        bupd.setForeground(Color.black);
             
        
        bupd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateItem();
            }
        });
         
        bdel = new JButton("Delete a Item");
        bdel.setBounds(370, 550, 130, 60);
        bdel.setFont(new Font("Arial",Font.PLAIN,12));
        bdel.setForeground(Color.black);
        
        
        bdel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteItem();
            }
        });

bsear = new JButton("Search");
        bsear.setBounds(960, 40, 110, 40);
        bsear.setFont(new Font("Arial",Font.PLAIN,12));
        bsear.setForeground(Color.black);
        
        
        bsear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchItem();
            }
        });        
      
//--------------------------BACKGROUND-IMAGE------------------------------------
        //code for load image
        ImageIcon i1 = new ImageIcon("Images/inventoryui.jpg");
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);      
        //label for the pic
        limg = new JLabel(i3);   
        //panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setSize(1200, 700);
        //will add the label to the panel
        p1.add(limg);
        
//--------------------------------BACK-BUTTON-----------------------------------
        
        //button that goes back to the dashboard
        b1 = new JButton("Back");
        b1.setBounds(1060, 600, 80, 30);
        b1.setFont(new Font("Arial",Font.PLAIN,12));
        b1.setForeground(Color.black);
                f1.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainUi();
                f1.dispose();
               
            }
        });
        
        f1.add(l1);
        f1.add(lprodname);
        f1.add(llotn); 
        f1.add(lcate);
        f1.add(lsize);
        f1.add(ltype);
        f1.add(lstock);
        f1.add(lloc);
        f1.add(lsear);
        f1.add(badd);
        f1.add(bupd);
        f1.add(bdel);
        f1.add(bsear);
        f1.add(spt);
        f1.add(tadd1);                    
        f1.add(tadd2); 
        f1.add(tadd3);  
        f1.add(tadd4);   
        f1.add(tadd5);
        f1.add(tadd6);
        f1.add(tadd7);                                   
        f1.add(tsear);
        f1.add(p1);
        f1.add(l2);
        
        
        
                // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//--------------------- ----ADDING ACTION IN BUTTONS----------------------------    
    
            private void addItem(){

        String Number = tadd1.getText();
        String Category = tadd2.getText();
        String Name = tadd3.getText();
        String Size = tadd4.getText();
        String Type = tadd5.getText();
        String Stock = tadd6.getText();
        String Location = tadd7.getText();

        if (Number.isEmpty() || Category.isEmpty() || Name.isEmpty() || Size.isEmpty() || Type.isEmpty() || Stock.isEmpty() || Location.isEmpty()) {
            JOptionPane.showMessageDialog(f1, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        t1.addRow(new Object[]{Number, Category, Name, Size, Type, Stock, Location});
}
private void updateItem() {
    int selectedRow = inventable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(f1, "Please select patient to update", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String Number = tadd1.getText();
        String Category = tadd2.getText();
        String Name = tadd3.getText();
        String Size = tadd4.getText();
        String Type = tadd5.getText();
        String Stock = tadd6.getText();
        String Location = tadd7.getText();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11");
            Statement sta = connection.createStatement();
            int x = 0;

            if (!Category.isEmpty()) {
                String query = "UPDATE inventory SET cat='" + Category + "' WHERE lotno='" + Number + "'";
                x += sta.executeUpdate(query);
                inventable.setValueAt(Category, selectedRow, 1);
            }

            if (!Name.isEmpty()) {
                String query = "UPDATE inventory SET prod='" + Name + "' WHERE lotno='" + Number + "'";
                x += sta.executeUpdate(query);
                inventable.setValueAt(Name, selectedRow, 2);
            }

            if (!Size.isEmpty()) {
                String query = "UPDATE inventory SET size='" + Size + "' WHERE lotno='" + Number + "'";
                x += sta.executeUpdate(query);
                inventable.setValueAt(Size, selectedRow, 3);
            }

            if (!Type.isEmpty()) {
                String query = "UPDATE inventory SET type1='" + Type + "' WHERE lotno='" + Number + "'";
                x += sta.executeUpdate(query);
                inventable.setValueAt(Type, selectedRow, 4);
            }

            if (!Stock.isEmpty()) {
                String query = "UPDATE inventory SET sto='" + Stock + "' WHERE lotno='" + Number + "'";
                x += sta.executeUpdate(query);
                inventable.setValueAt(Stock, selectedRow, 5);
            }
            
            if (!Location.isEmpty()) {
                String query = "UPDATE inventory SET loc1='" + Location + "' WHERE lotno='" + Number + "'";
                x += sta.executeUpdate(query);
                inventable.setValueAt(Location, selectedRow, 6);
            }
            
            if (x > 0) {
                JOptionPane.showMessageDialog(f1, "Patient updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(f1, "No changes made to the patient", "Info", JOptionPane.INFORMATION_MESSAGE);
            }

            
        } catch (Exception exception) {
            exception.printStackTrace();
        }      
}

            private void deleteItem(){
    int selectedRow = inventable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(f1, "Please select a Item to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = (String) inventable.getValueAt(selectedRow, 0);

        try {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/oophospital", "root", "Kurtjerome11")) {
                String query = "DELETE FROM inventory WHERE lotno='" + name + "'";
                Statement sta = connection.createStatement();
                int x = sta.executeUpdate(query);

                if (x == 1) {
                    t1.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(f1, "Item deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(f1, "Error deleting item", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

            private void searchItem(){
        DefaultTableModel rt = (DefaultTableModel)inventable.getModel();
        TableRowSorter<DefaultTableModel> item = new TableRowSorter(rt);
        inventable.setRowSorter(item);
        item.setRowFilter(RowFilter.regexFilter("(?i)"+tsear.getText()));
        
            }
            
       
        private void clearFields() {
        tadd1.setText("");
        tadd2.setText("");
        tadd3.setText("");
        tadd4.setText("");
        tadd5.setText("");
        tadd6.setText("");
        tadd7.setText("");
        
    } 
        
}




