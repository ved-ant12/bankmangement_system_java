
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
 
public class fast_Cash extends JFrame implements ActionListener
{
    
    JLabel info_amount ;
    JButton Rs100,Rs500,Rs1000,Rs2000,Rs5000,Rs10000,back;
    String pin_num,cardnumber;
    public fast_Cash(String pin_num,String cardnumber)
    {   this.pin_num=pin_num;
        this.cardnumber=cardnumber;
         setLayout(null);
         setTitle("Fast Cash withdraw Page");
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,900,900);
        add(label);
        info_amount=new JLabel("Select Withdrawl Amount");
        info_amount.setBounds(210,289,310,20);
        info_amount.setFont(new Font("osward",Font.BOLD,16));
        info_amount.setForeground(Color.WHITE);
        info_amount.setBackground(Color.black);
        info_amount.setOpaque(true);
        label.add(info_amount);
           
     
        
        Rs100=new JButton("Rs 100");
        Rs100.setBounds(196,330,120,20);
        Rs100.setFont(new Font("Releway",Font.BOLD,16));
        label.add(Rs100);
        Rs100.addActionListener(this);

        Rs500=new JButton("Rs 500");
        Rs500.setBounds(340,330,150,20);
        Rs500.setFont(new Font("Releway",Font.BOLD,16));
        label.add(Rs500); 
        Rs500.addActionListener(this);


        Rs1000=new JButton("Rs 1000");
        Rs1000.setBounds(196,375,120,20);
        Rs1000.setFont(new Font("Releway",Font.BOLD,16));
        label.add(Rs1000);  
        Rs1000.addActionListener(this);
        
        Rs2000=new JButton("Rs 2000");
        Rs2000.setBounds(340,375,150,20);
        Rs2000.setFont(new Font("Releway",Font.BOLD,16));
        label.add(Rs2000);
        Rs2000.addActionListener(this);
 
        Rs5000=new JButton("Rs 5000");
        Rs5000.setBounds(196,421,120,20);
        Rs5000.setFont(new Font("Releway",Font.BOLD,16));
        label.add(Rs5000);   
         Rs5000.addActionListener(this);  
        
        Rs10000=new JButton("Rs 10000");
        Rs10000.setBounds(340,421,160,20);
        Rs10000.setFont(new Font("Releway",Font.BOLD,16));
        label.add(Rs10000); 
        Rs10000.addActionListener(this);        
        
        
        back=new JButton("Exit");
        back.setBounds(340,500,150,20);
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
        else  if(e.getSource()==Rs100 || e.getSource()==Rs500 || 
        e.getSource()==Rs1000 || e.getSource()==Rs2000 || 
        e.getSource()==Rs5000 || e.getSource()==Rs10000)
         
        {   
            String  amount =((JButton)e.getSource()).getText().substring(3);
            con c =new con();
              try
             { 
                 String query="SELECT * FROM bank where pin='"+pin_num+"' ";
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
                     return;
                 }
                 else
                 {
                     String type="Fast_withdraw";
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
        new  fast_Cash("","");   
    }
    
}
