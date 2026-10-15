package com.example.lab4;

// Inheritance: สืบทอดจาก User
public class AdminUser extends User {
    private String adminLevel; // เช่น "SuperAdmin", "Moderator"

    public AdminUser(String userID, String userName, String email, String password, String adminLevel) {
        super(userID, userName, email, password);
        this.adminLevel = adminLevel;
    }

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }

    // Polymorphism: Override เมธอด showUser()
    @Override
    public void showUser() {
        System.out.println("=== Admin User ===");
        System.out.println("ID: " + getUserID());
        System.out.println("Name: " + getUserName());
        System.out.println("Email: " + getEmail());
        System.out.println("Admin Level: " + adminLevel);
    }
}
