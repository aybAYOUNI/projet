package org.example.testferstprojectee;


import com.octest.beans.Visiteur;
import com.octest.dao.DaoFactory;
import com.octest.dao.visiteurDao;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
   /* private String message;

    public void init() {
        message = "Hello World!";
    }
*/
private static final long serialVersionUID=2L;
 private visiteurDao visiteurdao;
 public void  init () throws ServletException{
  DaoFactory daoFactory = DaoFactory.getInstance();
    this.visiteurdao = daoFactory.getVisiteurDao();
 }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //response.setContentType("text/html");

        // Hello
        /*PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        */

        /*
        Noms tableNoms =new Noms();
        try {
            request.setAttribute("visiteurs",tableNoms.recupereVisiteur());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        request.setAttribute("visiteur",visiteurdao.lester());
        this.getServletContext().getRequestDispatcher("/Jstl.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
