/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ejb.Livre;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.LivreFacadeLocal;

/**
 *
 * @author Dylan
 */
@WebServlet(name = "CommandServlet", urlPatterns = {"/addToCart"})
public class CommandServlet extends HttpServlet {
    
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
        final RequestDispatcher rd = context.getRequestDispatcher("/index.jsp");
        
        final String choice = request.getParameter("choice");
        String title = ""; 
            
        switch(choice){
            case "add":
                title = request.getParameter("titreToCart");
                break;
            case "remove":
                title = request.getParameter("titreToCart");
                break;
            default:               
                break;
        }
        
        if(title.equals("")){
            rd.forward(request, response);
            return;
        }
        
        ArrayList<Livre> al = new ArrayList<>();
        
        Enumeration<String> e = session.getAttributeNames();
        while(e.hasMoreElements()){
            if(e.nextElement().equals("cart")){
                al = (ArrayList<Livre>) session.getAttribute("cart"); 
            }
        }
          
        for(Livre l : livreFacade.findAll()){
            if(l.getTitre().equals(title)){
                if(choice.equals("add"))
                    al.add(l);
                else al.remove(l);
            }
        }

        session.setAttribute("cart", al);
        
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
