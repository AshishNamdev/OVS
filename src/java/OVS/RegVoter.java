/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OVS;
import java.sql.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author Ashish
 */
public class RegVoter 
{
  
    public static boolean setData(String vid,String fname,String mname,String lname,String add1,String add2,String state,String con,String pwd,String email,String gen,String dob,int pin,String mno)
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

                
                System.out.println(vid+" "+fname+" "+mname+" "+lname+" "+add1+" "+add2+" "+state+" "+con+" "+pwd+" "+email+" "+gen+" "+dob+" "+pin+" "+mno);
                //System.out.println("check4");
                ps=conn.prepareStatement("insert into voter_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                System.out.println("date is"+dob);
               java.sql.Date dobdate;
               java.util.Date temp;
               long t;
               SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
               
               temp=sdf.parse(dob);
               System.out.println("date is"+temp);
               t=temp.getTime();
               dobdate=new java.sql.Date(t);
               System.out.println("date is"+dobdate);

       //System.out.println("check2"+cname+" "+address+" "+eid+" "+mno+" "+dobdate+" "+aid+" "+pid+" "+ppd+" "+pp+" "+ppr+" "+pdate);
                ps.setString(1,vid);
                ps.setString(2,fname);
                ps.setString(3,mname);
                ps.setString(4,lname);
                ps.setString(5,add1);
                ps.setString(6,add2);
                ps.setInt(7,pin);
                ps.setString(8,state);
                ps.setString(9,con);
                ps.setString(10,pwd);
                ps.setString(11,"n");
                ps.setString(12,mno );
                ps.setString(13,email);
                ps.setString(14,gen);
                ps.setDate(15,dobdate);
            ps.executeUpdate();
      
            System.out.println("Command is successfully executed");
       //System.out.println("check6");

      //System.out.println("hello");
            conn.close();
       return true;
      }
      catch(Exception ex)
      {
          System.out.println("error..."+ex.getMessage());
          return false;
      }
      
   }
    
}
