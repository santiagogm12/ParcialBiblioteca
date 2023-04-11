package com.example.parcialbiblioteca.modelo;

public class autor {
    private String cedula;
    private String nombreAutor;
    private String nacionalidad;

    public autor(String cedula, String nombreAutor, String nacionalidad) {
        this.cedula = cedula;
        this.nombreAutor = nombreAutor;
        this.nacionalidad = nacionalidad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    // otros métodos setter y getter para los otros atributos
}

