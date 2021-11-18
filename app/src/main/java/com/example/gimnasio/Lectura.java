package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Lectura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura);

    }

    public void ResumenesLibros(View view) {
        Intent intent = new Intent().setClass(Lectura.this, ResumenLibros.class);
        startActivity(intent);
    }

    public void LIBROS(View view) {
        Intent intent = new Intent().setClass(Lectura.this, ResumenLibros.class);
        startActivity(intent);
    }

    public void Descargarlibros(View view) {
        Intent intent = new Intent().setClass(Lectura.this, ResumenLibros.class);
        startActivity(intent);
    }
}