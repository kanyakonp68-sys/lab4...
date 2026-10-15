package com.example.lab4;

import java.util.List;

// Inheritance: สืบทอดจาก Note
public class CheckListNote extends Note {
    private List<String> items;

    public CheckListNote(String title, List<String> items, String createdDate) {
        super(title, createdDate);
        this.items = items;
    }

    public CheckListNote(String title, List<String> items, String createdDate, User owner) {
        super(title, createdDate, owner);
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    // Polymorphism: Override เมธอด getSummary()
    @Override
    public void getSummary() {
        String ownerInfo = (getOwner() != null) ? " - Owner: " + getOwner().getUserName() : "";
        System.out.println("[CheckList Note] " + getTitle() + " (" + getCreatedDate() + ")" + ownerInfo);
        if (items != null) {
            for (String item : items) {
                System.out.println("  - [ ] " + item);
            }
        }
    }
}
