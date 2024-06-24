
package hospitalmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class InventoryUI {
    

    private JFrame  f1,                                                         //Main Frame
                    fadd, fupd;                                                 //Frame for Button Actions
    private JLabel  l1, l4, l5, l6, l7, limg,                                   // Main Label
                    lfadd, lcate, lprodname, lstock, lloc, llotn, lexd, limg1,  //Labels for the Add Action 
                    lupdt, lupc, luppn, lupst, luploc, luplotn, lupexd, limg2;  //Labels for the Update Action
    private JPanel  p1,                                                         //Main Panel
                    pact, padd, pupd, pimg2, pimg3;                             //Panels for Button Action
    private JButton b1, badd, bupd, bdel,                                       //Main Buttons
                    bnewitem, bupditem;                                         //Buttons for Adding and Updationg
    private JTextField tprodname, texdt,                                        //Main TextField
                       tadd1, tadd2, tadd3, tadd4, tadd5, tadd6,                //TextField for the Add Action
                       tup1, tup2, tup3, tup4, tup5 , tup6;                     //TextField for the 
    private JComboBox cbtype;                                                   //ComboBox for Searching
    private JTable t1;                                                          //Table for Database
    private JScrollPane spt; 

    InventoryUI() {
//-------------------THE MAIN FRAME---------------------------        
        // Frame settings
        f1 = new JFrame("Group8 OOP");
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.white);

//-------------------THE MAIN LABELS--------------------------        
        
        // Label settings
        l1 = new JLabel("Inventory");
        l1.setBounds(40, 0, 600, 100);
        l1.setFont(new Font("cooper black",Font.PLAIN,50));
        l1.setForeground(Color.black);
        
        l7 = new JLabel("______________________________________________________________________________");
        l7.setBounds(0, 30, 2000, 100);
        l7.setFont(new Font("Arial",Font.PLAIN,30));
        l7.setForeground(Color.BLACK);
        
        l4 = new JLabel("Product Name:");
        l4.setBounds(20, 80, 300, 100);
        l4.setFont(new Font("Arial",Font.PLAIN,20));
        l4.setForeground(Color.black);
        
        
        l5 = new JLabel("Expiration Date:");
        l5.setBounds(330, 80, 300, 100);
        l5.setFont(new Font("Arial",Font.PLAIN,20));
        l5.setForeground(Color.black);
        
        l6 = new JLabel("Category:");
        l6.setBounds(615, 80, 300, 100);
        l6.setFont(new Font("Arial",Font.PLAIN,20));
        l6.setForeground(Color.black);
        
//-------------------------------BUTTONS (ACTIONS)------------------------------        
        pact = new JPanel();
        pact.setBounds(885, 0, 300, 700);
        pact.setBackground(new Color(0,0,0,64));
        
        badd = new JButton("Add New Item");
        badd.setBounds(935, 175, 200, 80);
        badd.setFont(new Font("Arial",Font.PLAIN,20));
        badd.setForeground(Color.black);       
//- - - - - - - - - - - - COMPONENTS FOR ADD NEW ITEM- - - - - - - - - - - - -         
        badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fadd = new JFrame("New Item Information");
                fadd.setSize(550, 500);                  
                padd = new JPanel();
                padd.setBounds(0, 0,550, 500);

                ImageIcon imglb1 = new ImageIcon("Images/inventoryadding.jpg");
                Image imglb12 = imglb1.getImage().getScaledInstance(550, 500, Image.SCALE_SMOOTH);
                ImageIcon imglb13 = new ImageIcon(imglb12);
        
                pimg3 = new JPanel();
                pimg3.setSize(550, 500);       
                limg1 = new JLabel(imglb13);
                pimg3.add(limg1);
                
                padd.setLayout(new BorderLayout());
                padd.add(pimg3, BorderLayout.CENTER);   
                
                    lfadd = new JLabel("Item Information");                   
                    lfadd.setLocation(10, 10);
                    lfadd.setSize(400, 25);
                    lfadd.setFont(new Font("Arial black",Font.PLAIN,32));
                    lfadd.setForeground(Color.white);
                                       
                    lcate = new JLabel("Category:");
                    lcate.setBounds(20, 60, 100, 20);
                    lcate.setFont(new Font("Arial",Font.PLAIN,18));
                    lcate.setForeground(Color.white);
                    tadd1 = new JTextField();
                    tadd1.setBounds(180, 60, 300, 27);
                    
                    lprodname = new JLabel("Product Name:");
                    lprodname.setBounds(20, 110, 150, 20);
                    lprodname.setFont(new Font("Arial",Font.PLAIN,18));
                    lprodname.setForeground(Color.white);
                    tadd2 = new JTextField();
                    tadd2.setBounds(180, 110, 300, 27);
                                        
                    lstock = new JLabel("Current Stock:");
                    lstock.setBounds(20, 160, 150, 20);
                    lstock.setFont(new Font("Arial",Font.PLAIN,18));
                    lstock.setForeground(Color.white);
                    tadd3 = new JTextField();
                    tadd3.setBounds(180, 160, 300, 27);
                    
                    lloc = new JLabel("Location:");
                    lloc.setBounds(20, 210, 100, 20);
                    lloc.setFont(new Font("Arial",Font.PLAIN,18));
                    lloc.setForeground(Color.white);
                    tadd4 = new JTextField();
                    tadd4.setBounds(180, 210, 300, 27);                    

                    llotn = new JLabel("Lot Number:");
                    llotn.setBounds(20, 260, 100, 20);
                    llotn.setFont(new Font("Arial",Font.PLAIN,18));
                    llotn.setForeground(Color.white);
                    tadd5 = new JTextField();
                    tadd5.setBounds(180, 260, 300, 27);
                    
                    lexd = new JLabel("Expiration Date:");
                    lexd.setBounds(20, 310, 150, 20);
                    lexd.setFont(new Font("Arial",Font.PLAIN,18));
                    lexd.setForeground(Color.white);
                    tadd6 = new JTextField();
                    tadd6.setBounds(180, 310, 300, 27);  
                    
                    bnewitem = new JButton("Add the Item");
                    bnewitem.setBounds(350, 370, 150, 60);
                    bnewitem.setFont(new Font("Arial",Font.PLAIN,20));
                    bnewitem.setForeground(Color.black);
                    
        //Adding Object in the Frame            
        padd.add(lfadd);            
        padd.add(lcate);
        padd.add(lprodname);
        padd.add(lstock);
        padd.add(lloc);
        padd.add(llotn);
        padd.add(lexd);
        padd.add(tadd1);
        padd.add(tadd2);
        padd.add(tadd3);
        padd.add(tadd4);
        padd.add(tadd5);
        padd.add(tadd6);
        padd.add(bnewitem);
        padd.add(pimg3);
        
        fadd.add(padd);   
        fadd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fadd.setLocationRelativeTo(null);
        fadd.setVisible(true); 
            }
        });
