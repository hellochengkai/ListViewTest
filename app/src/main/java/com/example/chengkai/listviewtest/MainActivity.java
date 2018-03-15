package com.example.chengkai.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView = null;
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
        MyAdapter arrayAdapter = new MyAdapter(
                getApplicationContext(),
                R.layout.list_view_text,
                myDatas);
        listView = findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyData myData = myDatas.get(position);
                Log.d(TAG, "onItemClick: " + myData.getText());
                Toast.makeText(MainActivity.this,myData.text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
