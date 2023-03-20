package com.example.cocostream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.VideoView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class RegularWindow extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_window);

        String videoYoutube = getIntent().getStringExtra("videoYoutube");
        String canalTwitch = getIntent().getStringExtra("canalTwitch");
        videoYoutube = videoYoutube.substring(32);
        canalTwitch = "https://cocostream-twitch-server.netlify.app/other.html?channel=" + canalTwitch;
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        String finalVideoYoutube = videoYoutube;
        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = finalVideoYoutube;
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        webview = (WebView) findViewById(R.id.webview);
        webview.clearCache(false);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(canalTwitch);
    }

}