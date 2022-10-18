package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button btn1,btn2;
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1=findViewById(R.id.back1);
        btn2=findViewById(R.id.next1);
        ed1=findViewById(R.id.ur_id);
        ed2=findViewById(R.id.ngo_name);
        ed3=findViewById(R.id.date_of_registration);
        ed4=findViewById(R.id.ngo_type);
        ed5=findViewById(R.id.ngo_url);
        ed6=findViewById(R.id.ngo_address);
        btn1.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(View->{
            Intent intent=new Intent(this,MainActivity3.class);
            String ur_id = ed1.getText().toString();
            String name = ed2.getText().toString();
            intent.putExtra("ur_id",ur_id);
            intent.putExtra("name",name);
            intent.putExtra("ngo_type",ed4.getText().toString());
            intent.putExtra("ngo_url",ed5.getText().toString());
            intent.putExtra("ngo_address",ed6.getText().toString());
            startActivity(intent);
        });
    }
}