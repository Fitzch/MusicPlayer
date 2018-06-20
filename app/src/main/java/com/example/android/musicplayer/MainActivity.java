package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the audio file

        final MediaPlayer dragonborn = MediaPlayer.create(this, R.raw.dragonborn);

        // Find the play button
        Button play = (Button) findViewById(R.id.play_button);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on
            @Override
            public void onClick(View view) {
                dragonborn.start();
            }
        });

        // Find the pause button
        Button pause = (Button) findViewById(R.id.pause_button);

        // Set a click listener on that View

        pause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pause button is clicked on
            @Override
            public void onClick(View view) {
                dragonborn.pause();
            }
        });

        // Find the stop button
        Button stop = (Button) findViewById(R.id.stop_button);

        // Set a click listener on that View

        stop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the stop button is clicked ocn
            @Override
            public void onClick(View view) {
                dragonborn.stop();
                dragonborn.prepareAsync();
            }
        });

        // Find the forward button
        Button forward = (Button) findViewById(R.id.forward_button);

        // Set a click listener on that View

        forward.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the forward button is clicked on
            @Override
            public void onClick(View view) {
                dragonborn.seekTo(dragonborn.getCurrentPosition()+ 10000);
            }
        });

        // Find the back button
        Button back = (Button) findViewById(R.id.back_button);

        // Set a click listener on that View

        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on
            @Override
            public void onClick(View view) {
                dragonborn.seekTo(dragonborn.getCurrentPosition() - 10000);
            }
        });


    }
}
