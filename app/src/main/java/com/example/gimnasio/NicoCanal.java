package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NicoCanal extends AppCompatActivity {
    WebView wv1;
    String URL ="https://www.youtube.com/c/NicoGrupe";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nico_canal);
        wv1 = findViewById(R.id.WebNico);

        String URL = getIntent().getStringExtra("SitioWeb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://"+ URL);


    }
}