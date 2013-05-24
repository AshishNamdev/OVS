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
public class ResShow 
{
    String pname=null;
    int tot=0;
    
    public ResShow()
    {
        this.pname=null;
        this.tot=0;
    }
    
    
    public void setPname(String pname)
    {
        this.pname=pname;
    }
    
    public void settot(int tot)
    {
        this.tot=tot;
    }

    public String getPname()
    {
        return pname;
    }
    
    public int getTot()
    {
        return tot;
    }
    
    public static ResShow[] getVote()
    {
        ResShow []obj=null;
        Connection conn=null;
        Statement st=null,st1=null;
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
                //System.out.println("check1");
                st1=conn.createStatement();
                rs=st1.executeQuery("select count(*) from nominee_details");
                int co=0;
                //System.out.println("check2");
                while(rs.next())
                {
                    co=rs.getInt(1);
                }
               
                System.out.println("total candidate="+co);
                if(co==0)
                {
                    conn.close();
                    return obj;
                }
                
                
                obj=new ResShow[co];
                
                st=conn.createStatement();
                rs=st.executeQuery("select pname from nominee_details");
                
                int i=0;
                while(rs.next())
                {
                       obj[i]=new ResShow();
                       obj[i].setPname(rs.getString(1));
                       i++;
                }
                
                for(i=0;i<obj.length;i++)
                {
                    ps=conn.prepareStatement("select count(*) from vote_cast where p_name=?");
                    ps.setString(1,obj[i].getPname());
                    rs=ps.executeQuery();
                    while(rs.next())
                    {
                         obj[i].settot(rs.getInt(1));                           
                    }
                }
                
                
                conn.close();
                return obj;
                
                
        }
        catch(Exception ex)
        {
            System.out.println("error "+ex.getMessage());
            
        }
        
       return obj;
   }
    
    
}
