<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Página de inicio de sesión</title>
    <style>
        form {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }
        h1 {
            text-align: center;
            margin-top: 0;
            margin-bottom: 20px;
        }
        label {
            margin-bottom: 10px;
        }
    </style>
    <script>
        function onSubmitForm(event) {
            event.preventDefault();
            window.location.href = "admin.jsp";
        }
        document.querySelector('form').addEventListener('submit', onSubmitForm);
    </script>

</head>
<body>
<h1>Bienvenido a la web de Bilblioteca</h1>
<form method="post" action="LoginServlet">
    <label for="username">Nombre de usuario:</label>
    <input type="text" id="username" name="username" required><br>
    <label for="password">Contraseña:</label>
    <input type="password" id="password" name="password"  required><br>
    <button type="submit">Ingresar</button>
</form>
</body>
</html>


