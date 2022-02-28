package com.example.firstactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
        Log.d("正在运行",getClass().getSimpleName());
    }

    /** 或android.os.Process.killProcess(android.os.Process.myPid());
     * 杀死自己的进程
     * */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

    protected void startActivityWithOneStr(Context context,Class cls,String msg){
        Intent intent=new Intent(context,cls);
        intent.putExtra("msg",msg);
        startActivity(intent);
    }
}
