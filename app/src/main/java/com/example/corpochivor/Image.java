package com.example.corpochivor;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Image extends AppCompatActivity {
    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_i);
        image = findViewById(R.id.imageView);
        text = findViewById(R.id.textView);
        text.setText(getIntent().getStringExtra("Name"));
        image.setImageResource(getIntent().getIntExtra("Image", 0));
    }
}
