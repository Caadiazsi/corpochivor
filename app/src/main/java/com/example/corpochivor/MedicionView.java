package com.example.corpochivor;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MedicionView extends AppCompatActivity {

    TextView title;
    TextView text;
    ProgressBar state;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicion_view);
        title = findViewById(R.id.MedicionViewDate);
        text = findViewById(R.id.MedicionViewText);
        state = findViewById(R.id.progressBar);
        title.setText(getIntent().getStringExtra("Date"));
        state.setProgress(getIntent().getIntExtra("Progress", 50));
        state.getProgressDrawable().setColorFilter(getIntent().getIntExtra("Color", 50), PorterDuff.Mode.SRC_IN);
        System.out.println(getIntent().getIntExtra("Progress", 50));
        switch (getIntent().getIntExtra("Progress", 50)){
            case 100: text.setText("Aguas muy limpias."); break;
            case 85: text.setText("Aguas no contaminadas."); break;
            case 68: text.setText("Ligeramente contaminada: se evidencian efectos de contaminación."); break;
            case 51: text.setText("Aguas moderadamente contaminadas."); break;
            case 34: text.setText("Aguas muy contaminadas."); break;
            case 17: text.setText("Aguas fuertemente contaminadas, situación crítica"); break;
            default: text.setText("Error"); break;
        }
    }
}
