package com.example.intentandsharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView un,em,pw;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        un = findViewById(R.id.name);
        em = findViewById(R.id.email);
        pw = findViewById(R.id.password);
        sp = getSharedPreferences("login",MODE_PRIVATE);
        String s1 = sp.getString("password","");
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");

        un.setText("NAME:"+name);
        em.setText("EMAIL:"+email);
        pw.setText("PASSWORD:"+s1);


    }
}