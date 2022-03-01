package com.example.firstactivity;


import android.os.Bundle;
import android.widget.Button;

import com.example.firstactivity.recyclerView.DialogActivity;
import com.example.firstactivity.recyclerView.FruitRecyclerActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        给按钮添加监听事件以打开其他活动进行测试
        Button secondTest=findViewById(R.id.LBInParent);
        Button thirdTest=findViewById(R.id.RTInParent);
        Button fruitRecyclerTest=findViewById(R.id.CInParent);
        Button dialogTest=findViewById(R.id.LTToCenter);

        secondTest.setOnClickListener(view -> {
            startActivityWithOneStr(MainActivity.this,SecondActivity.class,"MainActivity");
        });

        thirdTest.setOnClickListener(view -> startActivityWithOneStr(MainActivity.this,ThirdActivity.class,"MainActivity"));

        fruitRecyclerTest.setOnClickListener(view -> startActivityWithOneStr(MainActivity.this, FruitRecyclerActivity.class,"MainActivity"));

        dialogTest.setOnClickListener(view -> startActivityWithOneStr(MainActivity.this, DialogActivity.class,"MainActivity"));

    }
}