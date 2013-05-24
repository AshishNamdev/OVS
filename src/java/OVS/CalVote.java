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
public class CalVote 
{
    public static boolean addVote(String uname,String pname)
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
                ps=conn.prepareStatement("insert into vote_cast values(?,?)");
                System.out.println("Pname in db conn is : "+pname);
                ps.setString(1,pname);
                ps.setString(2,uname);
                
                
               int res=ps.executeUpdate();
                
                if(res>0)
                {
                    conn.close();
                    return true;
               
                }
                else {
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
