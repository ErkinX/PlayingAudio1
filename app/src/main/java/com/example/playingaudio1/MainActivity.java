package com.example.playingaudio1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.playButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  if (mediaPlayer.isPlaying()) {
                      pause();
                  } else {
                      play();
                  }
            }
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.stuff);

    }

    public void play() {
        mediaPlayer.start();
        button.setText("Pause");
    }

    public void pause() {
        mediaPlayer.pause();
        button.setText("Play");
    }
}
