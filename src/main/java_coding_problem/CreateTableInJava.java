package main.java_coding_problem;

import java.sql.*;
class CreateTableInJava
{
    public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String DBUSER = "local";
    public static final String DBPASS = "test";
    public static void main(String args[])
    {
        try
        {
            // Load the driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Create the connection object
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            // Query main.String
            String sql = "select empname, city, department from emp e inner join dept d on e.dept_id = d.dept_id";
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            System.out.println("EmpName  City   Department");
            System.out.println("**===========**==========**");
            while (result.next())
            {
                System.out.println (
                        result.getString(1)+"   "+
                                result.getString(2)+"     "+
                                result.getString(3));
            }
            System.out.println("**===========**==========**\n");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
