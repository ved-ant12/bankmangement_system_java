
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.Statement;
 
public class signupone extends JFrame implements ActionListener
{
    long random;
    JLabel formno,person_details,name,father_name,DOB,gender,email,marital,Address,city,state,pincode;
    JTextField name_box,father_box,email_box,address_box,city_box,state_box,pin_box;
    JRadioButton male,female,unmarried,married;
    JDateChooser DOB_Box ;
    JButton next;
    
    public signupone()
    {
         setLayout(null);
         Random ran=new Random();
         //random variable
         random =Math.abs((ran.nextLong() % 9000L) + 1000L);
        //title of login page
        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE1");
          setSize(1000,700);
        
        setLocation(250,90);
        getContentPane().setBackground(Color.black);
        formno=new JLabel("Application Form No "+random);
        formno.setBounds(200,20,500,50);
        formno.setFont(new Font("osward",Font.BOLD,30));
        formno.setForeground(Color.WHITE);
        formno.setBackground(Color.black);
        formno.setOpaque(true);
        add(formno);
        person_details=new JLabel("Page No.1 :Personal Details ");
        person_details.setBounds(220,74,500,50);
        person_details.setFont(new Font("osward",Font.BOLD,25));
        person_details.setForeground(Color.WHITE);
        person_details.setBackground(Color.black);
        person_details.setOpaque(true);
        add(person_details);
        
        //name label
        name=new JLabel("Name:");
        name.setBounds(100,133,80,22);
        name.setFont(new Font("osward",Font.BOLD,20));
        name.setForeground(Color.WHITE);
        name.setBackground(Color.black);
        name.setOpaque(true);
        add(name);
        
        name_box=new JTextField();
        name_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        name_box.setBounds(225,133,400,22);
        name_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(name_box);
        //fathers name
        father_name=new JLabel("Father Name:");
        father_name.setBounds(100,169,143,22);
        father_name.setFont(new Font("osward",Font.BOLD,20));
        father_name.setForeground(Color.WHITE);
        father_name.setBackground(Color.black);
        father_name.setOpaque(true);
        add(father_name);
        father_box=new JTextField();
        father_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        father_box.setBounds(225,169,400,22);
        father_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(father_box);
        //DOB
        DOB=new JLabel("Date of Birth:");
        DOB.setBounds(100,199,138,22);
        DOB.setFont(new Font("osward",Font.BOLD,20));
        DOB.setForeground(Color.WHITE);
        DOB.setBackground(Color.black);
        DOB.setOpaque(true);
        add(DOB);
        DOB_Box = new JDateChooser();
        DOB_Box.setBounds(225,199,400,22);
        add(DOB_Box);
        
        //gender
        gender=new JLabel("Gender:");
        gender.setBounds(100,227,100,22);
        gender.setFont(new Font("osward",Font.BOLD,20));
        gender.setForeground(Color.WHITE);
        gender.setBackground(Color.black);
        gender.setOpaque(true);
        add(gender);  
        
        male=new JRadioButton("Male");
        male.setBounds(225,227,70, 20);
        male.setFont(new Font("osward",Font.BOLD,20));
        male.setBackground(Color.red);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(310,227,100, 20);
        female.setFont(new Font("osward",Font.BOLD,20));
        female.setBackground(Color.green);
        add(female);
        ButtonGroup gender_group=new ButtonGroup();
        gender_group.add(male);
        gender_group.add(female);
        //E-mail address
        email=new JLabel("Enter E-mail Adddress:");
        email.setBounds(100,255,219,22);
        email.setFont(new Font("osward",Font.BOLD,20));
        email.setForeground(Color.WHITE);                                   
        email.setBackground(Color.black);
        email.setOpaque(true);
        add(email);
        email_box=new JTextField();
        email_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        email_box.setBounds(400,255,300,22);
        email_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(email_box);
        //marital status
        marital=new JLabel("Marital Status:");
        marital.setBounds(100,282,150,22);
        marital.setFont(new Font("osward",Font.BOLD,20));
        marital.setForeground(Color.WHITE);
        marital.setBackground(Color.black);
        marital.setOpaque(true);
        add(marital);
         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(245,282,130, 20);
        unmarried.setFont(new Font("osward",Font.BOLD,20));
        unmarried.setBackground(Color.red);
        add(unmarried);
         married=new JRadioButton("Married");
        married.setBounds(390,282,130, 20);
        married.setFont(new Font("osward",Font.BOLD,20));
        married.setBackground(Color.green);
        add(married);
        ButtonGroup status_group=new ButtonGroup();
        status_group.add(unmarried);
        status_group.add(married);
    
        //Address
        Address=new JLabel("Address:");
        Address.setBounds(100,310,100,40);
        Address.setFont(new Font("osward",Font.BOLD,20));
        Address.setForeground(Color.WHITE);
        Address.setBackground(Color.black);
        Address.setOpaque(true);
        add(Address);   
        address_box=new JTextField();
        address_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        address_box.setBounds(225,312,400,40);
        address_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(address_box);
     
        //city
        city=new JLabel("City:");
        city.setBounds(100,360,100,20);
        city.setFont(new Font("osward",Font.BOLD,20));
        city.setForeground(Color.WHITE);
        city.setBackground(Color.black);
        city.setOpaque(true);
        add(city);  
        city_box=new JTextField();
        city_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        city_box.setBounds(225,360,400,30);
        city_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(city_box);
        
        //state
        state=new JLabel("State:");
        state.setBounds(100,399,100,20);
        state.setFont(new Font("osward",Font.BOLD,20));
        state.setForeground(Color.WHITE);
        state.setBackground(Color.black);
        state.setOpaque(true);
        add(state); 
        
        state_box=new JTextField();
        state_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        state_box.setBounds(225,399,400,30);
        state_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(state_box);

        //pincode
        pincode=new JLabel("Pincode:");
        pincode.setBounds(100,435,100,20);
        pincode.setFont(new Font("osward",Font.BOLD,20));
        pincode.setForeground(Color.WHITE);
        pincode.setBackground(Color.black);
        pincode.setOpaque(true);
        add(pincode); 

        pin_box=new JTextField();
        pin_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        pin_box.setBounds(225,435,400,30);
        pin_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(pin_box);
        
        next=new JButton("next");
        next.setBounds(300,500,100,30);
        next.setFont(new Font("Releway",Font.BOLD,20));
        add(next);
        next.addActionListener(this);
        setVisible(true);
        
         
       
      
    }
  
