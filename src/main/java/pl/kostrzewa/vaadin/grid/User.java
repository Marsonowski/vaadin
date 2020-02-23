package pl.kostrzewa.vaadin.grid;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


public class User {

    int id;
    String login;
    String password;
    String email;
    LocalDate date;


    public User(int id, String login, String password, String email, LocalDate date) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
