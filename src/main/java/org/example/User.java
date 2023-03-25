package org.example;

public class User {
    private final String login;
    private final String email;

    public User() {
        this.login = "user";
        this.email = "email@mail.com";
    }

    public User(String login, String email) {
        if (login.equals(email) || !email.contains("@") || !email.contains("."))
            throw new IllegalArgumentException();
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
