package com.example.cocostream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.VideoView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

    EditText etYoutube;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etYoutube = findViewById(R.id.editTextLinkYoutube);
        etYoutube.setText("https://www.youtube.com/watch?v=s37IMt_Ec-o");
    }

    public void onClickAceptar(View v) {
        EditText etYoutube = findViewById(R.id.editTextLinkYoutube);
        EditText etTwitch = findViewById(R.id.editTextCanalTwitch);
        String videoYoutube = etYoutube.getText().toString();
        String canalTwitch = etTwitch.getText().toString();

        Intent i = new Intent(this, RegularWindow.class);
        i.putExtra("videoYoutube", videoYoutube);
        i.putExtra("canalTwitch", canalTwitch);
        startActivity(i);
    }
}