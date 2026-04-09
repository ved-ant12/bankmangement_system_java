
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

 
public class signuptwo extends JFrame implements ActionListener
{
   
   
    JLabel additional_details,religion,Category,Income,Educational,Qualification,Occupation,Pan_No,Aadhar_No,senior_Citizen,Existing_Account;
    JTextField Pan_box,Aadhar_No_box;
    JRadioButton syes,sno,eyes,eno;
    JButton next;
    ButtonGroup sgroup,egroup;
    JComboBox religion_box,category_box,Income_Box,Qualification_box,occupation_box;
    String formno;
    public signuptwo(String formno )
    { 
        this.formno=formno;
         setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE2");
          setSize(1000,700);
        
        setLocation(250,90);
        getContentPane().setBackground(Color.black);
        
        additional_details=new JLabel("Page No.2 :Addition Details ");
        additional_details.setBounds(220,74,500,50);
        additional_details.setFont(new Font("osward",Font.BOLD,25));
        additional_details.setForeground(Color.WHITE);
        additional_details.setBackground(Color.black);
        additional_details.setOpaque(true);
        add(additional_details);
        
        //religion label
        religion=new JLabel("Religion:");
        religion.setBounds(100,130,100,26);
        religion.setFont(new Font("osward",Font.BOLD,20));
        religion.setForeground(Color.WHITE);
        religion.setBackground(Color.black);
        religion.setOpaque(true);
        add(religion);
        String valreligion[]={"Hindu","Muslim","Sikh","Isai","other"}; 
        religion_box=new JComboBox(valreligion);
        religion_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        religion_box.setBounds(225,133,400,25);
        religion_box.setForeground(Color.BLUE);
        religion_box.setBackground(Color.yellow);
        religion_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(religion_box);
        //fathers religion
        Category=new JLabel("Category:");
        Category.setBounds(100,175,120,30);
        Category.setFont(new Font("osward",Font.BOLD,20));
        Category.setForeground(Color.WHITE);
        Category.setBackground(Color.black);
        Category.setOpaque(true);
        add(Category);
        
        String valcategory[]={"Sc","NT","OBC","EWS","OTHER"};
        category_box=new JComboBox(valcategory);
        category_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        category_box.setBounds(230,175,400,25);
        category_box.setForeground(Color.BLUE);
        category_box.setBackground(Color.white);
        category_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(category_box);
        //Income
        Income=new JLabel("Income:");
        Income.setBounds(100,210,133,22);
        Income.setFont(new Font("osward",Font.BOLD,20));
        Income.setForeground(Color.WHITE);
        Income.setBackground(Color.black);
        Income.setOpaque(true);
        add(Income);
        
                
       String valincome[]={"Null","<50000","<100000","<1500000","upto 200000"};
        Income_Box=new JComboBox(valincome);
        Income_Box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        Income_Box.setBounds(230,210,400,25);
        Income_Box.setForeground(Color.BLUE);
        Income_Box.setBackground(Color.yellow);
        Income_Box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
         add(Income_Box);
        
        //Educational
        Educational=new JLabel("Educational:");
        Educational.setBounds(100,247,146,37);
        Educational.setFont(new Font("osward",Font.BOLD,20));
        Educational.setForeground(Color.WHITE);
        Educational.setBackground(Color.black);
        Educational.setOpaque(true);
        add(Educational);  
       
        //Qualification Pan
        Qualification=new JLabel("Qualification:");
        Qualification.setBounds(100,273,145,35);
        Qualification.setFont(new Font("osward",Font.BOLD,20));
        Qualification.setForeground(Color.WHITE);                                   
        Qualification.setBackground(Color.black);
        Qualification.setOpaque(true);
        add(Qualification);
       String vaeducation[]={"10th pass ","12th pass","Graduate","post-graduste","Doctrate","other"};
        Qualification_box=new JComboBox(vaeducation);
        Qualification_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        Qualification_box.setBounds(245,247,400,60);
        Qualification_box.setForeground(Color.BLUE);
        Qualification_box.setBackground(Color.yellow);
        Qualification_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(Qualification_box);
        //Occupation status
        Occupation=new JLabel("Occupation:");
        Occupation.setBounds(100,315,146,40);
        Occupation.setFont(new Font("osward",Font.BOLD,20));
        Occupation.setForeground(Color.WHITE);
        Occupation.setBackground(Color.black);
        Occupation.setOpaque(true);
        add(Occupation);
       String valoccupation[]={"Salried","Self employee","Bussines","student","Retired","others"};
        occupation_box=new JComboBox(valoccupation);
        occupation_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        occupation_box.setBounds(245,315,400,30);
        occupation_box.setForeground(Color.BLUE);
        occupation_box.setBackground(Color.yellow);
        occupation_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(occupation_box);
        
        
        //Pan_No 
        Pan_No=new JLabel("Pan No:");
        Pan_No.setBounds(100,359,100,40);
        Pan_No.setFont(new Font("osward",Font.BOLD,20));
        Pan_No.setForeground(Color.WHITE);
        Pan_No.setBackground(Color.black);
        Pan_No.setOpaque(true);
        add(Pan_No);   
        Pan_box=new JTextField();
        Pan_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        Pan_box.setBounds(225,359,400,40);
        Pan_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(Pan_box);
     
        //Aadhar_No
        Aadhar_No=new JLabel("Aadhar No:");
        Aadhar_No.setBounds(100,413,150,40);
        Aadhar_No.setFont(new Font("osward",Font.BOLD,20));
        Aadhar_No.setForeground(Color.WHITE);
        Aadhar_No.setBackground(Color.black);
        Aadhar_No.setOpaque(true);
        add(Aadhar_No);  
        Aadhar_No_box=new JTextField();
        Aadhar_No_box.setFont(new Font("Raleway",Font.ROMAN_BASELINE,18));
        Aadhar_No_box.setBounds(225,413,400,30);
        Aadhar_No_box.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        add(Aadhar_No_box);
        
        //senior_Citizen
        senior_Citizen=new JLabel("senior Citizen:");
        senior_Citizen.setBounds(100,453,148,40);
        senior_Citizen.setFont(new Font("osward",Font.BOLD,20));
        senior_Citizen.setForeground(Color.WHITE);
        senior_Citizen.setBackground(Color.black);
        senior_Citizen.setOpaque(true);
        add(senior_Citizen); 
        
        syes = new JRadioButton("YES");
        syes.setBounds(300,453,148,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("NO");  
        sno.setBounds(450,453, 130, 30);
        sno.setBackground(Color.WHITE);
        add(sno);


         sgroup = new ButtonGroup();
         sgroup.add(syes);
         sgroup.add(sno);   
         
        //Existing_Account
        Existing_Account=new JLabel("Existing Account:");
        Existing_Account.setBounds(100,495,174,40);
        Existing_Account.setFont(new Font("osward",Font.BOLD,20));
        Existing_Account.setForeground(Color.WHITE);
        Existing_Account.setBackground(Color.black);
        Existing_Account.setOpaque(true);
        add(Existing_Account); 
        eyes = new JRadioButton("YES");
        eyes.setBounds(300,495,148,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno = new JRadioButton("NO");  
        eno.setBounds(450,495, 130, 30);
        eno.setBackground(Color.WHITE);
        add(eno);


         egroup = new ButtonGroup();
         egroup.add(eyes);
         egroup.add(eno);  

        
        next=new JButton("next");
        next.setBounds(300,550,100,30);
        next.setFont(new Font("Releway",Font.BOLD,20));
        add(next);
        next.addActionListener(this);
        setVisible(true);
        
        
       
      
    }
  
   public void actionPerformed(ActionEvent e)
    {
        
        
        String sreligion=(String)religion_box.getSelectedItem();
        String scategory=(String)category_box.getSelectedItem();
        String sincome=(String)Income_Box.getSelectedItem();
        String squalification=(String)Qualification_box.getSelectedItem();
        String soccupation=(String)occupation_box.getSelectedItem();
        String sen_cetiezen=null;
        
        if(syes.isSelected())
        {  sen_cetiezen =" yes";
          }
        else if(sno.isSelected())
        {
            sen_cetiezen="No";
        }
        String span=Pan_box.getText();
        String saadhar=Aadhar_No_box.getText();
        String eacc=null;
        if(eyes.isSelected())
        { 
            eacc="unmarried";
        }
        else if(eno.isSelected())
        {
            eacc="No";  
        }
        
     
                
          try
          {
              
                   con c =new con();
                   String query="INSERT INTO signtwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+squalification+"','"+soccupation+"','"+span+"','"+saadhar+"','"+sen_cetiezen+"','"+eacc+"')";
                   c.s.executeUpdate(query);  
                   JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
                   setVisible(false);
                  new signupthree(formno).setVisible(true);
              
          }
          catch(Exception ex)
          {
              System.out.println(ex);
          }
         } 
    
     public static void main(String args[])
    { 
        new  signuptwo("");   
    }
    
}