   public void actionPerformed(ActionEvent e)
    {
        String form_no=" "+random;
        String name=name_box.getText();
        String fname=father_box.getText();
        String dob=((JTextField)DOB_Box.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected())
        {   gender="Male";
          }
        else if(female.isSelected())
        {
            gender="Female";
        }
        String e_mail=email_box.getText();
        String married_status=null;
        if(unmarried.isSelected())
        {
            married_status="unmarried";
        }
        else if(married.isSelected())
        {
            married_status="married";  
        }
        
        String address=address_box.getText();
        String city=city_box.getText();
        String  State=state_box.getText(); 
        String  Pin=pin_box.getText();
                
        
         
          try
          {
               if(name.equals(""))
               {
                JOptionPane.showMessageDialog(null,"plase enter your name");
                }
               else
               {
                   con c =new con();
                   String query="INSERT INTO signup values('"+form_no+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+e_mail+"','"+married_status+"','"+address+"','"+city+"','"+State+"','"+Pin+"')";
                   c.s.executeUpdate(query);  
                   JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
                  setVisible(false);
                  new signuptwo(form_no).setVisible(true);
               }
               
          }
          catch(Exception ex)
          {
              System.out.println(ex);
          }
         } 
    
     public static void main(String args[])
    { 
        new  signupone();   
    }
    
}
