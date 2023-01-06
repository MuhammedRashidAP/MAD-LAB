package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button bProceed;
    EditText fn,ln,em,pw;
    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bProceed = findViewById(R.id.b2);
        fn = findViewById(R.id.ET_1);
        ln = findViewById(R.id.ET_2);
        em = findViewById(R.id.ET_3);
        pw = findViewById(R.id.ET_4);
    }

    public void PROCEED(View view) {
        isAllFieldsChecked = CheckAllFields();
        if (isAllFieldsChecked){
            Toast.makeText(MainActivity2.this, "Succesfully Register", Toast.LENGTH_LONG).show();
            Intent i = new Intent(MainActivity2.this,MainActivity.class);
            String email = em.getText().toString();
            String pass = pw.getText().toString();
            i.putExtra("email",email);
            i.putExtra("pass",pass);
            Toast.makeText(this, "Successfully Registered", Toast.LENGTH_SHORT).show();
            startActivity(i);
        }
    }
    private boolean CheckAllFields() {
        if (fn.length() == 0){
            fn.setError("This field is required");
            fn.requestFocus();
            return false;
        }
        if (ln.length() == 0){
            ln.setError("This field is required");
            return false;
        }
        if (em.length() == 0) {
            em.setError("This field is required");
            return false;
        }
        else {
            String s_email = em.getText().toString();
            String check_email = "[a-zA-z0-9._-]+@[a-z]+[.]+[a-z]+";
            if (!s_email.matches(check_email)){
                em.setError("Invalied Email");
                return false;
            }
        }
        if (pw.length() == 0) {
            pw.setError("This field is required");
            return false;
        }else if (pw.length() < 8) {
            pw.setError("This must be minimum 8");
            return false;
        }
        return true;
    }
}