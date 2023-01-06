package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img2 = findViewById(R.id.imageView5);
        img1 = findViewById(R.id.imageView4);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == img1){
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        }else {
            img2.setVisibility(View.GONE);
            img1.setVisibility(View.VISIBLE);
        }
    }
}