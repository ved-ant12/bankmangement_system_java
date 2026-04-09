
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

 
public class signupthree extends JFrame implements ActionListener
{
   
    long random, pin_gn;
    JLabel account_details,account_type,card,card_NO,card_pt,pin,pin_NO,pin_pt,sevices;
    JRadioButton saving,fixed,current,recurring;
    JButton submit,cancel;
    ButtonGroup Agroup;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    public signupthree(String formno)
    { 
        this.formno=formno;
         setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE3");
          setSize(1000,700);
        
        setLocation(250,90);
        getContentPane().setBackground(Color.black);
        
        account_details=new JLabel("Page No.3 :Account Details" );
        account_details.setBounds(220,74,500,50);
        account_details.setFont(new Font("osward",Font.BOLD,25));
        account_details.setForeground(Color.WHITE);
        account_details.setBackground(Color.black);
        account_details.setOpaque(true);
        add(account_details);
                //account_type label
        account_type=new JLabel("Account Types:");
        account_type.setBounds(100,130,167,26);
        account_type.setFont(new Font("osward",Font.BOLD,20));
        account_type.setForeground(Color.WHITE);
        account_type.setBackground(Color.black);
        account_type.setOpaque(true);
        add(account_type);
        saving = new JRadioButton("Saving Account");
        saving.setBounds(100,165,130,26);
        saving.setBackground(Color.WHITE);
        add(saving);

        fixed = new JRadioButton("Fixed Deposite");  
        fixed.setBounds(254,165,140,26);
        fixed.setBackground(Color.WHITE);
        add(fixed); 

        current= new JRadioButton("current Account");  
        current.setBounds(100,197,130,26);
        current.setBackground(Color.WHITE);
        add(current); 
        recurring= new JRadioButton("Recurring Deposite");  
        recurring.setBounds(254,197,140,26);
        recurring.setBackground(Color.WHITE);
        add(recurring); 
         Agroup = new ButtonGroup();
         Agroup.add(saving);
         Agroup.add(fixed); 
         Agroup.add(current); 
         Agroup.add(recurring);
         
     
        
        //card
        card=new JLabel("Card Number:");
        card.setBounds(100,247,146,32);
        card.setFont(new Font("osward",Font.BOLD,20));
        card.setForeground(Color.WHITE);
        card.setBackground(Color.black);
        card.setOpaque(true);
        add(card);  
        card_NO=new JLabel("XXXX-XXXX-XXXX-1212");
        card_NO.setBounds(260,247,256,32);
        card_NO.setFont(new Font("osward",Font.BOLD,20));
        card_NO.setForeground(Color.WHITE);
        card_NO.setBackground(Color.black);
        card_NO.setOpaque(true);
        add(card_NO);
        card_pt=new JLabel("your 16 digit card no");
        card_pt.setBounds(100,278,146,15);
        card_pt.setFont(new Font("osward",Font.BOLD,12));
        card_pt.setForeground(Color.WHITE);
        card_pt.setBackground(Color.black);
        card_pt.setOpaque(true);
        add(card_pt);  
       
        pin=new JLabel("pin Number:");
        pin.setBounds(100,312,146,32);
        pin.setFont(new Font("osward",Font.BOLD,20));
        pin.setForeground(Color.WHITE);
        pin.setBackground(Color.black);
        pin.setOpaque(true);
        add(pin);  
        pin_NO=new JLabel("XXXX");
        pin_NO.setBounds(260,312,256,32);
        pin_NO.setFont(new Font("osward",Font.BOLD,20));
        pin_NO.setForeground(Color.WHITE);
        pin_NO.setBackground(Color.black);
        pin_NO.setOpaque(true);
        add(pin_NO);
        pin_pt=new JLabel("your 4 digit pin no");
        pin_pt.setBounds(100,347,146,15);
        pin_pt.setFont(new Font("osward",Font.BOLD,12));
        pin_pt.setForeground(Color.WHITE);
        pin_pt.setBackground(Color.black);
        pin_pt.setOpaque(true);
        add(pin_pt);  
      
        sevices=new JLabel("Services Required");
        sevices.setBounds(100,393,186,32);
        sevices.setFont(new Font("osward",Font.BOLD,20));
        sevices.setForeground(Color.WHITE);
        sevices.setBackground(Color.black);
        sevices.setOpaque(true);
        add(sevices);  
 
        c1 = new JCheckBox("ATM CARD");  
        c1.setBounds(100,448,140,26);
        c1.setBackground(Color.WHITE);
        add(c1);     
        
        c2 = new JCheckBox("Internet Banking");  
        c2.setBounds(254,448,140,26);
        c2.setBackground(Color.WHITE);
        add(c2);     
        
        c3 = new JCheckBox("Mobile Banking");  
        c3.setBounds(100,497,140,26);
        c3.setBackground(Color.WHITE);
        add(c3);
        
        c4 = new JCheckBox("Email& SMS Alert");  
        c4.setBounds(258,497,140,26);
        c4.setBackground(Color.WHITE);
        add(c4);             
       
        c5= new JCheckBox("Cheque Book");  
        c5.setBounds(100,532,140,26);
        c5.setBackground(Color.WHITE);
        add(c5);    
        
        c6 = new JCheckBox("E- Statement");  
        c6.setBounds(258,532,140,26);
        c6.setBackground(Color.WHITE);
        add(c6);    
        
        sevices=new JLabel("condition Required");
        sevices.setBounds(100,585,186,20);
        sevices.setFont(new Font("osward",Font.BOLD,20));
        sevices.setForeground(Color.WHITE);
        sevices.setBackground(Color.black);
        sevices.setOpaque(true);
        add(sevices); 
        c7 = new JCheckBox(" I hearby declares that the above entered details are correct to the best of my knowledge ");  
        c7.setBounds(100,608,528,26);
        c7.setFont(new Font("osward",Font.BOLD,12));
        c7.setBackground(Color.WHITE);
        add(c7);   
        
        cancel=new JButton("cancel");
        cancel.setBounds(234,640,100,30);
        cancel.setFont(new Font("Releway",Font.BOLD,20));
        add(cancel);
        cancel.addActionListener(this);
        setVisible(true);
        
        
        submit=new JButton("submit");
        submit.setBounds(100,640,100,30);
        submit.setFont(new Font("Releway",Font.BOLD,20));
        add(submit);
        submit.addActionListener(this);
        setVisible(true);
        
        
       
      
    }
  
