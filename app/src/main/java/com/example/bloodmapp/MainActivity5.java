package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btn1=findViewById(R.id.donor_list);
        btn2=findViewById(R.id.donor_id);
        btn3=findViewById(R.id.donor_add);
        btn3.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity6.class);
            startActivity(intent);
        });
    }
}