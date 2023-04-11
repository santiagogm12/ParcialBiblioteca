package com.example.parcialbiblioteca.modelo;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<usuario> users;

    public UserService() {
        users = new ArrayList<>();
        users.add(new usuario("user1", "pass1", ""));
        users.add(new usuario("user2", "pass2", ""));
        users.add(new usuario("user3", "pass3", ""));
    }

    public usuario getUser(String username) {
        for (usuario user : users) {
            if (user.getNombreUsuario().equals(username)) {
                return user;
            }
        }
        return null;
    }
}

