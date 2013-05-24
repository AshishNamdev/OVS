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
public class ValidVal {
     
     public static boolean validateUser(String uid,String pwd)
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

 public static boolean updateStatus(String uid)
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
                ps=conn.prepareStatement("update voter_details set status='casted' where voter_id=?");
                
                
                ps.setString(1,uid);
               int res=ps.executeUpdate();
                
               
                    if(res>0)
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
        catch(Exception ex)
        {
            System.out.println("error"+ex.getMessage());
            return false;
        }
            
    }
    
}