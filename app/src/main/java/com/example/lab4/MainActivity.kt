package com.example.lab4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnGoToAddNote: Button? = findViewById(R.id.btnGoToAddNote)
        btnGoToAddNote?.setOnClickListener {
            val intent = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }

        // Polymorphism: ชี้ reference ไปยัง Object ของ Subclass
        val user1: User = RegularUser("6812247001", "Kanyakon", "Kanyakon.p68@psru.ac.th", "30032549", "Free")
        val user2: User = AdminUser("0000000001", "AdminUser", "admin@psru.ac.th", "admin123", "SuperAdmin")

        val noteA: Note = TextNote("Do Lab4", "create class diagram and code", "6 July 2026", user1)

        val todoItems = ArrayList<String>()
        todoItems.add("Design Class Diagram")
        todoItems.add("Implement Java Code")
        val noteB: Note = CheckListNote("Lab Tasks", todoItems, "6 July 2026", user1)

        // เรียกใช้งานเมธอด polymorphically
        noteA.getSummary()
        noteB.getSummary()

        user1.showUser()
        user2.showUser()
    }
}
