
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
 
public class cash_withdraw extends JFrame implements ActionListener
{
    
    JLabel info_amount ;
    JButton withdraw,back;
    String pin_num,cardnumber;;
    JTextField withdraw_amount;
    public cash_withdraw(String pin_num,String cardnumber)
    {   this.cardnumber=cardnumber;
        this.pin_num=pin_num;
         setLayout(null);
         setTitle("Cash withdraw Page");
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,900,900);
        add(label);
        info_amount=new JLabel("please enter amount for withdraw");
        info_amount.setBounds(210,289,310,20);
        info_amount.setFont(new Font("osward",Font.BOLD,16));
        info_amount.setForeground(Color.WHITE);
        info_amount.setBackground(Color.black);
        info_amount.setOpaque(true);
        label.add(info_amount);
        withdraw_amount=new JTextField();
        withdraw_amount.setBounds(196,321, 300, 50);
        withdraw_amount.setFont(new Font("Raleway",Font.BOLD,30));
        add(withdraw_amount);
        
      
 
        withdraw=new JButton("withdraw");
        withdraw.setBounds(196,421,120,20);
        withdraw.setFont(new Font("Releway",Font.BOLD,16));
        label.add(withdraw);        
        withdraw.addActionListener(this);
        
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
        else  if(e.getSource()==withdraw)
         
        {
            String  amount =withdraw_amount.getText();
            con c =new con();
              try
             { 
                String query="SELECT * FROM bank where pin='"+pin_num+"'";
                 ResultSet rs=c.s.executeQuery(query);  
                 int balance=0;
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
                 if(e.getSource()!=back && balance<Integer.parseInt(amount))
                 {
                     JOptionPane.showMessageDialog(null," Insufficient Balance");
                     return ;
                 }
                 else
                 {
                     String type="cash_withdraw";
                     Date d=new Date();
                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                     String date = sdf.format(d);
                     String query_1="insert into  bank values('"+pin_num+"','"+date+"','"+type+"','"+amount+"','"+cardnumber+"')";
                     c.s.executeUpdate(query_1); 
                     JOptionPane.showMessageDialog(null,"Rs"+amount+"   successfully withdraw");
                     setVisible(false);
                     new transaction(pin_num,cardnumber).setVisible(true);
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
        new  cash_withdraw("","");   
    }
    
}
