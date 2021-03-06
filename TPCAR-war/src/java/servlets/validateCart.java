/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ejb.Command;
import ejb.Livre;
import java.io.IOException;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.CommandFacadeLocal;
import session.LivreFacadeLocal;

/**
 *
 * @author Dylan
 */
@WebServlet(name = "validateCart", urlPatterns = {"/validateCart"})
public class validateCart extends HttpServlet {
    @EJB
    private CommandFacadeLocal commandFacade;
    
    @EJB
    private LivreFacadeLocal livreFacade;


    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final ServletContext context = request.getServletContext();
        final RequestDispatcher rd = context.getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final ServletContext context = getServletContext();
        final HttpSession session = request.getSession();
        final RequestDispatcher rd = context.getRequestDispatcher("/validate.jsp");
        
        final Command c = new Command();
        
        ArrayList<Livre> al = (ArrayList<Livre>) session.getAttribute("cart");
        for(Livre l : al){
            l.getCommandCollection().add(c);
            livreFacade.create(l);
        }
  
        session.setAttribute("cart", al);
        session.setAttribute("command", c.getId());
        
        rd.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
