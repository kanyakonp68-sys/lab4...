package com.example.lab4;

// Abstraction: กำหนดเป็น abstract class
public abstract class User {
    // Encapsulation: กำหนด attributes เป็น private
    private String userID;
    private String userName;
    private String email;
    private String password;

    public User(String userID, String userName, String email, String password) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    // Getter and Setter
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public void setPassword(String password) {
        this.password = password;
    }

    // Abstraction & Polymorphism: ประกาศ abstract method
    public abstract void showUser();
}
