package com.example.firstactivity;


import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTest=findViewById(R.id.btn_01);
        btnTest.setOnClickListener(view -> {
            startActivityWithOneStr(MainActivity.this,ThirdActivity.class,"MainActivity");
        });
    }
}