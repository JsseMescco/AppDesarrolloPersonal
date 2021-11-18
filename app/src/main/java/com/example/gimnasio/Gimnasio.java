package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Gimnasio extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gimnasio);
        textView = findViewById(R.id.tv1);


    }

    public void PectoralesVista(View view) {
        Intent intent = new Intent().setClass(Gimnasio.this, Pectorales.class);
        startActivity(intent);
    }

    public void EspaldaVista(View view) {
        Intent intent = new Intent().setClass(Gimnasio.this, Pectorales.class);
        startActivity(intent);
    }

    public void BicepsVista(View view) {
        Intent intent = new Intent().setClass(Gimnasio.this, Pectorales.class);
        startActivity(intent);
    }

    public void GluteosVista(View view) {
        Intent intent = new Intent().setClass(Gimnasio.this, Gluteos.class);
        startActivity(intent);
    }

    public void PiernasVista(View view) {
        Intent intent = new Intent().setClass(Gimnasio.this, Piernas.class);
        startActivity(intent);
    }

    public void AbdomenVista(View view) {
        Intent intent = new Intent().setClass(Gimnasio.this, Abdomen.class);
        startActivity(intent);
    }
}