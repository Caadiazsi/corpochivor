package com.example.corpochivor;

public class MedicionHistoria {
    String date;
    int progress;
    int color;

    public MedicionHistoria(String date, int progress, int color){
        this.date = date;
        this.progress = progress;
        this.color = color;
    }

    public String getDate(){return date;}

    public void setDate(String date){this.date = date;}

    public int getProgress(){return progress;}

    public void setProgress(int progress){this.progress = progress;}

    public int getColor(){return color;}

    public void setColor(int color){this.color = color;}
}
