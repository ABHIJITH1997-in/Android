package com.example.senddatatonextpage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent =getIntent();

        EditText r1 = findViewById(R.id.t1);
        EditText r2 = findViewById(R.id.t2);
        EditText r3 = findViewById(R.id.t3);

        String str1 = intent.getStringExtra("Name");
        r1.setText(str1);

        String str2 = intent.getStringExtra("Phone");
        r2.setText(str2);

        String str3=intent.getStringExtra( "Email");
        r3.setText(str3);

        Button backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> {
            finish(); // Closes MainActivity2 and returns to MainActivity
        });


    }
}