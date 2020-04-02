package pl.content.forAccount;

public class Account {

    private String login;
    private String email;
    private String password;
    private String role;

    public Account(String login, String email, String password, String role) {

        this.login = login;
        this.email = email;
        this.password = password;
        this.role = role;


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return "Логин = " + login + ", Почта = " + email + ", " + role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}