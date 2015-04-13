/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ejb.Livre;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@WebServlet(name = "Mockup", urlPatterns = {"/Mockup"})
public class MockupServlet extends HttpServlet {
    
    @EJB
    private LivreFacadeLocal livreFacade;    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final ServletContext context = getServletContext();
        final HttpSession session = request.getSession();
        
        ArrayList<Livre> livres = new ArrayList<>();
        livres.add(new Livre("1984","George Orwell",1949));
        livres.add(new Livre("Les fleurs du mal","Charles Baudelaire",1857));
        livres.add(new Livre("L étranger","Albert Camus",1942));
        livres.add(new Livre("Le seigneur des anneaux","J.R.R. Tolkien",1954));
        livres.add(new Livre("Voyage au bout de la nuit","Louis-Ferdinand Céline",1932));

        for(Livre l : livres)
            livreFacade.create(l);
        
        session.setAttribute("books", livreFacade.findAll());
        
        final RequestDispatcher rd = context.getRequestDispatcher("/mockup.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        processRequest(request, response);
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
