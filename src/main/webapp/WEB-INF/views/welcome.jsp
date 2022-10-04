
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <title>Tennis Player Application</title>
</head>
<body>

<h1>Welcome to my Application.</h1>
<h2>jsp Player Name :<i>${jspPlayerName}</i> </h2>
<%@page import="java.time.LocalDate"%>
<%
     System.out.println("Hello, this from jsp"+request.getAttribute("jspPlayerName"));
     LocalDate getCurrentDate =LocalDate.now();
     System.out.println(getCurrentDate);
%>
<h1> Today Date : <%= getCurrentDate %></h1>

<form action="/player.do" method="post">
<label>Player Name:</label>
<input type="text" name="playerName" />
<input type="submit" value="Enter" />

</form>

</body>
</html>
