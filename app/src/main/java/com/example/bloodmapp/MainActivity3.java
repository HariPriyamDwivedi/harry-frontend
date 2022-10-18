package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    Button btn1,btn2;
    EditText ed1,ed2,ed3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn1=findViewById(R.id.back2);
        btn2=findViewById(R.id.submit1);
        ed1=findViewById(R.id.ngo_type);
        ed2=findViewById(R.id.ngo_url);
        ed3=findViewById(R.id.ngo_address);
        btn1.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }
}