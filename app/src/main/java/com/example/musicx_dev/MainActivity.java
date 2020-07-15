package com.example.musicx_dev;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    public void play(View view){
        player.start();
    }
    public void stop(View view){
        player.stop();
    }
    public void pause(View view){
        player.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaController mediaController = new MediaController(this);

        player = MediaPlayer.create(this, R.raw.aisha);

       
    }
}
