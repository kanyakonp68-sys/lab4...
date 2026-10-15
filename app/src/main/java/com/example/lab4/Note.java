package com.example.lab4;

// Abstraction: ใช้ abstract class
public abstract class Note {
    // Encapsulation: กำหนด attributes เป็น private
    private String title;
    private String createdDate;
    private User owner; // เพิ่มตามข้อ 3 ของโจทย์: เพื่อแสดงข้อมูลว่าโน้ตนี้เป็นของใคร

    // Constructor 1 (Without Owner)
    public Note(String title, String createdDate) {
        this.title = title;
        this.createdDate = createdDate;
    }

    // Constructor 2 (With Owner - ข้อ 3)
    public Note(String title, String createdDate, User owner) {
        this.title = title;
        this.createdDate = createdDate;
        this.owner = owner;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    // Abstraction & Polymorphism: ประกาศ abstract method
    public abstract void getSummary();
}
