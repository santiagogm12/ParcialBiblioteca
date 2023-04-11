package com.example.parcialbiblioteca.modelo;

public class usuario{
    private String nombreUsuario;
    private String password;
    private String tipo;

    public usuario(String nombreUsuario, String password, String tipo) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.tipo = tipo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
