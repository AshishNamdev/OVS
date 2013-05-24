/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashish
 */
package OVS;
import java.sql.*;


public class Candidate 
{

   String name=null;
   String pname=null;
    
   public Candidate(String name,String pname)
   {
       this.name=name;
       this.pname=pname;
   }

   
   public String getName()
   {
       return name;
   }
   
   public String getPname()
   {
       return pname;
   }
   
   public static Candidate[] getDetails()
   {
        Candidate []obj=null; 
        Connection conn=null;
        Statement st=null,st1=null;
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
                System.out.println("check1");
                st1=conn.createStatement();
                rs=st1.executeQuery("select count(*) from nominee_details");
                int co=0;
                System.out.println("check2");
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
                
                obj=new Candidate[co];
                
                st=conn.createStatement();
                rs=st.executeQuery("select f_name,pname from nominee_details");
                
                int i=0;
                while(rs.next())
                {
                       obj[i]=new Candidate(rs.getString(1),rs.getString(2));
                       System.out.println("name is"+rs.getString(1)+" party is"+rs.getString(2));
                       i++;
                }
                conn.close();
        }
        catch(Exception ex)
        {
            System.out.println("error "+ex.getMessage());
            
        }
     
       return obj;
   }
    
    
   
    
}
