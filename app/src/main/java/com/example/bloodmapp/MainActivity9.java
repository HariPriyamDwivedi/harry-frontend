package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity9 extends AppCompatActivity {
    Button btn1,btn2;
    EditText ed1,ed2,ed3,ed4,ed5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        btn1=findViewById(R.id.camp_back);
        btn2=findViewById(R.id.camp_next);
        ed1=findViewById(R.id.camp_name);
        ed2=findViewById(R.id.camp_email);
        ed3=findViewById(R.id.camp_address);
        ed4=findViewById(R.id.camp_coordinator_name);
        ed5=findViewById(R.id.camp_start_date);
        btn1.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity8.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity10.class);
            startActivity(intent);
        });
    }
}