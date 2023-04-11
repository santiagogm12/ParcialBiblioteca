package com.example.parcialbiblioteca.modelo;

import java.util.ArrayList;

public class ArrayListUsuarios {
    private ArrayList<usuario> listaUsuarios;

    public ArrayListUsuarios() {
        listaUsuarios = new ArrayList<usuario>();
        listaUsuarios.add(new usuario("admin", "1234", "admin"));
        listaUsuarios.add(new usuario("empleado", "abcd", "empleado"));
    }

    public void agregarUsuario(usuario Usuario) {
        listaUsuarios.add(Usuario);
    }

    public usuario buscarPorNombre(String nombre) {
        for (usuario Usuario : listaUsuarios) {
            if (Usuario.getNombreUsuario().equals(nombre)) {
                return Usuario;
            }
        }
        return null;
    }

    public usuario buscarPorNombreYContrasena(String nombre, String contrasena) {
        for (usuario Usuario : listaUsuarios) {
            if (Usuario.getNombreUsuario().equals(nombre) && Usuario.getPassword().equals(contrasena)) {
                return Usuario;
            }
        }
        return null;
    }
}

