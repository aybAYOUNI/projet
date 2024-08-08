package org.example.testferstprojectee;

import com.octest.beans.Auteur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestServlet", value = "/TestServlet")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*Auteur auteur = new Auteur();
        auteur.setNom("ayoub");
        auteur.setPrenom("ayouni");
        auteur.setActiv(true);
        request.setAttribute("auteur" , auteur);

        String name =request.getParameter("name");
        request.setAttribute("VarName" , name);

        String message = "Au revoir test bin recu";
        request.setAttribute("variable" , message);
        this.getServletContext().getRequestDispatcher("/Test1.jsp").forward(request, response);*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}