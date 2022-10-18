package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity7 extends AppCompatActivity {
    Button btn1,btn2;
    EditText ed1,ed2,ed3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        btn1=findViewById(R.id.donor_back1);
        btn2=findViewById(R.id.donor_submit);
        ed1=findViewById(R.id.number_of_times_donated);
        ed2=findViewById(R.id.donor_address);
        ed3=findViewById(R.id.organisation_id);
        btn1.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity6.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }
}