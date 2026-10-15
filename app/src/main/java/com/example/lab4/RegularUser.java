package com.example.lab4;

// Inheritance: สืบทอดจาก User
public class RegularUser extends User {
    private String userTier; // เช่น "Free", "Premium"

    public RegularUser(String userID, String userName, String email, String password, String userTier) {
        super(userID, userName, email, password);
        this.userTier = userTier;
    }

    public String getUserTier() {
        return userTier;
    }

    public void setUserTier(String userTier) {
        this.userTier = userTier;
    }

    // Polymorphism: Override เมธอด showUser()
    @Override
    public void showUser() {
        System.out.println("=== Regular User ===");
        System.out.println("ID: " + getUserID());
        System.out.println("Name: " + getUserName());
        System.out.println("Email: " + getEmail());
        System.out.println("Tier: " + userTier);
    }
}
