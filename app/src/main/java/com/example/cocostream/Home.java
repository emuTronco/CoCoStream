package com.example.cocostream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    EditText etYoutube;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        etYoutube = findViewById(R.id.editTextLinkYoutube);
//        etYoutube.setText("https://www.youtube.com/watch?v=s37IMt_Ec-o");
    }

    public void onClickAceptar(View v) {
//        EditText etYoutube = findViewById(R.id.editTextLinkYoutube);
//        EditText etTwitch = findViewById(R.id.editTextCanalTwitch);
//        String videoYoutube = etYoutube.getText().toString();
//        String canalTwitch = etTwitch.getText().toString();
//
//        Intent i = new Intent(this, StreamPlayer.class);
//        i.putExtra("videoYoutube", videoYoutube);
//        i.putExtra("canalTwitch", canalTwitch);
//        startActivity(i);
    }
}