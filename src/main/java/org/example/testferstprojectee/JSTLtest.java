package org.example.testferstprojectee;

import com.octest.beans.Visiteur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "JSTLtesta", value = "/JSTLtest")
public class JSTLtest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* Visiteur visiteur = new Visiteur();
        visiteur.setNom("amina");
        visiteur.setPrenom("EL hamdi");
        visiteur.setAge(60);
        request.setAttribute("visit" , visiteur);

        this.getServletContext().getRequestDispatcher("/Jstl.jsp").forward(request, response);*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}