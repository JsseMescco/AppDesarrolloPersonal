package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class RespiracionWH extends AppCompatActivity {
    VideoView video;
    ImageButton btnretener,btnrespiracionguiada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respiracion_wh);

        btnrespiracionguiada = findViewById(R.id.ibRespiracionguiada);
        btnretener = findViewById(R.id.ibRetener);
        video = findViewById(R.id.respiracionvideo);

        btnrespiracionguiada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.respiracionguiada));
                video.start();
            }
        });
        btnretener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.wh1));
                video.start();
            }
        });
    }
}