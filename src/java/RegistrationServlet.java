

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import OVS.RegVoter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Ashish
 */
public class RegistrationServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
 
            String vid=request.getParameter("voter_id");
            String fname=request.getParameter("first");
            String mname=request.getParameter("middle");
            String lname=request.getParameter("last");
            String add1=request.getParameter("add1");
            String add2=request.getParameter("add2");
            String state=request.getParameter("state");
            String con=request.getParameter("country");
            String pwd=request.getParameter("password");
            String email=request.getParameter("email");
            String gen=request.getParameter("gender");
            String dob=request.getParameter("day");
            dob+="-";
            dob+=request.getParameter("month");
            dob+="-";
            dob+=request.getParameter("year");
            int pin=Integer.parseInt(request.getParameter("pin"));
            String mno=request.getParameter("contact_no");
            
            
            boolean res=RegVoter.setData(vid,fname,mname,lname,add1,add2,state,con,pwd,email,gen,dob,pin,mno);
            RequestDispatcher rd=null;
            if(res==true)
            {
                //System.out.println("record saved");
                rd=request.getRequestDispatcher("Registered.html");
                rd.forward(request, response);
            }
            else
            {
            //    System.out.println("record  not saved"); 
                rd=request.getRequestDispatcher("REGISTRATION.html");
                out.println("<br><h1 align='center'><font style color='red'>Please register again.</font></h1>");
                rd.include(request, response);
                
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
            throws ServletException, IOException {
        processRequest(request, response);
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