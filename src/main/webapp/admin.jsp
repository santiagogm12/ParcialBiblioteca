<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Welcome, <%= session.getAttribute("username") %></h1>
<a href="LogoutServlet">Logout</a>
<!-- Aquí iría el contenido exclusivo para el usuario administrador -->
</body>
</html>
