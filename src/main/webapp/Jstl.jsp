<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 5/20/2024
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="navbar.jsp"%>

<br>
<a href="index.jsp"> Page Accueil </a>
<br>
<a href="TestServlet">Hello TestServlet</a>
<br>
<a href="JSTLtest">Hello JSTLtest</a>
<br>
<a href="FormServlet">Hello Foem inscription</a>

<br>

<c:if test="${!empty sessionScope.username && !empty sessionScope.email}">
    <p>vous etre ${sessionScope.username} ${sessionScope.email}</p></c:if>

<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Nom</th>
        <th scope="col">Prenome</th>
        <th scope="col">Age</th>
        <th scope="col">****</th>
    </tr>
    </thead>
    <tbody>

<c:forEach var="visiteur" items="${visiteurs}">
    <tr>
    <th scope="row"><c:out value= "${visiteur.id}"/></th>
    <td><c:out value= "${visiteur.nom}"/> </td>
    <td><c:out value= "${visiteur.prenom}"/> </td>
    <td> <c:out value= "${visiteur.age}"/> </td>
    <td ><button type="button" class="btn btn-success">Success</button>
    <button type="button" class="btn btn-danger">Danger</button>
    <button type="button" class="btn btn-warning">Warning</button>
    </td>
    </tr>
    </c:forEach>

    </tbody>
</table>
     </head>
     </html>