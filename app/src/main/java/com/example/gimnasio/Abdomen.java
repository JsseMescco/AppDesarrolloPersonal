package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Abdomen extends AppCompatActivity {
    VideoView video;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdomen);
        video = findViewById(R.id.videoView);


    }

    public void VideoPlank(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.plank));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }
    public void VideoSidePlank(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sideplank));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();

    }
}