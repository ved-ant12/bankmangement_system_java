
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

 
public class  balance_enquiry extends JFrame implements ActionListener
{
    
    JLabel info_amount ;
    JButton back;
    String pin_num,cardnumber;
   
    public balance_enquiry(String pin_num,String cardnumber)
    {   this.pin_num=pin_num;
        this.cardnumber=cardnumber;
         setLayout(null);
         setTitle(" balance enquiry Page");
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,900,900);
        add(label);
         int balance=0;
          con c =new con();
         try
             { 
                 String query="SELECT * FROM bank where pin='"+pin_num+"' ";
                 ResultSet rs=c.s.executeQuery(query);  
                 
                 while(rs.next())
                 {
                     if(rs.getString("type").equals("_____Deposite"))
                     {
                         balance=balance+Integer.parseInt(rs.getString("amount"));
                     }
                     else
                     {
                           balance=balance-Integer.parseInt(rs.getString("amount"));
                     }
                 }
                 
              
           } 
              catch(Exception ex)
               {
                System.out.println(ex);
               }
        
        
        
        
        info_amount=new JLabel("your account balance is"+balance);
        info_amount.setBounds(180,289,310,20);
        info_amount.setFont(new Font("osward",Font.BOLD,16));
        info_amount.setForeground(Color.WHITE);
        info_amount.setBackground(Color.black);
        info_amount.setOpaque(true);
        label.add(info_amount);
  
        back=new JButton("Back");
        back.setBounds(340,421,160,20);
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
   
    }
     public static void main(String args[])
    { 
        new  balance_enquiry("","");   
    }
    
}
