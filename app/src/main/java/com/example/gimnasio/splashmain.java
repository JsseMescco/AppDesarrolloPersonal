package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splashmain extends AppCompatActivity {
    public static final long SPLASH_SCREEN_DELAY = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashmain);

        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(splashmain.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}