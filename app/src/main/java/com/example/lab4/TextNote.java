package com.example.lab4;

// Inheritance: สืบทอดจาก Note
public class TextNote extends Note {
    private String content;

    public TextNote(String title, String content, String createdDate) {
        super(title, createdDate);
        this.content = content;
    }

    public TextNote(String title, String content, String createdDate, User owner) {
        super(title, createdDate, owner);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Polymorphism: Override เมธอด getSummary()
    @Override
    public void getSummary() {
        String ownerInfo = (getOwner() != null) ? " - Owner: " + getOwner().getUserName() : "";
        System.out.println("[Text Note] " + getTitle() + " : " + content + " (" + getCreatedDate() + ")" + ownerInfo);
    }
}
