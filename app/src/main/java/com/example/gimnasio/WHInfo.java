package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class WHInfo extends AppCompatActivity {
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whinfo);
        video = findViewById(R.id.vidInfo);

        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.wh1));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }
}