<%-- 
    Document   : Result
    Created on : May 20, 2011, 2:46:14 PM
    Author     : Ashish
--%>

<%@page import="OVS.ResShow"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
<!--
h1 {
	color: #FF0000;
}
h2 {
	color: #0000FF;
}
body {
	background-color: #9999FF;
}
#Layer1 {
	position:absolute;
	width:1194px;
	height:123px;
	z-index:1;
	left: 294px;
	top: 218px;
}
-->
</style>
    </head>
    <body>
       
        
        <h2 align = "center">
            <font color="red" >RESULT BY THE PARTY NAME</font><br>
                      </h2>
        
        <table align="center" border ="2" cellspacing="7" cepllpadding="8">
            <tr>
                <td>
                    <font size="3" face="arial" color="red">Party Name </fon>
                    </td>
                <td>
                    <font size="3" face="arial" color="red">Votes </fotn>
                    </td>
                   
            </tr>
             
            <%
            ResShow []obj=ResShow.getVote();
        %> 
       
        <%
        for(int i=0;i<obj.length;i++)
                       {
        %>
       
            <tr>
                <td>
                    <%= obj[i].getPname() %>
                </td>
                <td>
                    <%= obj[i].getTot() %>
                </td>
                
            </tr>
        
        <%
               }
        %>
        
        
   </table>
        <table align="center">
            <form action="INDEX.html">
            <tr>
                <td>
                    <input name="Home" type="submit" value="Click To  go To Home"></input>
                </td>
             </tr>
            </form>
        </table>
        </body>
</html>
