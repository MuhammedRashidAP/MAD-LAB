package com.example.uivalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bProceed;
    EditText fn,ln,em,pw;
    boolean isAllFieldsChecked = false;
    RadioGroup rd;
    RadioButton m;
    CheckBox ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bProceed = findViewById(R.id.b2);
        fn = findViewById(R.id.ET_1);
        ln = findViewById(R.id.ET_2);
        em = findViewById(R.id.ET_3);
        pw = findViewById(R.id.ET_4);
        m = findViewById(R.id.radioButton3);
        rd = findViewById(R.id.rd);
        ch = findViewById(R.id.checkBox);


    }
    public void PROCEED(View view) {
        isAllFieldsChecked = CheckAllFields();
        if (isAllFieldsChecked){
            Toast.makeText(MainActivity.this, "Succesfully Register", Toast.LENGTH_LONG).show();
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
        if (rd.getCheckedRadioButtonId()==-1){
            m.setError("This field is required");
            m.requestFocus();
            return false;
        }
        if (!ch.isChecked()){
            ch.setError("required");
            return false;
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