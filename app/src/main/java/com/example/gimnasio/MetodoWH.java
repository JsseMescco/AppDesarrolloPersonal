package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MetodoWH extends AppCompatActivity {
    ImageButton btnEJercicios, btnDuchas , btnRespiracion, btnAudios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo_wh);
        btnEJercicios = findViewById(R.id.ibEjercicios);
        btnDuchas = findViewById(R.id.ibDuchas);
        btnRespiracion = findViewById(R.id.ibRespiracion);
        btnAudios = findViewById(R.id.ibAudios);

        btnEJercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MetodoWH.this, EjerciciosMW.class);
                startActivity(intent);
            }
        });
        btnDuchas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MetodoWH.this, DuchasWH.class);
                startActivity(intent);
            }
        });
        btnRespiracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MetodoWH.this, RespiracionWH.class);
                startActivity(intent);
            }
        });
        btnAudios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent().setClass(MetodoWH.this, AudiosWH.class);
                startActivity(intent);
            }
        });
    }

    public void Informacion(View view) {
        Intent intent = new Intent().setClass(MetodoWH.this, WHInfo.class);
        startActivity(intent);
    }
}