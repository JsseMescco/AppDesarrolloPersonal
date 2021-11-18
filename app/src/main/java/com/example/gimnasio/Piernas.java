package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Piernas extends AppCompatActivity {
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piernas);
        video = findViewById(R.id.videoView);
    }

    public void VideoForwardLounges(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.forwardlunges));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }

    public void VideoJumpingJacks(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.jumpingjacks));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }

    public void VideoHighKnees(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.highknees));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }

    public void VideoWallSits(View view) {
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.wallsits));
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        video.start();
    }
}