package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import static android.widget.Toast.makeText;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.example.spinner.R;

public class MainActivity extends Activity implements
AdapterView.OnItemSelectedListener{
    String animal[]={" ","lion","tiger","cheeta","Elephant","Dog","cat","Camel"};
@Override
   protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        Spinner spin =(Spinner) findViewById(R.id.animalNamesSpinner);
        spin.setOnItemSelectedListener(this);

    ArrayAdapter<String> aa = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, animal);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        }
@Override
               public void onItemSelected(AdapterView<?> arg0, View arg1,int position,long id){
        Toast.makeText(getApplicationContext(),animal[position],Toast.LENGTH_LONG).show();
    }
    @Override
            public void onNothingSelected(AdapterView<?> arg0){
    }
}