package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Validation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>VALIDATION PAGE</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function show()\n");
      out.write("    {\n");
      out.write("        var x=document.getElementById(\"uid\").value;\n");
      out.write("        var y=document.getElementById(\"pwd\").value;\n");
      out.write("        if(x.length==0)\n");
      out.write("        alert(\"can not be empty VoterId\");\n");
      out.write("         if(x.length==0&&y.length==0)\n");
      out.write("        alert(\"can not be empty VoterId and Password Both\");\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("\tbackground-color: #9999ff;\n");
      out.write("}\n");
      out.write(".style2 {color: #FF0000}\n");
      out.write(".style3 {color: #000000}\n");
      out.write("-->\n");
      out.write("</style></head>\n");
      out.write("<body class=\"sub\">\n");
      out.write("<h2 align=\"center\" class=\"style2\">WELCOME USER</h2>\n");
      out.write("\n");
      out.write("<h2 align=\"center\" class=\"style3\">VALIDATE YOURSELF </h2>\n");
      out.write("\n");
      out.write("<form action=\"ValidationServlet\" method=\"post\">\n");
      out.write("<table width=\"200\" border=\"0\" align=\"center\" cellpadding=\"10\">\n");
      out.write("  <tr>\n");
      out.write("    <td>VOTER ID </td>\n");
      out.write("    <td><input name=\"id\" type=\"text\" id=\"uid\" maxlength=\"31\" onblur=\"show()\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>PASSWORD</td>\n");
      out.write("    <td><input name=\"pass\" type=\"password\" id=\"pwd\" maxlength=\"12\" onblur=\"show()\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("        <input name=\"VALIDATE\" type=\"submit\" id=\"VALIDATE\" value=\"validate\" onsubmit=\"show()\" />\n");
      out.write("           </form>\n");
      out.write("                </td>\n");
      out.write("      <td>\n");
      out.write("        <input name=\"Cancel\" type=\"reset\" id=\"VALIDATE\" value=\"Clear\" />  \n");
      out.write("      </td>\n");
      out.write("   </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p align=\"center\" class=\"style3\">&nbsp;</p>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
