package com.example.firstactivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.firstactivity.listView.Fruit;
import com.example.firstactivity.listView.FruitAdapter_V2;

import java.util.ArrayList;
import java.util.List;


public class ThirdActivity extends BaseActivity {
    private final String tag="有人叫我起来：";
    private final List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d(tag,getIntent().getStringExtra("msg"));

        initFruits();
//        FruitAdapter fruitAdapter=new FruitAdapter(ThirdActivity.this,R.layout.fruit_item,fruitList);
        FruitAdapter_V2 fruitAdapter=new FruitAdapter_V2(ThirdActivity.this,R.layout.fruit_item,fruitList);
        ListView listView=findViewById(R.id.listview);
        listView.setAdapter(fruitAdapter);

        listView.setOnItemClickListener((AdapterView<?> parent, View view, int position, long id)->{
            Fruit fruit= fruitList.get(position);
            Toast.makeText(ThirdActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
        });
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple);
            fruitList.add(apple);
            Fruit lemon = new Fruit("Lemon", R.drawable.lemon);
            fruitList.add(lemon);
            Fruit orange = new Fruit("Orange", R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit mango = new Fruit("Mango", R.drawable.mango);
            fruitList.add(mango);
            Fruit purple = new Fruit("Purple", R.drawable.purple);
            fruitList.add(purple);
        }
    }
}
