package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Kundalini extends AppCompatActivity {
    VideoView video;
    ImageButton btnkundalini1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kundalini);
        btnkundalini1 = findViewById(R.id.ibKundalini1);
        video = findViewById(R.id.kunvideo);
        btnkundalini1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kundalini1));
                video.start();
            }
        });
    }
}