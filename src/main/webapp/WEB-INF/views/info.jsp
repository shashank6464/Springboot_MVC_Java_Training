<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
Player Info
</h1>
<p>
Name: ${name} <br>
Age: ${age}<br>
Nationality: ${nationality} <br>
ID: ${id}<br>


<h1>
    Welcome Back! ${name}
</h1>

<%
    System.out.println(request.getAttribute("name"));
%>



</body>
</html>