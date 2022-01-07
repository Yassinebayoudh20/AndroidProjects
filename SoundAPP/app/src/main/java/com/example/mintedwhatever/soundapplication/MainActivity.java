package com.example.mintedwhatever.soundapplication;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private SoundPool nSoundPool;
    private int Soundc;
    private int Soundd;
    private int Sounde;
    private int Soundf;
    private int Soundg;
    private int Sounda;
    private int Soundb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nSoundPool = new SoundPool(7 , AudioManager.STREAM_MUSIC, 0);
        Soundc = nSoundPool.load(getApplicationContext(), R.raw.note1_c,1);
        Soundd = nSoundPool.load(getApplicationContext(), R.raw.note2_d,1);
        Sounde = nSoundPool.load(getApplicationContext(), R.raw.note3_e,1);
        Soundf = nSoundPool.load(getApplicationContext(), R.raw.note4_f,1);
        Soundg = nSoundPool.load(getApplicationContext(), R.raw.note5_g,1);
        Sounda = nSoundPool.load(getApplicationContext(), R.raw.note6_a,1);
        Soundb = nSoundPool.load(getApplicationContext(), R.raw.note7_b,1);



    }

    public void PlayC(View v ){

        Log.d("Hey","Clicked");
        nSoundPool.play(Soundc,1.0f,1.0f,0,0,1.0f);

    }
    public void PlayD(View v ){
        nSoundPool.play(Soundd,1.0f,1.0f,0,0,1.0f);

    }
    public void PlayE(View v ){
        nSoundPool.play(Sounde,1.0f,1.0f,0,0,1.0f);

    }
    public void PlayF(View v ){
        nSoundPool.play(Soundf,1.0f,1.0f,0,0,1.0f);

    }
    public void PlayG(View v ){
        nSoundPool.play(Soundg,1.0f,1.0f,0,0,1.0f);

    }
    public void PlayA(View v ){
        nSoundPool.play(Sounda,1.0f,1.0f,0,0,1.0f);

    }
    public void PlayB(View v ){
        nSoundPool.play(Soundb,1.0f,1.0f,0,0,1.0f);

    }


}
