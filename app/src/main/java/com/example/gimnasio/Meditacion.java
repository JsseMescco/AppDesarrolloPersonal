package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Meditacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditacion);
    }

    public void MINDFULLNESS(View view) {
        Intent intent = new Intent().setClass(Meditacion.this, Mindfullness.class);
        startActivity(intent);
    }

    public void KUNDALINI(View view) {
        Intent intent = new Intent().setClass(Meditacion.this, Kundalini.class);
        startActivity(intent);

    }

    public void MANTRA(View view) {
        Intent intent = new Intent().setClass(Meditacion.this, Meditacion.class);
        startActivity(intent);
    }

    public void CHAKRA(View view) {
        Intent intent = new Intent().setClass(Meditacion.this, Meditacion.class);
        startActivity(intent);
    }
}