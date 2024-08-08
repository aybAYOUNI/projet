package org.example.testferstprojectee;


import com.octest.beans.Auteur;
import com.octest.beans.Visiteur;
import com.octest.dao.DaoFactory;
import com.octest.dao.visiteurDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "FormServlet", value = "/FormServlet")
public class FormServlet extends HttpServlet {
    private visiteurDao visiteurdao;
    public void  init () throws ServletException{
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.visiteurdao = daoFactory.getVisiteurDao();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/Forminscription.jsp").forward(request, response);

        /*
        Auteur auteur = new Auteur();
        auteur.setNom("ayoub");
        auteur.setPrenom("ayouni");
        auteur.setActiv(true);
        request.setAttribute("auteur" , auteur);

        /*String name =request.getParameter("name");
        request.setAttribute("VarName" , name);
        */

       /* String message = "Au revoir test bin recu";
        request.setAttribute("variable" , message);

        String username = request.getParameter("username");
        String email =  request.getParameter("email");
        String password = request.getParameter("pasword");
        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("password", password);

       /* HttpSession session =request.getSession();
        session.setAttribute("username",username);
        session.setAttribute("email",email);
      */

       /* Cookie cookie = new Cookie("username",username);
        cookie.setMaxAge(4444);
        response.addCookie(cookie);

        this.getServletContext().getRequestDispatcher("/Test1.jsp").forward(request, response);

         */
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Visiteur visiteurs = new Visiteur();

        String nom = request.getParameter("username");
        String prenom = request.getParameter("prenom");
        String age = request.getParameter("age");

        visiteurs.setNom(nom);
        visiteurs.setPrenom(prenom);
        visiteurs.setAge(Integer.parseInt(age));

        // Noms tableNoms = new Noms();
        visiteurdao.ajouter(visiteurs);
        request.setAttribute("visiteurs", visiteurdao.lester());
        this.getServletContext().getRequestDispatcher("/Jstl.jsp").forward(request, response);
    }
}