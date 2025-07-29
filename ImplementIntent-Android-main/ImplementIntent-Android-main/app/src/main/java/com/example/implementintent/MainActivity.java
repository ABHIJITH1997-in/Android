package com.example.implementintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.et1);

        }
        public void send(View view)
        {
            String url=e1.getText().toString();
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
            startActivity(i);
        }
    }
