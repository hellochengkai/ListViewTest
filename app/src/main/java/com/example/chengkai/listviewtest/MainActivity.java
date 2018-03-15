package com.example.chengkai.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView listView = null;
    private static final String TAG = "MainActivity";
    String [] data = {"text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text"};
    List<MyData> myDatas = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        initview();
    }
    void initdata(){
        myDatas = new ArrayList();
        for (int i = 0; i< 20;i ++){
            if(i%2 == 0)
                myDatas.add(new MyData("I == " + i,R.mipmap.ic_launcher));
            else
                myDatas.add(new MyData("I == " + i,R.mipmap.ic_launcher_round));
        }
    }
    void initview()
    {
        MyAdapter myAdapter= new MyAdapter(myDatas);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listView = findViewById(R.id.listview);
        listView.setLayoutManager(linearLayoutManager);
        listView.setAdapter(myAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                MyData myData = myDatas.get(position);
//                Log.d(TAG, "onItemClick: " + myData.getText());
//                Toast.makeText(MainActivity.this,myData.text,Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
