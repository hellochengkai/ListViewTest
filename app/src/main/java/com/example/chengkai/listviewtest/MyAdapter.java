package com.example.chengkai.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<MyData> list = null;
    public MyAdapter(List<MyData> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_text,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MyData myData = list.get(position);
        holder.imageView.setImageResource(myData.id);
        holder.textView.setText(myData.text);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    //    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        MyData myData = getItem(position);
//
//        View view= null;
//        ViewHolder viewHolder = null;
//        if(convertView == null){
//            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
//            viewHolder = new ViewHolder();
//            viewHolder.imageView = view.findViewById(R.id.image);
//            viewHolder.textView = view.findViewById(R.id.text);
//            view.setTag(viewHolder);
//        }else {
//            view = convertView;
//            viewHolder = (ViewHolder) view.getTag();
//        }
//        ImageView imageView = viewHolder.imageView;
//        TextView textView = viewHolder.textView;
//        imageView.setImageResource(myData.id);
//        textView.setText(myData.text);
//        return view;
//    }
    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.image);
            this.textView = itemView.findViewById(R.id.text);
        }
    }
}
