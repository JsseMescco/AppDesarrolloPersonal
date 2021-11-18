package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EjerciciosMW extends AppCompatActivity {
ImageButton btnflexiones,btnfundamentos,btnequilibrio, btnInclinacion, btnduchafria,btnbarril;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_mw);
        btnflexiones = findViewById(R.id.ibRespiracion1);
        btnfundamentos = findViewById(R.id.ibRespiracion2);
        btnequilibrio = findViewById(R.id.ibequilibrio);
        btnInclinacion = findViewById(R.id.ibinclinacion);
        btnduchafria = findViewById(R.id.ibDuchafria);
        btnbarril = findViewById(R.id.ibBarril);
        
        btnflexiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(EjerciciosMW.this, DuchasWH.class);
                startActivity(intent);
            }
        });
        btnfundamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(EjerciciosMW.this, DuchasWH.class);
                startActivity(intent);
            }
        });
        btnequilibrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(EjerciciosMW.this, DuchasWH.class);
                startActivity(intent);
            }
        });
        btnInclinacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(EjerciciosMW.this, DuchasWH.class);
                startActivity(intent);
            }
        });
        btnduchafria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(EjerciciosMW.this, DuchasWH.class);
                startActivity(intent);
            }
        });
        btnbarril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(EjerciciosMW.this, DuchasWH.class);
                startActivity(intent);
            }
        });
    }
}