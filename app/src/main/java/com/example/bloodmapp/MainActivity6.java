package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {
    Button btn1,btn2;
    EditText ed1,ed2,ed3,ed4,ed5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btn1=findViewById(R.id.donor_back);
        btn2=findViewById(R.id.donor_next);
        ed1=findViewById(R.id.donor_name);
        ed2=findViewById(R.id.donor_email);
        ed3=findViewById(R.id.donor_aadhar_number);
        ed4=findViewById(R.id.donor_mobile_number);
        ed5=findViewById(R.id.donor_blood_group);
        btn1.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity5.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity7.class);
            startActivity(intent);
        });
    }
}