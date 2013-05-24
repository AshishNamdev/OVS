<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>VALIDATION PAGE</title>
<script type="text/javascript">
    function show()
    {
        var x=document.getElementById("uid").value;
        var y=document.getElementById("pwd").value;
        if(x.length==0)
        alert("can not be empty VoterId");
         if(x.length==0&&y.length==0)
        alert("can not be empty VoterId and Password Both");
        
        
        
        
    }
    
    
</script>

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<style type="text/css">
<!--
body {
	background-color: #9999ff;
}
.style2 {color: #FF0000}
.style3 {color: #000000}
-->
</style></head>
<body class="sub">
<h2 align="center" class="style2">WELCOME USER</h2>

<h2 align="center" class="style3">VALIDATE YOURSELF </h2>

<form action="ValidationServlet" method="post">
<table width="200" border="0" align="center" cellpadding="10">
  <tr>
    <td>VOTER ID </td>
    <td><input name="id" type="text" id="uid" maxlength="31" onblur="show()"/></td>
  </tr>
  <tr>
    <td>PASSWORD</td>
    <td><input name="pass" type="password" id="pwd" maxlength="12" onblur="show()"/></td>
  </tr>
  <tr>
    <td>
        <input name="VALIDATE" type="submit" id="VALIDATE" value="validate" onsubmit="show()" />
           </form>
                </td>
      <td>
        <input name="Cancel" type="reset" id="VALIDATE" value="Clear" />  
      </td>
   </tr>


</table>

<p align="center" class="style3">&nbsp;</p>
</body>

</html>
