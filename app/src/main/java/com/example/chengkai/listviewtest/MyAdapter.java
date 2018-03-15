package com.example.chengkai.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chengkai on 18-3-15.
 */

public class MyAdapter extends ArrayAdapter<MyData> {
    int resourceId = 0;

    public MyAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<MyData> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MyData myData = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView imageView = view.findViewById(R.id.image);
        TextView textView = view.findViewById(R.id.text);
        imageView.setImageResource(myData.id);
        textView.setText(myData.text);
        return view;
    }
}
