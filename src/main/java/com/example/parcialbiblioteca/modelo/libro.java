package com.example.parcialbiblioteca.modelo;
public class libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String editorial;
    private String genero;
    private String anio;

    public libro(String titulo, String autor, String isbn, String editorial, String genero, String anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.genero = genero;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getGenero() {
        return genero;
    }

    public String getAnio() {
        return anio;
    }

    // otros métodos setter y getter para los otros atributos
}
