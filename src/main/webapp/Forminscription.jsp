<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 5/21/2024
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="navbar.jsp"%>
<br>
<a href="index.jsp"> Page Accueil </a>
<br>
<a href="hello-servlet">Hello Servlet </a>
<br>
<a href="TestServlet">Hello TestServlet</a>
<br>
<a href="JSTLtest">Hello JSTLtest</a>
<br>

<c:if test="${!empty sessionScope.username && !empty sessionScope.email}">
    <p>vous etre ${sessionScope.username} ${sessionScope.email}</p></c:if>

<form method="post" >
    <div class="mb-3">
        <label for="InputUsername" class="form-label">UserName</label>
        <input type="text" class="form-control" id="InputUsername" name="username">
    </div>
    <div class="mb-3">
        <label for="InputPrenom" class="form-label">prenom</label>
        <input type="int" class="form-control" id="InputPrenom" aria-describedby="prenomHelp" name="prenom">
        <div id="prenomHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="InputAge" class="form-label">Age</label>
        <input type="number" class="form-control" id="InputAge" aria-describedby="agelHelp" name="age">
        <div id="ageHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="InputPassword1" class="form-label">Password</label>
        <input type="password" class="form-control" id="InputPassword1" name="password">
    </div>
    <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
