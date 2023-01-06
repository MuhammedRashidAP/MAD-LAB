package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText user,pass1;
    Boolean a=false;
    TextView textView;
    String ab,ed,email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.editTextTextPersonName);
        pass1 = findViewById(R.id.editTextTextPassword);
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(this);
        ab =user.getText().toString();
        ed = pass1.getText().toString();
        Intent intent = getIntent();
        email = intent.getStringExtra("email");
        pass = intent.getStringExtra("pass");
    }
    private boolean a(){
        if (user.length()==0){
            user.setError("user name required");
            return false;
        }
        if (pass1.length()==0){
            pass1.setError("password required");
            return false;
        }
        if (!ab.equals(email)){
            user.setError("invalied format");
            return false;
        }
        if (!ed.equals(pass)){
            pass1.setError("invalied format");
            return false;
        }

        return true;
    }

    public void ragister(View view) {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);
    }

    public void login(View view) {
        if (a()){
            Toast.makeText(this, "Successfully login", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this,MainActivity3.class);
            startActivity(i);
        }
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this,MainActivity4.class);
        startActivity(i);
    }
}