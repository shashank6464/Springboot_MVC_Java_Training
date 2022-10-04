<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tennis Player Application</title>
</head>
<body>

<h1>Welcome back</h1>
<h2>Player Name is : <i> ${PlayerName} </i> </h2>
<%@page import="java.time.LocalDate"%>
<%
        System.out.println("Hello, this from JSP, "+request.getAttribute("PlayerName"));
        LocalDate getCurrentDate = LocalDate.now();
    System.out.println(getCurrentDate);
        %>

<h1>Today Date: <%=  getCurrentDate%></h1>

<form action="/player.do" method="post">
    <label>Player Name:</label>
    <input type="text" name="name" />
    <input type="submit" value="Enter" />
</form>

</body>
</html>