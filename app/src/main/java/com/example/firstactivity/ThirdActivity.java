package com.example.firstactivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.firstactivity.Utils.InitData;
import com.example.firstactivity.listView.Fruit;
import com.example.firstactivity.listView.FruitAdapter_V2;

import java.util.ArrayList;
import java.util.List;


public class ThirdActivity extends BaseActivity {
    private final String tag="有人叫我起来";
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d(tag,getIntent().getStringExtra("msg"));

        try {
            InitData.initFruitList(fruitList);
        } catch (Exception e) {
            e.printStackTrace();
            fruitList=new ArrayList<>();
            Log.e("ThirdActivity","水果数据列表初始化失败");
        }

//        FruitAdapter fruitAdapter=new FruitAdapter(ThirdActivity.this,R.layout.fruit_item,fruitList);
        FruitAdapter_V2 fruitAdapter=new FruitAdapter_V2(ThirdActivity.this,R.layout.fruit_item,fruitList);
        ListView listView=findViewById(R.id.listview);
        listView.setAdapter(fruitAdapter);

        listView.setOnItemClickListener((AdapterView<?> parent, View view, int position, long id)->{
            Fruit fruit= fruitList.get(position);
            Toast.makeText(ThirdActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
        });
    }

}
