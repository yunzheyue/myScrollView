package com.example.app9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test1(View view) {

        Toast.makeText(MainActivity.this, "test1", Toast.LENGTH_SHORT).show();
    }

    public void test2(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }
}
