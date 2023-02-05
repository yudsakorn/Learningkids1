package com.example.learningkids200;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

public class readclock extends AppCompatActivity {
    VideoView man;
    Button start,stop;
    SeekBar time;
    TextView tt;
    CountDownTimer countDownTimer;
    Boolean counterIsActive = false;
    MediaPlayer mediaPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readclock);

        man = (VideoView) findViewById(R.id.man);
        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);
        time = findViewById(R.id.time);
        tt = findViewById(R.id.tt);
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.ant);
        time.setMax(300);
        time.setProgress(30);
        time.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                update(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        String URIpath1 = "android.resource://"+ getPackageName() + "/" + R.raw.mana;
        Uri uri1 = Uri.parse(URIpath1);
        man.setVideoURI(uri1);
        man.requestFocus();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                man.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                man.pause();
            }
        });

    }

    private void update(int progress) {
        int minutes = progress / 60;
        int seconds = progress % 60;
        String secondsFinal = "";
        if (seconds <= 9){
            secondsFinal = "0" + seconds;
        }else {
            secondsFinal= "" + seconds;
        }
        time.setProgress(progress);
        tt.setText("" +minutes+ ":" + secondsFinal);
    }

    public void start_timer(View view) {
        if (counterIsActive == false){
            counterIsActive = true;
            time.setEnabled(false);
            start.setText("หยุด");
            CountDownTimer CountDownTimer = new CountDownTimer(time.getProgress() * 1000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    update((int) millisUntilFinished / 1000);
                }

                @Override
                public void onFinish() {
                    reset();
                    if (mediaPlayer != null) ;
                    mediaPlayer.start();
                }
            }.start();
        }else {
            reset();
        }
    }

    private void reset() {
        tt.setText("0.30");
        time.setProgress(30);
        countDownTimer.cancel();
        start.setText("เริ่ม");
        start.setEnabled(true);
        counterIsActive = false;
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (counterIsActive){
            countDownTimer.cancel();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (counterIsActive){
            countDownTimer.cancel();
        }
    }
}