//- - - - - - - - - - - COMPONENTS FOR UPDATE NEW ITEM- - - - - - - - - - - -          
        bupd = new JButton("Update a Item");
        bupd.setBounds(935, 305, 200, 80);
        bupd.setFont(new Font("Arial",Font.PLAIN,20));
        bupd.setForeground(Color.black);
        
            bupd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fupd = new JFrame("Update Item Details");
                fupd.setSize(550, 500);                  
                pupd = new JPanel();
                pupd.setBounds(0, 0,550, 500);
  
        ImageIcon imglb2 = new ImageIcon("Images/inventoryadding.jpg");
        Image imglb22 = imglb2.getImage().getScaledInstance(550, 500, Image.SCALE_SMOOTH);
        ImageIcon imglb23 = new ImageIcon(imglb22);
        
                pimg2 = new JPanel();
                pimg2.setSize(550, 500);       
                limg2 = new JLabel(imglb23);
                pimg2.add(limg2);
                
                pupd.setLayout(new BorderLayout());
                pupd.add(pimg2, BorderLayout.CENTER);
                
                    lupdt = new JLabel("Item Information");                   
                    lupdt.setLocation(10, 10);
                    lupdt.setSize(400, 25);
                    lupdt.setFont(new Font("Arial black",Font.PLAIN,32));
                    lupdt.setForeground(Color.white);
                                       
                    lupc = new JLabel("Category:");
                    lupc.setBounds(20, 60, 100, 20);
                    lupc.setFont(new Font("Arial",Font.PLAIN,18));
                    lupc.setForeground(Color.white);
                    tup1 = new JTextField();
                    tup1.setBounds(180, 60, 300, 27);
                    
                    luppn = new JLabel("Product Name:");
                    luppn.setBounds(20, 110, 150, 20);
                    luppn.setFont(new Font("Arial",Font.PLAIN,18));
                    luppn.setForeground(Color.white);
                    tup2 = new JTextField();
                    tup2.setBounds(180, 110, 300, 27);
                                        
                    lupst = new JLabel("Current Stock:");
                    lupst.setBounds(20, 160, 150, 20);
                    lupst.setFont(new Font("Arial",Font.PLAIN,18));
                    lupst.setForeground(Color.white);
                    tup3 = new JTextField();
                    tup3.setBounds(180, 160, 300, 27);
                    
                    luploc = new JLabel("Location:");
                    luploc.setBounds(20, 210, 100, 20);
                    luploc.setFont(new Font("Arial",Font.PLAIN,18));
                    luploc.setForeground(Color.white);
                    tup4 = new JTextField();
                    tup4.setBounds(180, 210, 300, 27);                    

                    luplotn = new JLabel("Lot Number:");
                    luplotn.setBounds(20, 260, 100, 20);
                    luplotn.setFont(new Font("Arial",Font.PLAIN,18));
                    luplotn.setForeground(Color.white);
                    tup5 = new JTextField();
                    tup5.setBounds(180, 260, 300, 27);
                    
                    lupexd = new JLabel("Expiration Date:");
                    lupexd.setBounds(20, 310, 150, 20);
                    lupexd.setFont(new Font("Arial",Font.PLAIN,18));
                    lupexd.setForeground(Color.white);
                    tup6 = new JTextField();
                    tup6.setBounds(180, 310, 300, 27);  
                    
                    bupditem = new JButton("Update the Item");
                    bupditem.setBounds(300, 370, 200, 60);
                    bupditem.setFont(new Font("Arial",Font.PLAIN,20));
                    bupditem.setForeground(Color.black);
                    
        //Adding Object in the Frame            
        pupd.add(lupdt);            
        pupd.add(lupc);
        pupd.add(luppn);
        pupd.add(lupst);
        pupd.add(luploc);
        pupd.add(luplotn);
        pupd.add(lupexd);
        pupd.add(tup1);
        pupd.add(tup2);
        pupd.add(tup3);
        pupd.add(tup4);
        pupd.add(tup5);
        pupd.add(tup6);
        pupd.add(bupditem);
        pupd.add(pimg2);
        
        fupd.add(pupd);   
        fupd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fupd.setLocationRelativeTo(null);
        fupd.setVisible(true); 
            }
        });
