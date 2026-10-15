package com.example.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

class MainActivityJava extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGoToAddNote = findViewById(R.id.btnGoToAddNote);
        if (btnGoToAddNote != null) {
            btnGoToAddNote.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivityJava.this, AddNoteActivity.class);
                startActivity(intent);
            });
        }

        User user1 = new RegularUser("6812247001", "Kanyakon", "Kanyakon.p68@psru.ac.th", "30032549", "Free");
        Note noteA = new TextNote("Do Lab4", "create class diagram and code", "6 July 2026", user1);

        ArrayList<String> todoItems = new ArrayList<>();
        todoItems.add("Design Class Diagram");
        todoItems.add("Implement Java Code");
        Note noteB = new CheckListNote("Lab Tasks", todoItems, "6 July 2026", user1);

        noteA.getSummary();
        noteB.getSummary();
    }
}
