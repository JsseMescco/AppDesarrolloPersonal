package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

public class CanalYoutube extends AppCompatActivity {
    VideoView video;
    TextView tvinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canal_youtube);
        tvinfo = findViewById(R.id.tvnicoinfo);
        video = findViewById(R.id.videoNico);

        tvinfo.setText("Nico Grupe : \n"+
                "Nacido en Argentina \n"
        +"Ingeniero de SIstemas");
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nicoinfo));
        video.start();
    }
}