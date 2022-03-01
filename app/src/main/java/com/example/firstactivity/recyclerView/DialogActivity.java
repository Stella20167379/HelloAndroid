package com.example.firstactivity.recyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstactivity.R;
import com.example.firstactivity.Utils.InitData;

import java.util.ArrayList;
import java.util.List;

public class DialogActivity extends AppCompatActivity {
    private List<Msg> msgList=new ArrayList<>();
    private EditText  inputText;
    private Button send;
    private RecyclerView dialogRecyclerView;
    private MsgAdapter msgAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        InitData.initMsgList(msgList);

        inputText=(EditText) findViewById(R.id.input_text);
        send = (Button)findViewById(R.id.send);
        dialogRecyclerView = (RecyclerView) findViewById(R.id.dialog_recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        msgAdapter=new MsgAdapter(msgList);

        dialogRecyclerView.setLayoutManager(layoutManager);
        dialogRecyclerView.setAdapter(msgAdapter);

        send.setOnClickListener(view->{
            String content=inputText.getText().toString();
            if (!"".equals(content)){
                Msg msg=new Msg(content,Msg.TYPE_SENT);
                msgList.add(msg);
                msgAdapter.notifyItemInserted(msgList.size()-1);
                dialogRecyclerView.scrollToPosition(msgList.size()-1);
                inputText.setText("");
            }else {
                Toast.makeText(DialogActivity.this,"请输入内容",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
