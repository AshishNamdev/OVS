 <%-- 
    Document   : Vote
    Created on : May 20, 2011, 12:19:29 PM
    Author     : Ashish
--%>

<%@page import="OVS.Candidate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>VOTING PAGE</title>
<style type="text/css">
<!--
h1 {
	color: #FF0000;
}
body {
	background-color: #9999FF;
}
-->
</style></head>

<body>
<h1 ALIGN = "CENTER">LIST OF CANDIDATES</h1>
<%@page  session="true" %>
          <%
            Candidate []obj=Candidate.getDetails();
            
             session=request.getSession(false);
             if(session.isNew())
           {
                System.out.println("new session ridirect to login");
                 response.sendRedirect("LOGIN.html");                     
             }
                  
          else
                  {                                   
            if(obj==null)
            {
                System.out.println("No Record found");
            }
            else
          {
        %>
       
            
        <table width="491" height="307" border="2" align="center" cellpadding="10" cellspacing="10">
            <tr>
                <td> <font size="3" face="arial" color="red">Choice</font> </td>
            <td><font size="5" face="arial" color="red">Candidate Name</font>  </td>
            <td><font size="5" face="arial" color="red">Party Name</font></td>
                      </tr>
            
            <%
            for(int i=0;i<obj.length;i++)
            {
             
            %>
             <tr>
    
         <td width="61">
                        <input type="radio" value="<%= obj[i].getPname() %>" name="vote"/>
                      </td>
               <td width="226">
                    <%= obj[i].getName() %>
                </td>
                <td>
                    <%= obj[i].getPname() %>
                </td>
            </tr>
            <%
            }
                       }
                                }
            %>
            
            <tr>
   
    </table>
            <br>
            
            <br> 
            <table align="center">
                <tr>
                    <td>
                         <form  action="getChoiceServlet" method="post">
                          <input name="VOTE" type="submit" id="VOTE" value="VOTE" />
                         </form>    
                    </td>
                
                   
                    <td> 
                         <form action="ignoreVote.html" method="get">
               
                          <input name="IGNORE" type="submit" id="VOTE" value="IGNORE" />
                              </form> 
                    </td>
                     </tr>

            </table>
           
            
        
    </body>
</html>
