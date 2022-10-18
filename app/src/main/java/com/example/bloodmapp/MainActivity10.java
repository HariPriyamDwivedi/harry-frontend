package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity10 extends AppCompatActivity {
    Button btn1,btn2;
    EditText ed1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        btn1=findViewById(R.id.camp_back1);
        btn2=findViewById(R.id.camp_submit);
        ed1=findViewById(R.id.camp_mobile_number);
        btn1.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity9.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(View->{
           Intent intent=new Intent(this,MainActivity.class);
           startActivity(intent);
        });
    }
}