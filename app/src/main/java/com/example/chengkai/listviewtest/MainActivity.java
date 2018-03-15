package com.example.chengkai.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView = null;
    String [] data = {"text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text","text"};
    List myData = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        initview();
    }
    void initdata(){
        myData = new ArrayList();
        for (int i = 0; i< 20;i ++){
            if(i%2 == 0)
                myData.add(new MyData("I == " + i,R.mipmap.ic_launcher));
            else
                myData.add(new MyData("I == " + i,R.mipmap.ic_launcher_round));
        }
    }
    void initview()
    {
        MyAdapter arrayAdapter = new MyAdapter(
                getApplicationContext(),
                R.layout.list_view_text,
                myData);
        listView = findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);
    }
}