//- - - - - - - - - - - COMPONENTS FOR DELETE A ITEM- - - - - - - - - - - - - -          
        bdel = new JButton("Delete a Item");
        bdel.setBounds(935, 435, 200, 80);
        bdel.setFont(new Font("Arial",Font.PLAIN,20));
        bdel.setForeground(Color.black);
        
        //Adding Buttons in the Panel
        pact.add(badd);
        pact.add(bupd);
        pact.add(bdel);    
//---------------THE SUPPORTING COMPONENT OF THE MAIN LABEL----------------        
        tprodname = new JTextField();
        tprodname.setBounds(165, 120, 150, 25);
        
        texdt = new JTextField();
        texdt.setBounds(480, 120, 120, 25);
        
        cbtype = new JComboBox();
        cbtype.setBounds(710, 120, 120, 25);
        //Table
        t1 = new JTable();
        t1.setBounds(40, 180, 800, 450);
        
//--------------------------BACKGROUND-IMAGE------------------------------------
        //code for load image
        ImageIcon i1 = new ImageIcon("Images/inventory.png");
        Image i2 = i1.getImage().getScaledInstance(1500, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);      
        //label for the pic
        limg = new JLabel(i3);   
        //panel for image on the ui and it setttings
        p1 = new JPanel();
        p1.setSize(1500, 700);
        //will add the label to the panel
        p1.add(limg);
//--------------------------------BACK-BUTTON-----------------------------------
        
        //button that goes back to the dashboard
        b1 = new JButton("Back");
        b1.setBounds(1060, 600, 80, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MainUi();
            }
        });
//----------------------------ADD-OBJECT-TO-FRAME-------------------------------     
        f1.add(l1);
        f1.add(l4);
        f1.add(l6);
        f1.add(l7);
        f1.add(t1);
        f1.add(tprodname);
        f1.add(cbtype);
        f1.add(texdt);
        f1.add(badd);
        f1.add(bupd);
        f1.add(bdel);
        f1.add(l5);
        f1.add(b1);
        f1.add(pact);
        f1.add(p1);
  
        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

