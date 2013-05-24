package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import OVS.ResShow;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("h1 {\n");
      out.write("\tcolor: #FF0000;\n");
      out.write("}\n");
      out.write("h2 {\n");
      out.write("\tcolor: #0000FF;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground-color: #9999FF;\n");
      out.write("}\n");
      out.write("#Layer1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:1194px;\n");
      out.write("\theight:123px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tleft: 294px;\n");
      out.write("\ttop: 218px;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <h2 align = \"center\">\n");
      out.write("            <font color=\"red\" >RESULT BY THE PARTY NAME</font><br>\n");
      out.write("                      </h2>\n");
      out.write("        \n");
      out.write("        <table align=\"center\" border =\"2\" cellspacing=\"7\" cepllpadding=\"8\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"3\" face=\"arial\" color=\"red\">Party Name </fon>\n");
      out.write("                    </td>\n");
      out.write("                <td>\n");
      out.write("                    <font size=\"3\" face=\"arial\" color=\"red\">Votes </fotn>\n");
      out.write("                    </td>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("            ");

            ResShow []obj=ResShow.getVote();
        
      out.write(" \n");
      out.write("       \n");
      out.write("        ");

        for(int i=0;i<obj.length;i++)
                       {
        
      out.write("\n");
      out.write("       \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( obj[i].getPname() );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( obj[i].getTot() );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("        ");

               }
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("   </table>\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <form action=\"INDEX.html\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <input name=\"Home\" type=\"submit\" value=\"Click To  go To Home\"></input>\n");
      out.write("                </td>\n");
      out.write("             </tr>\n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("        </body>\n");
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
