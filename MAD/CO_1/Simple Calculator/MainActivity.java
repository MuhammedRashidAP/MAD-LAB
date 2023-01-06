package com.example.arithamaticcalc;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText VAL1,VAL2,RES;
    Button SUM,SUB,MUL,DIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VAL1 = findViewById(R.id.eD1);
        VAL2 = findViewById(R.id.eD2);
        RES = findViewById(R.id.eR1);
        SUM = findViewById(R.id.b1);
        SUB = findViewById(R.id.b2);
        MUL = findViewById(R.id.b3);
        DIV = findViewById(R.id.b4);


    }
    public void SUM(View view) {
        int n1 = Integer.parseInt(VAL1.getText().toString());
        int n2 = Integer.parseInt(VAL2.getText().toString());
        int n = n1+n2;
        RES.setText(n+"");
    }

    public void SUB(View view) {
        int n1 = Integer.parseInt(VAL1.getText().toString());
        int n2 = Integer.parseInt(VAL2.getText().toString());
        int n = n1-n2;
        RES.setText(n+"");
    }

    public void MUL(View view) {
        int n1 = Integer.parseInt(VAL1.getText().toString());
        int n2 = Integer.parseInt(VAL2.getText().toString());
        int n = n1*n2;
        RES.setText(n+"");
    }

    public void DIV(View view) {
        int n1 = Integer.parseInt(VAL1.getText().toString());
        int n2 = Integer.parseInt(VAL2.getText().toString());
        int n = n1/n2;
        RES.setText(n+"");
    }
}