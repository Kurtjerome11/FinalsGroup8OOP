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
    private JLabel  l1, l4, l5, l6, l7, limg,                                   // Main Label
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
        
        
                // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Label settings
        l1 = new JLabel("Inventory");
        l1.setBounds(40, 0, 600, 100);
        l1.setFont(new Font("Arial Black",Font.PLAIN,50));
        l1.setForeground(Color.white);
        f1.add(l1);
        
//Table
        t1 = new DefaultTableModel(
            new String[]{"Lot Number", "Category", "Name", "Size", "Type", "Stock", "Location"}, 0);
        
        inventable = new JTable(t1);
        inventable.setBounds(520, 100, 610, 400);
        
        spt = new JScrollPane(inventable);

        spt.setBounds(550, 100, 580, 400);
                
                f1.add(spt);
                

 
  

                    llotn = new JLabel("Lot Number:");
                    llotn.setBounds(52, 120, 100, 20);
                    llotn.setFont(new Font("Arial",Font.PLAIN,18));
                    llotn.setForeground(Color.white);
                    tadd1 = new JTextField();
                    tadd1.setBounds(200, 120, 150, 27);
                            f1.add(tadd1);                    
                            f1.add(llotn);                    

                        lcate = new JLabel("Category:");
                        lcate.setBounds(50, 170, 100, 20);
                        lcate.setFont(new Font("Arial",Font.PLAIN,18));
                        lcate.setForeground(Color.white);
                        tadd2 = new JTextField();
                        tadd2.setBounds(200, 170, 150, 27);                    
                                f1.add(lcate);
                                f1.add(tadd2); 

                        lprodname = new JLabel("Product Name:");
                        lprodname.setBounds(50, 220, 150, 20);
                        lprodname.setFont(new Font("Arial",Font.PLAIN,18));
                        lprodname.setForeground(Color.white);
                        tadd3 = new JTextField();
                        tadd3.setBounds(200, 220, 150, 27);
                                f1.add(lprodname);
                                f1.add(tadd3);  

                        lsize = new JLabel("Size:");
                        lsize.setBounds(50, 270, 150, 20);
                        lsize.setFont(new Font("Arial",Font.PLAIN,18));
                        lsize.setForeground(Color.white);
                        tadd4 = new JTextField();
                        tadd4.setBounds(200, 270, 150, 27);                    
                                f1.add(tadd4); 
                            f1.add(lsize);
                  
                    ltype = new JLabel("Type:");
                    ltype.setBounds(50, 320, 150, 20);
                    ltype.setFont(new Font("Arial",Font.PLAIN,18));
                    ltype.setForeground(Color.white);
                    tadd5 = new JTextField();
                    tadd5.setBounds(200, 320, 150, 27);
                            f1.add(ltype);       
                            f1.add(tadd5);
                              
                    lstock = new JLabel("Stock:");
                    lstock.setBounds(50, 370, 150, 20);
                    lstock.setFont(new Font("Arial",Font.PLAIN,18));
                    lstock.setForeground(Color.white);
                    tadd6 = new JTextField();
                    tadd6.setBounds(200, 370, 150, 27);         
                            f1.add(tadd6);
                            f1.add(lstock);
                               
                    lloc = new JLabel("Location:");
                    lloc.setBounds(50, 420, 100, 20);
                    lloc.setFont(new Font("Arial",Font.PLAIN,18));
                    lloc.setForeground(Color.white);
                    tadd7 = new JTextField();                    
                    tadd7.setBounds(200, 420, 150, 27);          
                            f1.add(tadd7);                    
                            f1.add(lloc);

                            
                    lsear = new JLabel("Search Information:");
                    lsear.setBounds(600, 50, 200, 20);
                    lsear.setFont(new Font("Arial",Font.PLAIN,18));
                    lsear.setForeground(Color.white);
                    tsear = new JTextField();
                    tsear.setBounds(780, 50, 150, 27);
                            f1.add(lsear);                    
                            f1.add(tsear);  
//----------------------------BUTTONS-------------------------------------------
                            
        badd = new JButton("Add New Item");
        badd.setBounds(50, 550, 130, 60);
        badd.setFont(new Font("Arial",Font.PLAIN,12));
        badd.setForeground(Color.black);       
        f1.add(badd); 
        badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });
        
        bupd = new JButton("Update a Item");
        bupd.setBounds(210, 550, 130, 60);
        bupd.setFont(new Font("Arial",Font.PLAIN,12));
        bupd.setForeground(Color.black);
        f1.add(bupd);     
        
        bupd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateItem();
            }
        });
         
        bdel = new JButton("Delete a Item");
        bdel.setBounds(370, 550, 130, 60);
        bdel.setFont(new Font("Arial",Font.PLAIN,12));
        bdel.setForeground(Color.black);
        f1.add(bdel);
        
        bdel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteItem();
            }
        });

bsear = new JButton("Search");
        bsear.setBounds(960, 40, 110, 40);
        bsear.setFont(new Font("Arial",Font.PLAIN,12));
        bsear.setForeground(Color.black);
        f1.add(bsear);
        
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
        f1.add(p1);
//--------------------------------BACK-BUTTON-----------------------------------
        
        //button that goes back to the dashboard
        b1 = new JButton("Back");
        b1.setBounds(1000, 550, 130, 60);
        b1.setFont(new Font("Arial",Font.PLAIN,12));
        b1.setForeground(Color.black);
                f1.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainUi();
                f1.dispose();
               
            }
        });
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
                    clearFields();
}
private void updateItem() {
    int selectedRow = inventable.getSelectedRow();
        if (selectedRow >= 0) {
            t1.setValueAt(tadd1.getText(), selectedRow, 0);
            t1.setValueAt(tadd2.getText(), selectedRow, 1);
            t1.setValueAt(tadd3.getText(), selectedRow, 2);
            t1.setValueAt(tadd4.getText(), selectedRow, 3);
            t1.setValueAt(tadd5.getText(), selectedRow, 4);
            t1.setValueAt(tadd6.getText(), selectedRow, 5);
            t1.setValueAt(tadd7.getText(), selectedRow, 6);
            
        } else {
            JOptionPane.showMessageDialog(f1, "Please select a row to update.");
        }
             clearFields();       
}

            private void deleteItem(){
    int selectedRow = inventable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(f1, "Please select a patient to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }

        t1.removeRow(selectedRow);
            clearFields();
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




