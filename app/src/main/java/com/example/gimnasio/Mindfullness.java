package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Mindfullness extends AppCompatActivity {
    VideoView video;
    ImageButton btndia, btnnoche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindfullness);
        btndia = findViewById(R.id.ibMindDia);
        btnnoche = findViewById(R.id.ibMindNoche);
        video = findViewById(R.id.mindvideo);

        btndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.minddia));
                video.start();
            }
        });
        btnnoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mindnoche));
                video.start();
            }
        });
    }
}