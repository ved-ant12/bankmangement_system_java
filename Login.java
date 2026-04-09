
package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{   JButton login,clear,sign_up ;
    JTextField cn;
    JPasswordField pin_box;
    Login()
    {   
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/Close-up of ATM control panel (3).png"));
        Image i5=i4.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel label_1=new JLabel(i6);
        label_1.setBounds(0,0,900,900);
        add(label_1);
        setLayout(null);
        //title of login page
        setTitle("Automated Trailer Machine");
        //adding img   
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, 100);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(100,70,100,100);
        label_1.add(label);
        //label for welcome
        JLabel text=new JLabel("Welcome To ATM ");
        text.setBounds(280, 70, 500,100);
        text.setFont(new Font("osward",Font.BOLD,38));
        text.setForeground(Color.white);
        label_1.add(text);
      //label for card no 
        JLabel cardno=new JLabel("Card Number:");
        cardno.setBounds(100, 210, 270,100);
        cardno.setFont(new Font("Raleway",Font.BOLD,30));
        cardno.setForeground(Color.white);
        label_1.add(cardno);
        cn=new JTextField();
        cn.setBounds(305, 236, 350, 50);
        cn.setFont(new Font("Raleway",Font.BOLD,30));
        label_1.add(cn);
        //for pin
        JLabel pin=new JLabel("Enter Pin:");
        pin.setBounds(100, 310, 270,100);
        pin.setForeground(Color.white);
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        label_1.add(pin);
        pin_box=new JPasswordField();
        pin_box.setBounds(305, 337, 350, 50);
        pin_box.setFont(new Font("Raleway",Font.BOLD,30));
        label_1.add(pin_box);
             //button for sign  
        login =new JButton("sign in");
        login.setBounds(305, 470, 150, 50);
        login.setFont(new Font("Raleway",Font.BOLD,20));
        login.addActionListener(this);
        login.setBackground(Color.blue);
        login.setForeground(Color.white);
        label_1.add(login);
        
        
        //button for clear
        clear =new JButton("clear");
        clear.setBounds(500, 470, 150, 50);
        clear.addActionListener(this);
        clear.setFont(new Font("Raleway",Font.BOLD,20));
        clear.setBackground(Color.blue);
        clear.setForeground(Color.white);
        label_1.add(clear);
        
        //button for clear
         sign_up=new JButton("sing up");
        sign_up.setBounds(305, 560, 350, 50);
        sign_up.addActionListener(this);     
        sign_up.setFont(new Font("Raleway",Font.BOLD,20));
        sign_up.setBackground(Color.blue);
        sign_up.setForeground(Color.white);
        label_1.add(sign_up);
        
      
        setSize(900,900);
        setVisible(true);  
        setLocation(250,90);
        
        getContentPane().setBackground(Color.YELLOW);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==login)
        {    
            
          try
            {  con c =new con();
             String cardnumber=cn.getText();
             String pin_num=pin_box.getText();
             
             String query="SELECT * FROM login where card_num='"+cardnumber+"' and pin_no='"+pin_num+"' ";
             ResultSet rs=c.s.executeQuery(query);  
               if(rs.next())
               {
                 setVisible(false);
                 new transaction(pin_num,cardnumber).setVisible(true);
               }
               else
               {
                 JOptionPane.showMessageDialog(null," wrong card number and pin");
               }
             }
             
             catch(Exception ex)
          {
              System.out.println(ex);
          }
        }
        else if(e.getSource()==clear)
        {cn.setText("");
         pin_box.setText("");
         }
        else if(e.getSource()==sign_up)
        {
            setVisible(false);
            new signupone().setVisible(true);
        }
        
    }
    public static void main(String args[])
    { 
        new Login();       
    }
    
}
