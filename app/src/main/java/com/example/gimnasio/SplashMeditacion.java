package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashMeditacion extends AppCompatActivity {

    private static final int SPLASH_SCREEN_DELAY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_meditacion);
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(SplashMeditacion.this, Meditacion.class);
                startActivity(intent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}