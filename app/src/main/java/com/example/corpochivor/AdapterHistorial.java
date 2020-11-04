package com.example.corpochivor;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterHistorial extends BaseAdapter {
    private ArrayList<MedicionHistoria> list;
    private Context context;

    public AdapterHistorial(Context context, ArrayList<MedicionHistoria> list){
        this.list = list;
        this.context = context;
    }

    public ArrayList<MedicionHistoria> getList(){return list;}

    @Override
    public int getCount(){return list.size();}

    @Override
    public MedicionHistoria getItem(int i){return list.get(i);}

    @Override
    public long getItemId(int i){return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        MedicionHistoria item = list.get(i);
        view = LayoutInflater.from(context).inflate(R.layout.list_history, null);
        TextView date = (TextView) view.findViewById(R.id.dateView);
        ProgressBar progress = (ProgressBar) view.findViewById(R.id.progressBar);
        date.setText(item.getDate());
        progress.setProgress(item.getProgress());
        progress.getProgressDrawable().setColorFilter(item.getColor(), PorterDuff.Mode.SRC_IN);
        return view;
    }
}
