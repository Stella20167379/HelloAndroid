package com.example.firstactivity.recyclerView;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.firstactivity.R;
import com.example.firstactivity.Utils.InitData;
import com.example.firstactivity.listView.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitRecyclerActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        InitData.initFruitList(fruitList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new
//              竖直方向上分为4个item，即每列4个
                StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(layoutManager);

        SecondFruitAdapter adapter=new SecondFruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
}
