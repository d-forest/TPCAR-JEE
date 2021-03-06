/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ejb.Livre;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author Dylan Forest et Mahieddine Yaker
 */
@WebServlet(name = "addBookServlet", urlPatterns = {"/addBook"})
public class AddBookServlet extends HttpServlet {
    
    @EJB
    private LivreFacadeLocal livreFacade;
        

    /**
     * Handles the HTTP <code>GET</code> method.
     * 
     * Nothing to do on GET -> Redirecting to the home page
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
     * Verifying then adding the book to the data base.
     * according to the development, adding a book wich title is the same than another
     * then it only edit it with the values posted.
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
        
        final String title = request.getParameter("titre");
        final String author = request.getParameter("auteur");
        final int year = Integer.parseInt(request.getParameter("annee"));
        
        Livre l = new Livre(title, author, year);
        
        livreFacade.create(l);
        
        session.setAttribute("books", livreFacade.findAll());
    
        final RequestDispatcher rd = context.getRequestDispatcher("/index.jsp");
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
