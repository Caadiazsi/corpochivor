package com.example.corpochivor;

import android.graphics.drawable.Drawable;

public class Coleccion {
    String name;
    int image;

    public Coleccion(String name, int image){
        this.name = name;
        this.image = image;
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public int getImage(){return image;}

    public void setImage(int image){this.image = image;}
}
