package com.example.corpochivor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private ArrayList<Coleccion> list;
    private Context context;

    public Adapter(Context context, ArrayList<Coleccion> list){
        this.list = list;
        this.context = context;
    }

    public ArrayList<Coleccion> getList(){return list;}

    @Override
    public int getCount(){return list.size();}

    @Override
    public Coleccion getItem(int i){return list.get(i);}

    @Override
    public long getItemId(int i){return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Coleccion item = list.get(i);
        view = LayoutInflater.from(context).inflate(R.layout.list_item,null);
        TextView name = (TextView) view.findViewById(R.id.itemText);
        ImageView image = (ImageView) view.findViewById(R.id.itemImage);
        name.setText(item.getName());
        image.setImageResource(item.getImage());
        return view;
    }
}
