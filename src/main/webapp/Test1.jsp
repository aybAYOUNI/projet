<%@ page import="org.glassfish.jersey.message.internal.MsgTraceEvent" %>
<%@ page import="java.awt.*" %>
<%@ page import="com.octest.beans.Auteur" %>
<%@include file="navbar.jsp"%>

<br>
<a href="index.jsp"> Page Accueil </a>
<br>
<a href="hello-servlet">Hello Servlet </a>
<br>
<a href="JSTLtest">Hello JSTLtest</a>
<br>
<a href="FormServlet">Hello Foem inscription</a>

<c:if test="${!empty sessionScope.username && !empty sessionScope.email}">
    <p>vous etre ${sessionScope.username} ${sessionScope.email}</p></c:if>

<h1>
    Bojour ${ empty auteur.nom && auteur.prenom? '' :  auteur.nom }
</h1>
<br><br>
<h1>
    <%
      String variable = (String) request.getAttribute("variable");
      out.println(variable);
    %>
</h1>
<br><br>
<h2>List des auteurs</h2>

<ul>
    <li>NOM : ${auteur.nom}  </li>
    <li>PRENOM : ${auteur.prenom}</li>
    <li>MON ACTIVITER : ${ auteur.activ ? 'voue etes tres activ' : ' vous etes inactiv'} </li>
</ul>

<h2>An Ordered HTML List</h2>

<%--<ol>
    <li>
        <%
             Auteur var = (Auteur) request.getAttribute("auteur");
             out.println(var.getNom());
        %>
    </li>
    <li>
        <%
            out.println(var.getPrenom());
         %>
    </li>
    <li>
        <%
           if (var.isActiv() == true){
               out.println("vous etes tres activ");
           }else
           {
                out.println("vous etes inactiv ");
           }

        %>
    </li>
</ol>--%>
<h2>Test laforme</h2>
<ul>
    <li>UserName : ${username}  </li>
    <li>Email : ${email}</li>
    <li>Password : ******* </li>
</ul>

</body>
</html>