   public void actionPerformed(ActionEvent e)
    {  
        String form_no=""+formno;
        
        if(e.getSource()==submit)
        {
          String tacc="";
          if(saving.isSelected())
          { 
             tacc="Saving Account";
          }
          else if(fixed.isSelected())
          {
             tacc="Fixed Deposite Account";  
          }
          else if(current.isSelected())
          {
              tacc="current Account";  
          }    
           else if(recurring.isSelected())
          {
             tacc="Recurring Deposite Account";  
          }  
          Random ran=new Random();
          random =Math.abs((ran.nextLong() % 90000000L) + 4165051200000000L);
          String card_num=""+random;
          pin_gn=Math.abs((ran.nextLong() % 9000L) + 1000L);
          String pin_num=""+pin_gn;
         String facilities="";
          if(c1.isSelected())
          { 
             facilities=facilities+"ATM CARD ";
          }
          if(c2.isSelected())
          {
             facilities=facilities+",Internet Banking ";
          }
          if(c3.isSelected())
          {
             facilities=facilities+",MObile Banking ";
          }    
          if(c4.isSelected())
          {
             facilities=facilities+",Email& SMS Alert ";
          } 
          if(c5.isSelected())
          {
             facilities=facilities+",cheque Book ";
          }
          if(c6.isSelected())
          {
              facilities=facilities+",E-Statement ";
          }    
          String condition="";
          if(c7.isSelected())
          {
              condition="True";
          }
           try
          {   
              if(condition.equals(""))
              {
                   JOptionPane.showMessageDialog(null,"plase check the condition");
              }
               if(tacc.equals(""))
               {
                JOptionPane.showMessageDialog(null,"plase select account type");
                }
               else
               {   
                   JOptionPane.showMessageDialog(null,"please note next the card number and pin ");
                   JOptionPane.showMessageDialog(null,"Card NO:-"+ card_num +"\nPin N0:-"+pin_num);
                   con c =new con();
                   String query="INSERT INTO signthree values('"+form_no+"','"+tacc+"','"+card_num+"','"+pin_num+"','"+facilities+"')";
                  String query_1="INSERT INTO login values('"+form_no+"','"+card_num+"','"+pin_num+"')";

                   c.s.executeUpdate(query);  
                    c.s.executeUpdate(query_1); 
                   JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
                   setVisible(false);
                   new  Deposite(pin_num,card_num).setVisible(true);
                                  
               }
               
          } 
          catch(Exception ex)
          {
              System.out.println(ex);
          }

        
      }
        
      else if(e.getSource()==cancel)
      { 
            
            setVisible(false);
            new Login().setVisible(true);
            
       }
        
     } 
    
     public static void main(String args[])
    { 
        new  signupthree("");   
    }
    
}

