
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{   JButton login,clear,sign_up ;
    JTextField cn;
    JPasswordField pin_box;
    Login()
    {   
        setLayout(null);
        //title of login page
        setTitle("Automated Trailer Machine");
        //adding img   
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, 100);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(100,70,100,100);
        add(label);
        //label for welcome
        JLabel text=new JLabel("welcome to ATM ");
        text.setBounds(280, 70, 500,100);
        text.setFont(new Font("osward",Font.BOLD,38));
       text.setBackground(Color.white);
        text.setOpaque(true);
        add(text);
      //label for card no 
        JLabel cardno=new JLabel("Card Number:");
        cardno.setBounds(100, 210, 270,100);
        cardno.setFont(new Font("Raleway",Font.BOLD,30));
        add(cardno);
         cn=new JTextField();
        cn.setBounds(305, 236, 350, 50);
        cn.setFont(new Font("Raleway",Font.BOLD,30));
        add(cn);
        //for pin
        JLabel pin=new JLabel("Enter Pin:");
        pin.setBounds(100, 310, 270,100);
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        add(pin);
        pin_box=new JPasswordField();
        pin_box.setBounds(305, 337, 350, 50);
        pin_box.setFont(new Font("Raleway",Font.BOLD,30));
        add(pin_box);
             //button for sign  
        login =new JButton("sign in");
        login.setBounds(305, 470, 150, 50);
        login.addActionListener(this);
        add(login);
        
        
        //button for clear
        clear =new JButton("clear");
        clear.setBounds(500, 470, 150, 50);
        clear.addActionListener(this);
        add(clear);
        
        //button for clear
         sign_up=new JButton("sing up");
        sign_up.setBounds(305, 560, 350, 50);
        sign_up.addActionListener(this);
        add(sign_up);
        
      
        setSize(1000,700);
        setVisible(true);  
        setLocation(250,90);
        
        getContentPane().setBackground(Color.YELLOW);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==login)
        {
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
