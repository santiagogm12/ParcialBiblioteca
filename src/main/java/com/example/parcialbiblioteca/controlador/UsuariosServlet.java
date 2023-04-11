package com.example.parcialbiblioteca.controlador;

import com.example.parcialbiblioteca.modelo.libro;
import com.example.parcialbiblioteca.modelo.usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "UsuariosServlet", value = "/UsuariosServlet")
public class UsuariosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // ArrayList de Usuarios
    private ArrayList<usuario> listaUsuarios = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        // Agregar usuario administrador por default
        usuario admin = new usuario("admin", "admin", "admin@example.com");
        listaUsuarios.add(admin);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Renderizar la página de login
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los parámetros del formulario de login
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Buscar el usuario en el ArrayList de Usuarios
        usuario Usuario = buscarUsuario(username);

        // Verificar si el usuario existe y la contraseña es correcta
        if (Usuario != null && Usuario.getPassword().equals(password)) {

            // Guardar el usuario en la sesión
            request.getSession().setAttribute("usuario", Usuario);

            // Redirigir al usuario a la página de inicio
            response.sendRedirect("inicio.jsp");
        } else {
            // Mostrar mensaje de error en la página de login
            request.setAttribute("error", "Nombre de usuario o contraseña incorrectos");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    // Buscar un usuario por nombre de usuario
    private usuario buscarUsuario(String username) {
        for (usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(username)) {
                return usuario;
            }
        }
        return null;
    }
}

