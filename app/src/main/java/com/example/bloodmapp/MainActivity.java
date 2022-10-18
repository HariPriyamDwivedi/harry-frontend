package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.ngo);
        btn2=findViewById(R.id.donor);
        btn3=findViewById(R.id.camp);

        btn1.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity4.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity5.class);
            startActivity(intent);
        });
        btn3.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity8.class);
            startActivity(intent);
        });
    }
}