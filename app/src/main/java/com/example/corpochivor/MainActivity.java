package com.example.corpochivor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nueva_medicion = (Button)findViewById(R.id.button_1);
        nueva_medicion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), Medicion.class));
            }
        });
        Button mis_mediciones = (Button)findViewById(R.id.button_2);
        mis_mediciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Mediciones.class));
            }
        });
        Button coleccion_imagenes = (Button)findViewById(R.id.button_3);
        coleccion_imagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Imagenes.class));
            }
        });
        Button mis_registros = (Button)findViewById(R.id.button_4);
        mis_registros.setVisibility(View.INVISIBLE);
        mis_registros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Registros.class));
            }
        });
    }
}