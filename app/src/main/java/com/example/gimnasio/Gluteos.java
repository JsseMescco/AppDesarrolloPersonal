package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Gluteos extends AppCompatActivity {
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gluteos);
        video = findViewById(R.id.videoView);
    }

    public void Videooscilaciones(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.oscilacioneslaterales));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }

    public void Videopulselunges(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pulselunges));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }

    public void VideoStepUps(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.stepups));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }

    public void VideoSingleLeg(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.singlelegbridge));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }

    public void VideoSquat(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.squat));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }
}