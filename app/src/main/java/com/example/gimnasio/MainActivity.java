package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnGym, btnFrases, btnMeditacion, btnLectura,btnMetodoWimHof, btnOrganizacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGym = findViewById(R.id.ibGym);
        btnFrases = findViewById(R.id.ibMotivacion);
        btnMeditacion = findViewById(R.id.ibMeditacion);
        btnMetodoWimHof= findViewById(R.id.ibWimhof);
        btnOrganizacion = findViewById(R.id.ibTiempo);
        btnLectura = findViewById(R.id.ibLectura);
        btnGym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MainActivity.this, Splash2gym.class);
                startActivity(intent);
            }
        });
        btnFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MainActivity.this, Motivacion.class);
                startActivity(intent);
            }
        });
        btnMeditacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MainActivity.this, SplashMeditacion.class);
                startActivity(intent);
            }
        });
        btnMetodoWimHof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MainActivity.this, Splash1gym.class);
                startActivity(intent);
            }
        });
        btnOrganizacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MainActivity.this, Organizacion.class);
                startActivity(intent);
            }
        });
        btnLectura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MainActivity.this, SplashLectura.class);
                startActivity(intent);
            }
        });
    }
}