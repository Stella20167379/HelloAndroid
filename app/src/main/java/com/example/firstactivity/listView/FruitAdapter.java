package com.example.firstactivity.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.firstactivity.R;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit=getItem(position);
        /**
         * listview里的每一个item都是通过adapter的getView来得到的
         * 根据listview的高度和item的高度来循环加载显示在listview上
         * 每将屏幕外的子项滑进屏幕时，都会重新加载布局，FruitAdapter_V2将对此优化
         * */
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        ImageView fruitImg=view.findViewById(R.id.fruit_image);
        TextView fruitText = view.findViewById(R.id.fruit_name);
        fruitImg.setImageResource(fruit.getImageid());
        fruitText.setText(fruit.getName());

        return view;
    }
}
