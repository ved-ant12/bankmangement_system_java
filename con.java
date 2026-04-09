package bank.management.system;

import java.sql.*;

public class con
{
    Connection c;
    Statement s;

    public con()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankmanagementsystem","root","12345678"
            );

            s = c.createStatement();   // VERY IMPORTANT
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}