package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.ngo_list);
        btn2=findViewById(R.id.add_ngo);
        btn3=findViewById(R.id.update_ngo);
        btn4=findViewById(R.id.delete_ngo);
        btn5=findViewById(R.id.add_donor);
        btn2.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);
        });
    }
}