package com.example.corpochivor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Mediciones extends AppCompatActivity {

    ArrayList<MedicionHistoria> historial;
    AdapterHistorial adapter;
    ListView list_historial;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mediciones);
        list_historial = findViewById(R.id.list_historial);
        listar_historial();
        eventos();
    }

    private void listar_historial(){
        historial = new ArrayList<MedicionHistoria>();
        historial.add(new MedicionHistoria("2020-04-11", 100, getResources().getColor(R.color.blue_c1)));
        historial.add(new MedicionHistoria("2020-04-10", 85, getResources().getColor(R.color.teal_200)));
        historial.add(new MedicionHistoria("2020-04-09", 68, getResources().getColor(R.color.green_c1)));
        historial.add(new MedicionHistoria("2020-04-08", 51, getResources().getColor(R.color.yellow)));
        historial.add(new MedicionHistoria("2020-04-07", 34, getResources().getColor(R.color.orange)));
        historial.add(new MedicionHistoria("2020-04-07", 17, getResources().getColor(R.color.red)));
        adapter = new AdapterHistorial(Mediciones.this, historial);
        list_historial.setAdapter(adapter);
    }
    private void eventos(){
        list_historial.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), Medicion.class);
                intent.putExtra("Progress", historial.get(position).getProgress());
                intent.putExtra("Date", historial.get(position).getDate());
                intent.putExtra("Color", historial.get(position).getColor());
                startActivity(intent);
            }
        });

    }
}
