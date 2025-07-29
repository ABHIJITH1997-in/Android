package com.example.toggleimage;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;



public class MainActivity extends AppCompatActivity {

    ImageView img;
    ToggleButton btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.img);
        btn=findViewById(R.id.btn);

        img.setImageDrawable(getResources().getDrawable(R.drawable.download));


    }
    public void click(View view)
    {
        if (btn.isChecked()){
            img.setImageDrawable(getResources().getDrawable(R.drawable.download));
        }
        else {
            img.setImageDrawable(getResources().getDrawable(R.drawable.upload));
        }
    }
}