package com.example.learningkids200;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class month extends AppCompatActivity {
    ImageView showmo;
    Button jan;
    TextView ts1,ts2,ts3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        showmo = findViewById(R.id.showmo);
        jan = findViewById(R.id.jan);

        ts1 = findViewById(R.id.ts1);
        ts2 = findViewById(R.id.ts2);
        ts3 = findViewById(R.id.ts3);

        jan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showmo.setImageResource(R.drawable.yot);
                if (jan.isClickable()){
                    ts1.setText("january");
                    ts2.setText("เจนยูอารี่");
                    ts3.setText("มกราคม");
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