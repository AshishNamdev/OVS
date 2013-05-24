/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OVS;
import java.sql.*;

/**
 *
 * @author Ashish
 */
public class LoginVal 
{
    
    public static boolean checkStatus(String uid)
    {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;

        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
        }
        catch(Exception ex)
        {
            System.out.println("Class not load"+ex.getMessage());
        }

        //System.out.println("check3");

        try
        {
                conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ashish","ashish");
                ps=conn.prepareStatement("select status from voter_details where voter_id=?");
                
                ps.setString(1,uid);
                rs=ps.executeQuery();
                
                while(rs.next())
                {
                    if((rs.getString(1)).equals("n"))
                    {
                        conn.close();
                        return true;
                    }
                    else
                    {
                        conn.close();
                        return false;
                    }
                }
        }
        catch(Exception ex)
        {
            System.out.println("error"+ex.getMessage());
           
            return false;
        }
        
        return false;
        
    }
    
    
    public static boolean checkUser(String uid,String pwd)
    {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;

        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
        }
        catch(Exception ex)
        {
            System.out.println("Class not load"+ex.getMessage());
        }

        //System.out.println("check3");

        try
        {
                System.out.println("in login val");
                conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ashish","ashish");
                ps=conn.prepareStatement("select voter_id,password from voter_details where voter_id=? and password=?");
                
                ps.setString(1,uid);
                ps.setString(2,pwd);
                
                
                rs=ps.executeQuery();
                
                System.out.println("command is successfully executed");
                while(rs.next())
                {
                    conn.close();
                    return true;
                }
        }
        catch(Exception ex)
        {
            System.out.println("error"+ex.getMessage());
            return false;
        }
        
        return false;
        
    }
    
}
