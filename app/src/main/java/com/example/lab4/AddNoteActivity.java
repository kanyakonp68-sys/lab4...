package com.example.lab4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddNoteActivity extends AppCompatActivity {

    private EditText etTitle, etContent, etUserName;
    private Button btnAddTextNote, btnAddChecklistNote;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        etTitle = findViewById(R.id.etTitle);
        etContent = findViewById(R.id.etContent);
        etUserName = findViewById(R.id.etUserName);
        btnAddTextNote = findViewById(R.id.btnAddTextNote);
        btnAddChecklistNote = findViewById(R.id.btnAddChecklistNote);
        tvResult = findViewById(R.id.tvResult);

        btnAddTextNote.setOnClickListener(v -> {
            String title = etTitle.getText().toString();
            String content = etContent.getText().toString();
            String name = etUserName.getText().toString();

            // สร้าง User เจ้าของโน้ต (ตามโจทย์ข้อ 3)
            User user = new RegularUser("U001", name, name + "@psru.ac.th", "pass123", "Free");
            TextNote textNote = new TextNote(title, content, "15 Oct 2026", user);

            displayNoteInfo(textNote);
        });

        btnAddChecklistNote.setOnClickListener(v -> {
            String title = etTitle.getText().toString();
            String rawItems = etContent.getText().toString(); // รับรายการแยกด้วยเครื่องหมายจุลภาค ,
            String name = etUserName.getText().toString();

            List<String> items = new ArrayList<>(Arrays.asList(rawItems.split(",")));

            User user = new AdminUser("A001", name, name + "@psru.ac.th", "admin123", "SuperAdmin");
            CheckListNote checkListNote = new CheckListNote(title, items, "15 Oct 2026", user);

            displayNoteInfo(checkListNote);
        });
    }

    private void displayNoteInfo(Note note) {
        Toast.makeText(this, "เพิ่มโน้ตสำเร็จ!", Toast.LENGTH_SHORT).show();

        String ownerName = (note.getOwner() != null) ? note.getOwner().getUserName() : "Unknown";
        String ownerEmail = (note.getOwner() != null) ? note.getOwner().getEmail() : "N/A";

        String info = "=== โน้ตที่ถูกสร้าง ===\n" +
                "หัวข้อ: " + note.getTitle() + "\n" +
                "วันที่: " + note.getCreatedDate() + "\n" +
                "เจ้าของโน้ต: " + ownerName + " (" + ownerEmail + ")";

        tvResult.setText(info);
    }
}