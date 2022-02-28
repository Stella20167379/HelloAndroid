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

public class FruitAdapter_V2 extends ArrayAdapter<Fruit> {

    private final int resourceId;

    public FruitAdapter_V2(Context context, int textViewResourceId, List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 当前的item数据对象
        Fruit fruit = getItem(position);
        // 自定义内部类，item的内容/控件视图容器，使用松散的视图组件绑定item的各项对应数据
        ViewHolder viewHolder;
        // item的排版视图容器，将viewHolder中各个子项组件组合成最终的视图样式，相当于总容器
        View view;

//        item总容器缓存，实现容器复用
        if(convertView == null){
//            获得一个新的item总容器
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }
        else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageid());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }

    static class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }

}
