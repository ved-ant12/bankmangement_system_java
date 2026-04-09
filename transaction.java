
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.Statement;
 
public class transaction extends JFrame implements ActionListener
{
    
    JLabel person_details;
    JButton deposite,cashwithdraw,fastcash,ministatement,pinchange,Balance,exit;
    String pin_num,cardnumber;
    public transaction(String pin_num ,String cardnumber)
    {   this.pin_num=pin_num;
        this.cardnumber=cardnumber;
         setLayout(null);
         setTitle("Transaction Page");
        
         
         
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0,0,900,900);
        add(label);
        person_details=new JLabel("please Select your transaction");
        person_details.setBounds(210,289,310,20);
        person_details.setFont(new Font("osward",Font.BOLD,16));
        person_details.setForeground(Color.WHITE);
        person_details.setBackground(Color.black);
        person_details.setOpaque(true);
        label.add(person_details);
        
        deposite=new JButton("deposite");
        deposite.setBounds(196,330,120,20);
        deposite.setFont(new Font("Releway",Font.BOLD,16));
        label.add(deposite);
        deposite.addActionListener(this);

        cashwithdraw=new JButton("cash withdraw");
        cashwithdraw.setBounds(340,330,150,20);
        cashwithdraw.setFont(new Font("Releway",Font.BOLD,16));
        label.add(cashwithdraw); 
        cashwithdraw.addActionListener(this);


        fastcash=new JButton("fast cash");
        fastcash.setBounds(196,375,120,20);
        fastcash.setFont(new Font("Releway",Font.BOLD,16));
        label.add(fastcash);  
        fastcash.addActionListener(this);
        
        ministatement=new JButton("mini statement");
        ministatement.setBounds(340,375,150,20);
        ministatement.setFont(new Font("Releway",Font.BOLD,16));
        label.add(ministatement);
        ministatement.addActionListener(this);
 
        pinchange=new JButton("pin change");
        pinchange.setBounds(196,421,120,20);
        pinchange.setFont(new Font("Releway",Font.BOLD,16));
        label.add(pinchange);        
        pinchange.addActionListener(this);
        
        
        Balance=new JButton("Balance Enquiry");
        Balance.setBounds(340,421,160,20);
        Balance.setFont(new Font("Releway",Font.BOLD,16));
        label.add(Balance); 
        Balance.addActionListener(this);        
        
        
        exit=new JButton("Exit");
        exit.setBounds(340,500,150,20);
        exit.setFont(new Font("Releway",Font.BOLD,16));
        label.add(exit);
        exit.addActionListener(this);       
        
        
        
        
        
        setSize(900,900);
        setVisible(true);
        
         
       
      
    }
  
   public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==deposite)
        {
            setVisible(false);
            new Deposite(pin_num,cardnumber).setVisible(true);
        }
        else  if(e.getSource()==cashwithdraw)
         
        {
             setVisible(false);
            new cash_withdraw(pin_num,cardnumber).setVisible(true);
        }
        else if(e.getSource()==fastcash)
        {
            setVisible(false);
            new fast_Cash(pin_num,cardnumber).setVisible(true);
        }
        else if(e.getSource()==ministatement)
        {
                 setVisible(false);
                  new mini_statement(pin_num,cardnumber).setVisible(true);  
        }
        else if(e.getSource()==pinchange)
        {
            setVisible(false);
            new pin_change(pin_num,cardnumber).setVisible(true);
        }
        else if(e.getSource()==Balance)
         {
            setVisible(false);
            new balance_enquiry(pin_num,cardnumber).setVisible(true);  
            
          }
        else if(e.getSource()==exit)
         {
            System.exit(0);
          }
              
     } 
   
    
     public static void main(String args[])
    { 
        new  transaction("","");   
    }
    
}
