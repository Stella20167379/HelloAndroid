package com.example.firstactivity.Utils;

import androidx.annotation.NonNull;

import com.example.firstactivity.R;
import com.example.firstactivity.listView.Fruit;
import com.example.firstactivity.recyclerView.Msg;

import org.jetbrains.annotations.Contract;

import java.util.List;

public class InitData {

    @NonNull
    @Contract("null -> fail")
    public static List<Fruit> initFruitList(List<Fruit> fruitList) {
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

        return fruitList;
    }

    @NonNull
    @Contract("null -> fail")
    public static List<Msg> initMsgList(List<Msg> msgList){
        for (int i = 0; i < 3; i++) {
            msgList.add(new Msg("Hello,guy",Msg.TYPE_RECIEVED));
            msgList.add(new Msg("Hello, who is that?",Msg.TYPE_SENT));
            msgList.add(new Msg("This is Tom, Nice to Meet you",Msg.TYPE_RECIEVED));
            msgList.add(new Msg("Oh hi! My name is LiMing",Msg.TYPE_SENT));
        }

        return msgList;
    }
}
