
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

 
public class  mini_statement extends JFrame implements ActionListener
{ 
    
    JLabel bank_name ,text_1,mini,bL;
    JButton back;
    String pin_num,cardnumber;
   
    public mini_statement(String pin_num,String cardnumber)
    {   this.pin_num=pin_num;
         this.cardnumber=cardnumber;
         setLayout(null);
         setTitle(" mini statement Page");
         getContentPane().setBackground(Color.white);
        bank_name=new JLabel("God's ✨  Bank");
        bank_name.setBounds(300,80,310,27);
        bank_name.setFont(new Font("osward",Font.BOLD,26));
        bank_name.setForeground(Color.black);
        bank_name.setBackground(Color.white);
        bank_name.setOpaque(true);
        add(bank_name);
        
        text_1=new JLabel();
        text_1.setFont(new Font("osward",Font.BOLD,14));
        text_1.setBounds(300,156,310,20);
        add(text_1);
    
        mini=new JLabel();
        mini.setFont(new Font("osward",Font.BOLD,14));
        mini.setBounds(200,195,400,350);
        add(mini);
        
         bL=new JLabel();
          bL.setFont(new Font("osward",Font.BOLD,14));
        bL.setBounds(200,570,180,20);
        add(bL);
        
          int balance=0;
          con c =new con();
         try
             { 
                 String query="SELECT * FROM login where card_num='"+cardnumber+"' ";
                 ResultSet rs=c.s.executeQuery(query);  
                 
                 while(rs.next())
                 {
                    text_1.setText("Card Number:-"+rs.getString("card_num").substring(0,4)+"XXXXXXXX"+rs.getString("card_num").substring(12));
                 }
                 
              
           } 
              catch(Exception e)
               {
                System.out.println(e);
               }
            try
             { 
                 String query_1="SELECT * FROM bank where pin='"+pin_num+"' ";
                 ResultSet rs2=c.s.executeQuery(query_1);  
                 
                 while(rs2.next())
                 {
                    mini.setText(mini.getText()+"<html>"+rs2.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs2.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs2.getString("amount")+"<br><html>");
                     if(rs2.getString("type").equals("_____Deposite"))
                     {
                         balance=balance+Integer.parseInt(rs2.getString("amount"));
                     }
                     else
                     {
                           balance=balance-Integer.parseInt(rs2.getString("amount"));
                     }
                 
                 }
                 bL.setText("current Balance="+balance);
                 
              
           } 
              catch(Exception ex)
               {
                System.out.println(ex);
               }
         
        back=new JButton("Back");
        back.setBounds(340,621,160,20);
        back.setFont(new Font("Releway",Font.BOLD,16));
        add(back); 
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
        new  mini_statement("","");   
    }
    
}
