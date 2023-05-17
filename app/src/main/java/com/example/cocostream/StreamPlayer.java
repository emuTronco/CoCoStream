package com.example.cocostream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

public class StreamPlayer extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streamplayer);

        String videoYoutube = getIntent().getStringExtra("videoYoutube");
        String canalTwitch = getIntent().getStringExtra("canalTwitch");
        String url_iframe = "https://cocostream-twitch-server.netlify.app/other5.html?channelTW=" + canalTwitch + "&channelYT=" + videoYoutube;


        webview = findViewById(R.id.webview);
        webview.clearCache(false);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return (event.getAction() == MotionEvent.ACTION_MOVE);
            }
        });
        String finalCanalTwitch = url_iframe;
        webview.loadUrl(finalCanalTwitch);

        webview.requestFocus();
        webview.setKeepScreenOn(true);

    }

}