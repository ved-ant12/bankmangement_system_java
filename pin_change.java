
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
 
public class pin_change extends JFrame implements ActionListener
{
    
    JLabel txt ;
    JButton change,back;
    String pin_num,cardnumber;
    JPasswordField pin ,repin;
    public pin_change(String pin_num,String cardnumber)
    {   this.pin_num=pin_num;
        this.cardnumber=cardnumber;
         setLayout(null);
         setTitle("pin_change Page");
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,900,900);
        add(label);
        txt=new JLabel("change pin");
        txt.setBounds(210,289,310,20);
        txt.setFont(new Font("osward",Font.BOLD,16));
        txt.setForeground(Color.WHITE);
        txt.setBackground(Color.black);
        txt.setOpaque(true);
        label.add(txt);
        
        pin=new JPasswordField();
        pin.setBounds(196,321, 300, 50);
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        add(pin);
    
        repin=new JPasswordField();
        repin.setBounds(196,425, 300, 50);
        repin.setFont(new Font("Raleway",Font.BOLD,30));
        add(repin);    
        
      
 
        change=new JButton("change");
        change.setBounds(196,524,120,20);
        change.setFont(new Font("Releway",Font.BOLD,16));
        label.add(change);        
        change.addActionListener(this);
        
        back=new JButton("Back");
        back.setBounds(340,524,160,20);
        back.setFont(new Font("Releway",Font.BOLD,16));
        label.add(back); 
        back.addActionListener(this);        
        
        
    
        setSize(900,900);
        setVisible(true);
        
         
       
      
    }
  
   public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==back)
        {
            setVisible(false);
            new transaction(pin_num,cardnumber).setVisible(true);
        }
        else  if(e.getSource()==change)
         
        {
            String  pn =pin.getText();
           String  rpin =repin.getText();
            con c =new con();
              try
             { 
                 
                     if(!pn.equals(rpin))
                     {
                        JOptionPane.showMessageDialog(null,"PINs do not match!");
                        return;
                     }
                      if(pn.equals("")||rpin.equals(""))
                     {
                         JOptionPane.showMessageDialog(null," please enter the pin and repin both maindatory to fill it!");
                        return;
                         
                     }
                        
                     else
                     {
                        String query = "update bank set pin ='" + rpin + "' where card_num ='" + cardnumber + "' AND pin ='" + pin_num + "'";

                       String query_1 = "update login set pin_no ='" + rpin + "' where card_num ='" + cardnumber + "' AND pin_no ='" + pin_num + "'";

                       String query_2 = "update signthree set Pin_No ='" + rpin + "' where Card_No ='" + cardnumber + "' AND Pin_NO ='" + pin_num + "'";
                          c.s.executeUpdate(query);
                          c.s.executeUpdate(query_1);
                          c.s.executeUpdate(query_2);
                          JOptionPane.showMessageDialog(null," Pin has been changed ");
                          JOptionPane.showMessageDialog(null,"remind the pin\n"+rpin);  
                          setVisible(false);
                          new transaction(rpin,cardnumber).setVisible(true);
                     }
                 
         
                } 
              catch(Exception ex)
               {
                System.out.println(ex);
               }
              
   
        }
    }
     public static void main(String args[])
    { 
        new  pin_change("","");   
    }
    
}
