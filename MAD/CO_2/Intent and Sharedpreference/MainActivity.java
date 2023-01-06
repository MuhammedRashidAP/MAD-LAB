package com.example.intentandsharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText un,em,pw;
    Button lg;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un = findViewById(R.id.e1);
        em = findViewById(R.id.e2);
        pw = findViewById(R.id.e3);
        lg = findViewById(R.id.button);
        sp = getSharedPreferences("login",MODE_PRIVATE);
    }

    public void LOGIN(View view) {
        Toast.makeText(this, "Successfully Login ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        String name=un.getText().toString();
        String email=em.getText().toString();
        String password = pw.getText().toString();
        i.putExtra("name",name);
        i.putExtra("email",email);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("password",password);
        ed.commit();
        startActivity(i);
    }
}