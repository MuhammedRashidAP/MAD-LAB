package com.example.gridcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btD,btSL,btST,btP,btM,clear,eq;
    TextView Res;
    String op="";
    float num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        bt3 = findViewById(R.id.b3);
        bt4 = findViewById(R.id.b4);
        bt5 = findViewById(R.id.b5);
        bt6 = findViewById(R.id.b6);
        bt7 = findViewById(R.id.b7);
        bt8 = findViewById(R.id.b8);
        bt9 = findViewById(R.id.b9);
        bt0 = findViewById(R.id.b0);
        btD = findViewById(R.id.dot);
        btSL = findViewById(R.id.slash);
        btST = findViewById(R.id.star);
        btP = findViewById(R.id.plus);
        btM = findViewById(R.id.minus);
        clear =findViewById(R.id.C);
        eq = findViewById(R.id.equal);
        Res = findViewById(R.id.textView);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btD.setOnClickListener(this);
        btSL.setOnClickListener(this);
        btST.setOnClickListener(this);
        btP.setOnClickListener(this);
        btM.setOnClickListener(this);
        clear.setOnClickListener(this);
        eq.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        if (view == clear){
            Res.setText("");
        } else if (view == btSL ||view == btST||view == btM||view == btP ) {
            num1 = Float.parseFloat(Res.getText().toString());
            op = b.getText().toString();
            Res.setText("");
        }else if (view == eq){
            num2 = Float.parseFloat(Res.getText().toString());
            if (op.equals("+")){
                Res.setText(num1+num2+"");
            }else if (op.equals("-")){
                Res.setText(num1-num2+"");
            }else if (op.equals("*")){
                Res.setText(num1*num2+"");
            }else if (op.equals("/")){
                Res.setText(num1/num2+"");
            }
        }else {
            String s = Res.getText().toString();
            Res.setText(s + b.getText().toString());
        }
        return;
    }
}