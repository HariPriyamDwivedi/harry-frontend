package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button get_list , get_id , add;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        get_list=findViewById(R.id.ngo_get_list);
        get_id=findViewById(R.id.ngo_get_id);
        add = findViewById(R.id.ngo_add);
        add.setOnClickListener(View->{
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });
        get_list.setOnClickListener(View->{
            Intent intent1 = new Intent(this, MainActivity11.class);
            startActivity(intent1);
        });
    }
}