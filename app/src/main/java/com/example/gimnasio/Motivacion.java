package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Motivacion extends AppCompatActivity {
    ImageView imgFrases;
    int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivacion);
        imgFrases = findViewById(R.id.ivfrases);
        numero = (int) (Math.random() * 7) + 1;
        switch (numero){
            case 1:
                imgFrases.setImageResource(R.drawable.frase1);
                break;
            case 2:
                imgFrases.setImageResource(R.drawable.frase2);
                break;
            case 3:
                imgFrases.setImageResource(R.drawable.frase3);
                break;
            case 4:
                imgFrases.setImageResource(R.drawable.frase4);
                break;
            case 5:
                imgFrases.setImageResource(R.drawable.frase5);
                break;
            case 6:
                imgFrases.setImageResource(R.drawable.frase6);
                break;
            case 7:
                imgFrases.setImageResource(R.drawable.frase7);
                break;
        }

    }
}