package com.example.learningkids200;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import org.w3c.dom.Text;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class time extends AppCompatActivity {
    private int duration= 5;
    private  boolean timeRunning = false;
    MediaPlayer mediaPlayer;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        final TextView td1 = findViewById(R.id.td1);
        final TextView td2 = findViewById(R.id.td2);
        final TextView td3 = findViewById(R.id.td3);
        final AppCompatButton start = findViewById(R.id.start);
       // MediaPlayer MediaPlayer = android.media.MediaPlayer.create(getApplicationContext(), R.raw.g);
       // MediaPlayer MediaPlayer = android.media.MediaPlayer.create(getApplicationContext(), R.raw.soundiphone);
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.sound1);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           if (!timeRunning){
                    timeRunning = true;
                    new CountDownTimer(duration * 1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    String time = String.format(Locale.getDefault(),"%02d:%02d:%02d", TimeUnit.MICROSECONDS.toHours(millisUntilFinished),
                                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)-
                                                    TimeUnit.HOURS.toMinutes(TimeUnit.MICROSECONDS.toHours(millisUntilFinished)),
                                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished)-
                                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)));

                                    final String[] hourMinSec = time.split(":");
                                    td1.setText(hourMinSec[0]);
                                    td2.setText(hourMinSec[1]);
                                    td3.setText(hourMinSec[2]);
                                }
                            });
                        }

                        @Override
                        public void onFinish() {
                            duration = 5;
                            timeRunning = false;
                            if (mediaPlayer != null)
                                mediaPlayer.start();
                        }
                    }.start();
                }
                else {
                    Toast.makeText(time.this,"Timer is alreday running",Toast.LENGTH_SHORT).show();
                }
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}