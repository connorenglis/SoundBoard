package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    private Button btnFire;
    private Button btnTone;
    private Button btnHarp;
    private Button btnLaugh;
    private Button btnMonkeyLaugh;
    private Button btnDroneSound;
    private Button btnCricketChirp;
    private Button btnDogBarking;
    private Button btnFastCar;
    private Button btnTapeRewind;
    private Button btnGameShow;
    private Button btnTerrorTransition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFire = findViewById(R.id.btn_fire);
        btnTone = findViewById(R.id.btn_tone);
        btnLaugh = findViewById(R.id.btn_tone);
        btnMonkeyLaugh = findViewById(R.id.btn_monkeylaugh);
        btnDroneSound = findViewById(R.id.btn_crepydrone);
        btnCricketChirp = findViewById(R.id.btn_cricketchrip);
        btnDogBarking = findViewById(R.id.btn_dog);
        btnFastCar = findViewById(R.id.btn_Car);
        btnTapeRewind = findViewById(R.id.btn_rewind);
        btnGameShow = findViewById(R.id.btn_laugh);
        btnTerrorTransition = findViewById(R.id.btn_terror);


        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playFire();
            }
        });


    }

    private void playFire(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connorsoundboard_fire);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playTone(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connorsoundboard_tone);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
}