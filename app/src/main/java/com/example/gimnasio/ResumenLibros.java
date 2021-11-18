package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class ResumenLibros extends AppCompatActivity {
    TextView tv1,tv2;
    VideoView video;
    ImageButton btnPalabras,btnClub5am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_libros);
        btnPalabras = findViewById(R.id.ibPalabrasquevenden);
        btnClub5am = findViewById(R.id.ibclu5am);
        tv1 = findViewById(R.id.tvResumen1);
        tv2 = findViewById(R.id.tvresumen2);
        video = findViewById(R.id.resumenvideo);
        tv1.setText("Este es un breve libro lleno de sabiduría y sencillez que nos indica exactamente qué es lo que debemos decir, y en qué circunstancias, para influir en las personas y tener un mayor impacto\n" +
                "Fecha de publicación original: 30 de julio de 2019\n" +
                "Autor: Phil M. Jones\n" +
                "Género: Libro de autoayuda");
        tv2.setText("El club de las 5 am, es un estilo de vida que creó Robin Sharma, uno de los mayores expertos mundiales en liderazgo y desempeño.\n" +
                "Fecha de publicación original: 4 de diciembre de 2018\n" +
                "Autor: Robin S. Sharma");
        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.palabrasquevenden));
                video.start();
            }
        });
        btnClub5am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.club5am));
                video.start();
            }
        });
    }
}