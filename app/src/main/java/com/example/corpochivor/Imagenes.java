package com.example.corpochivor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Imagenes extends AppCompatActivity {

    ArrayList<Coleccion> coleccion;
    Adapter adapter;
    ListView list_coleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagenes);
        list_coleccion = findViewById(R.id.list_coleccion);
        listarMI();
        eventos();
    }

    private void listarMI(){
        coleccion = new ArrayList<Coleccion>();
        coleccion.add(new Coleccion(getString(R.string.mi_1), R.drawable.mi_1));
        coleccion.add(new Coleccion(getString(R.string.mi_2), R.drawable.mi_2));
        coleccion.add(new Coleccion(getString(R.string.mi_3), R.drawable.mi_3));
        coleccion.add(new Coleccion(getString(R.string.mi_4), R.drawable.mi_4));
        coleccion.add(new Coleccion(getString(R.string.mi_5), R.drawable.mi_5));
        coleccion.add(new Coleccion(getString(R.string.mi_6), R.drawable.mi_6));
        coleccion.add(new Coleccion(getString(R.string.mi_7), R.drawable.mi_7));
        coleccion.add(new Coleccion(getString(R.string.mi_8), R.drawable.mi_8));
        coleccion.add(new Coleccion(getString(R.string.mi_9), R.drawable.mi_9));
        coleccion.add(new Coleccion(getString(R.string.mi_10), R.drawable.mi_10));
        coleccion.add(new Coleccion(getString(R.string.mi_11), R.drawable.mi_11));
        coleccion.add(new Coleccion(getString(R.string.mi_12), R.drawable.mi_12));
        coleccion.add(new Coleccion(getString(R.string.mi_13), R.drawable.mi_13));
        coleccion.add(new Coleccion(getString(R.string.mi_14), R.drawable.mi_14));
        coleccion.add(new Coleccion(getString(R.string.mi_15), R.drawable.mi_15));
        coleccion.add(new Coleccion(getString(R.string.mi_16), R.drawable.mi_16));
        coleccion.add(new Coleccion(getString(R.string.mi_17), R.drawable.mi_17));
        coleccion.add(new Coleccion(getString(R.string.mi_18), R.drawable.mi_18));
        coleccion.add(new Coleccion(getString(R.string.mi_19), R.drawable.mi_19));
        coleccion.add(new Coleccion(getString(R.string.mi_20), R.drawable.mi_20));
        coleccion.add(new Coleccion(getString(R.string.mi_21), R.drawable.mi_21));
        coleccion.add(new Coleccion(getString(R.string.mi_22), R.drawable.mi_22));
        coleccion.add(new Coleccion(getString(R.string.mi_23), R.drawable.mi_23));
        coleccion.add(new Coleccion(getString(R.string.mi_24), R.drawable.mi_24));
        adapter = new Adapter(Imagenes.this, coleccion);
        list_coleccion.setAdapter(adapter);
    }

    private void eventos(){
        list_coleccion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), Image.class);
                intent.putExtra("Image", coleccion.get(position).getImage());
                intent.putExtra("Name", coleccion.get(position).getName());
                startActivity(intent);
            }
        });
    }
}
