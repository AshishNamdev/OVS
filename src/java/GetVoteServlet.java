/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import OVS.CalVote;
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
@WebServlet(name = "GetVoteServlet", urlPatterns = {"/GetVoteServlet"})
public class GetVoteServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetVoteServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GetVoteServlet at " + request.getContextPath () + "</h1>");
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
        //String pname=request.getParameter("vote");
        HttpSession sessobj=request.getSession(false);
        String uname=(String)sessobj.getAttribute("uname");
        String pname=(String)sessobj.getAttribute("pname");
        System.out.println("uname in getvote servlet..."+uname);
        System.out.println("pname in getvote servlet..."+pname);
        
        boolean res=CalVote.addVote(uname,pname);
        RequestDispatcher rd=null;
        if(res==true)
        {
           rd=request.getRequestDispatcher("THANX.html");
                rd.forward(request, response);
            System.out.println("Successfully voted");
        }
        else
        {
            System.out.println("not successfully voted...");
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
