package com.personRole;

import org.mindrot.jbcrypt.BCrypt;

public class Login {

    private String login;
    private String password;
    private String role;

    public Login(){}

    public Login(String login,String password ,String role){
        this.login = login;
        this.password =  BCrypt.hashpw(password, BCrypt.gensalt());
        this.role = role;


    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {this.login = login;}

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {this.password = password;}

    public String getRole() {
        return role;
    }
    public void setRole(String role) {this.role = role;}

    public String toString(){return login +" "+password +" "+ role;}
}
