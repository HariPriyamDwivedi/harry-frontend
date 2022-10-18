package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity3 extends AppCompatActivity {
    Button btn1,btn2;
    String name="";
    String ur_id="";
    String ngo_type="";
    String ngo_url ="";
    String ngo_address="";
    String url ="https://soorveer-api.herokuapp.com/api/ngo";
    EditText ed1,ed2,ed3,ed4,ed5;
    RequestQueue queue;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ed1=findViewById(R.id.ngo_district);
        ed2=findViewById(R.id.ngo_state);
        ed3=findViewById(R.id.ngo_pan_no);
        ed4=findViewById(R.id.csr_no);
        ed5= findViewById(R.id.ngo_niti_ayog);
        btn1=findViewById(R.id.back2);
        btn2=findViewById(R.id.submit1);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            name = bundle.getString("name");
            ur_id = bundle.getString("ur_id");
            ngo_type=bundle.getString("ngo_type");
            ngo_url= bundle.getString("ngo_url");
            ngo_address= bundle.getString("ngo_address");
        }
        btn1.setOnClickListener(View->{

            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(View->{
            queue = Volley.newRequestQueue(getApplicationContext());
            JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("Unique_Registration_ID",ur_id);
                jsonObject.put("NGO_Name",name);
                jsonObject.put("NGO_Type",ngo_type);
                jsonObject.put("NGO_Url",ngo_url);
                jsonObject.put("NGO_Address",ngo_address);
                jsonObject.put("NGO_State",ed2.getText().toString());
                jsonObject.put("NGO_District",ed1.getText().toString());
                jsonObject.put("NGO_PAN_Number",ed3.getText().toString());
                jsonObject.put("CSR_Number",ed4.getText().toString());
                jsonObject.put("NGO_Niti_Ayog",ed5.getText().toString());

            }catch (JSONException e)
            {
                e.printStackTrace();
            }
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonObject, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    Toast.makeText(MainActivity3.this, "NGO added successfully", Toast.LENGTH_SHORT).show();
                    Log.d("Response : ",response.toString());
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.d("Error : ",error.toString());
                }
            });
            queue.add(jsonObjectRequest);
            Intent intent1=new Intent(this,MainActivity.class);
            startActivity(intent1);
        });
    }
}