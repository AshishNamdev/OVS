package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import OVS.Candidate;

public final class Vote_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<title>VOTING PAGE</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("h1 {\n");
      out.write("\tcolor: #FF0000;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground-color: #9999FF;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<h1 ALIGN = \"CENTER\">LIST OF CANDIDATES</h1>\n");
      out.write("\n");
      out.write("          ");

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
        
      out.write("\n");
      out.write("       \n");
      out.write("            \n");
      out.write("        <table width=\"491\" height=\"307\" border=\"2\" align=\"center\" cellpadding=\"10\" cellspacing=\"10\">\n");
      out.write("            <tr>\n");
      out.write("                <td> <font size=\"3\" face=\"arial\" color=\"red\">Choice</font> </td>\n");
      out.write("            <td><font size=\"5\" face=\"arial\" color=\"red\">Candidate Name</font>  </td>\n");
      out.write("            <td><font size=\"5\" face=\"arial\" color=\"red\">Party Name</font></td>\n");
      out.write("                      </tr>\n");
      out.write("            \n");
      out.write("            ");

            for(int i=0;i<obj.length;i++)
            {
             
            
      out.write("\n");
      out.write("             <tr>\n");
      out.write("    \n");
      out.write("         <td width=\"61\">\n");
      out.write("                        <input type=\"radio\" value=\"");
      out.print( obj[i].getPname() );
      out.write("\" name=\"vote\"/>\n");
      out.write("                      </td>\n");
      out.write("               <td width=\"226\">\n");
      out.write("                    ");
      out.print( obj[i].getName() );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( obj[i].getPname() );
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            }
                       }
                                }
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("   \n");
      out.write("    </table>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <br> \n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                         <form  action=\"getChoiceServlet\" method=\"post\">\n");
      out.write("                          <input name=\"VOTE\" type=\"submit\" id=\"VOTE\" value=\"VOTE\" />\n");
      out.write("                         </form>    \n");
      out.write("                    </td>\n");
      out.write("                \n");
      out.write("                   \n");
      out.write("                    <td> \n");
      out.write("                         <form action=\"ignoreVote.html\" method=\"get\">\n");
      out.write("               \n");
      out.write("                          <input name=\"IGNORE\" type=\"submit\" id=\"VOTE\" value=\"IGNORE\" />\n");
      out.write("                              </form> \n");
      out.write("                    </td>\n");
      out.write("                     </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </body>\n");
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
