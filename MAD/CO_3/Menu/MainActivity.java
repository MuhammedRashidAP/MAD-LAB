package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this, "STUDENT", Toast.LENGTH_LONG).show();
                break;
            case R.id.i2:
                Toast.makeText(this, "DEPARTMENT", Toast.LENGTH_SHORT).show();
                break;
            case R.id.i3:
                Toast.makeText(this, "FACULTY", Toast.LENGTH_LONG).show();
                break;
            case R.id.i4:
                Toast.makeText(this, "MANAGEMENT", Toast.LENGTH_LONG).show();
                break;
            case R.id.s1:
                Toast.makeText(this, "MCA", Toast.LENGTH_LONG).show();
                break;
            case R.id.s2:
                Toast.makeText(this, "MBA", Toast.LENGTH_LONG).show();
                break;
            case R.id.s3:
                Toast.makeText(this, "B-TECH", Toast.LENGTH_LONG).show();
                break;
            case R.id.s4:
                Toast.makeText(this, "M-TECH", Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}