
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.Statement;
import java.text.SimpleDateFormat;
 
public class Deposite extends JFrame implements ActionListener
{
    
    JLabel info_amount ;
    JButton deposite,back;
    String pin_num,cardnumber;
    JTextField deposite_amount;
    public Deposite(String pin_num,String cardnumber)
    {   this.cardnumber=cardnumber;
        this.pin_num=pin_num;
         setLayout(null);
         setTitle("Deposite Page");
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,900,900);
        add(label);
        info_amount=new JLabel("please enter amount");
        info_amount.setBounds(210,289,310,20);
        info_amount.setFont(new Font("osward",Font.BOLD,16));
        info_amount.setForeground(Color.WHITE);
        info_amount.setBackground(Color.black);
        info_amount.setOpaque(true);
        label.add(info_amount);
        deposite_amount=new JTextField();
        deposite_amount.setBounds(196,321, 300, 50);
        deposite_amount.setFont(new Font("Raleway",Font.BOLD,30));
        add(deposite_amount);
        
      
 
        deposite=new JButton("Deposite");
        deposite.setBounds(196,421,120,20);
        deposite.setFont(new Font("Releway",Font.BOLD,16));
        label.add(deposite);        
        deposite.addActionListener(this);
        
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
        else  if(e.getSource()==deposite)
         
        {
           
              try
             { 
              String type="_____Deposite";
              String number=deposite_amount.getText();
              Date d=new Date();
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
              String date = sdf.format(d);
              if(number.equals(""))
              {
                JOptionPane.showMessageDialog(null,"please enter amount");
              }
            else
            {
                 con c =new con();
                String query="insert into  bank values('"+pin_num+"','"+date+"','"+type+"','"+number+"','"+cardnumber+"')";
                c.s.executeUpdate(query);  
                 JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
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
        new  Deposite("","");   
    }
    
}
