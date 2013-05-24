/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import OVS.LoginVal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ashish
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uid=request.getParameter("id");
        String pwd=request.getParameter("pass");
        
        System.out.println("uid="+uid+" and password is"+pwd);
        boolean res=LoginVal.checkUser(uid, pwd);
        RequestDispatcher rd=null;
        
        if(res==true)
        {
            boolean res1=LoginVal.checkStatus(uid);
            if(res1==true)
            {
              //  System.out.println("uid is= "+uid);
                HttpSession obj=request.getSession();
                obj.setAttribute("uname",uid);
                obj.setMaxInactiveInterval(9000);
              //  System.out.println("uname in login servlet.."+obj.getAttribute("uname"));
                rd=request.getRequestDispatcher("VoterAgree.html");
                rd.forward(request, response);
                return;
                
                
                
            }
            else
            {
                rd=request.getRequestDispatcher("showStatus.html");
                rd.forward(request, response);
            }
        }
        else
        {
           // System.out.println("Login failed");
            rd=request.getRequestDispatcher("LOGIN1.html");
            rd.forward(request, response);
        }
        
        
        
        
        
        
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
