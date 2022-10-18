package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {
    Button btn1,btn2,btn3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        btn1=findViewById(R.id.camp_list);
        btn2=findViewById(R.id.camp_id);
        btn3=findViewById(R.id.camp_add);
        btn3.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity9.class);
            startActivity(intent);
        });
    }
}