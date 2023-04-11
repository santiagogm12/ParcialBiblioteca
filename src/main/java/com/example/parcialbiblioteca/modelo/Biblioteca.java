package com.example.parcialbiblioteca.modelo;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<usuario> user = new ArrayList<>();
    private ArrayList<libro> book = new ArrayList<>();

    // Constructor
    public Biblioteca() {
        // Agregar usuarios administradores
        user.add(new usuario("admin1", "password1", "admin"));
        user.add(new usuario("admin2", "password2", "admin"));

        // Agregar usuarios empleados
        book.add(new libro("employee1", "password1", "empleado", "", "", ""));
        book.add(new libro("employee2", "password2", "empleado", "", "", ""));
    }

    // Getters para los ArrayLists de usuarios
    public ArrayList<usuario> getUsuarios() {
        return user;
    }

    public ArrayList<libro> getLibros() {
        return book;
    }
}

