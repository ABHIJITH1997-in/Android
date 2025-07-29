package com.example.senddatatonextpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sub=findViewById(R.id.b1);
        EditText nm=findViewById(R.id.name);
        EditText em1=findViewById(R.id.email);
        EditText phn=findViewById(R.id.phone);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,MainActivity2.class);

                String user=nm.getText().toString();
                i.putExtra( "Name",user);

                String email=em1.getText().toString();
                i.putExtra( "Email",email);

                String phone=phn.getText().toString();
                i.putExtra( "Phone",phone);

                startActivity(i);

            }
        });

    }
}