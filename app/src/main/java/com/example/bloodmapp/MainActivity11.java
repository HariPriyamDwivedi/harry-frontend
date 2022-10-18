package com.example.bloodmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class MainActivity11 extends AppCompatActivity {
private static String url ="https://soorveer-api.herokuapp.com/api/ngo";
int index =0;
Button  bt1, bt2;
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12;
Button btn1 , btn2;
int length=0;
RequestQueue queue;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        handleSSLHandshake();
        tv1=findViewById(R.id.text_unique_Reg);
        tv2=findViewById(R.id.text_NGO_name);
        tv3=findViewById(R.id.text_DOR);
        tv4=findViewById(R.id.text_NGO_Type);
        tv5=findViewById(R.id.text_NGO_Url);
        tv6=findViewById(R.id.text_NGO_Address);
        tv7=findViewById(R.id.text_NGO_State);
        tv8=findViewById(R.id.text_NGO_District);
        tv9=findViewById(R.id.text_NGO_Pan);
        tv10=findViewById(R.id.text_NGO_CSR);
        tv11=findViewById(R.id.text_NGO_NITI);
        tv12=findViewById(R.id.text_NGO_Annual);

        btn1 = findViewById(R.id.Previous);
        btn2 = findViewById(R.id.Next);


       getData();
        btn1.setOnClickListener(View->{
            index = index-1;
            if(index>0)
            {
                getData();
            }
            else
            {
                Toast.makeText(this, "This is the first page", Toast.LENGTH_SHORT).show();
            }


        });

        btn2.setOnClickListener(View->{
            index=index+1;
            if(index>length)
            {
                Toast.makeText(this, "This is the Last Page", Toast.LENGTH_SHORT).show();
            }
            else
            {
                getData();
            }

        });


    }
    public void getData()
    {
        StringRequest stringRequest = new StringRequest(
                Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {

                    JSONObject jsonObject = new JSONObject(response);

                    JSONArray jsonArray = jsonObject.getJSONArray("data");
                    length = jsonArray.length();
                    JSONObject jsonObject1 = jsonArray.getJSONObject(index);


                    tv1.setText(jsonObject1.getString("Unique_Registration_ID"));
                    tv2.setText(jsonObject1.getString("NGO_Name"));
                    tv3.setText(jsonObject1.getString("Date_of_Registration"));
                    tv4.setText(jsonObject1.getString("NGO_Type"));
                    tv5.setText(jsonObject1.getString("NGO_Url"));
                    tv6.setText(jsonObject1.getString("NGO_Address"));
                    tv7.setText(jsonObject1.getString("NGO_State"));
                    tv8.setText(jsonObject1.getString("NGO_District"));
                    tv9.setText(jsonObject1.getString("NGO_PAN_Number"));
                    tv10.setText(jsonObject1.getString("CSR_Number"));
                    tv11.setText(jsonObject1.getString("NGO_Niti_Ayog"));
                    tv12.setText(jsonObject1.getString("NGO_Annual_Report"));

                    Log.i("data :",response);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Error",error.toString());
            }


        }
        );
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    @SuppressLint("TrulyRandom")
    public static void handleSSLHandshake() {
        try {
            @SuppressLint("CustomX509TrustManager") TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }

                @Override
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }};

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }
            });
        } catch (Exception ignored) {
        }
    }
}