package com.example.learningkids200;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class group extends AppCompatActivity {
    Button kurkai,az,sara,number,week,month,eg,thai,gamenumber,back,readclock;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        kurkai = findViewById(R.id.kurkai);
        az = findViewById(R.id.az);
        sara = findViewById(R.id.sara);
        number = findViewById(R.id.number);
        week = findViewById(R.id.week);
        month = findViewById(R.id.month);
        eg = findViewById(R.id.eg);
        thai = findViewById(R.id.thai);
        gamenumber =findViewById(R.id.gamenum);

        readclock =findViewById(R.id.readclock);



        kurkai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(group.this,gug.class);
                startActivity(intent);

            }
        });
        az.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(group.this,abc.class);
                startActivity(intent);
            }
        });
        sara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(group.this,sahra.class);
                startActivity(intent);
            }
        });
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(group.this,number.class);
                startActivity(intent);
            }
        });
        week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(group.this,week.class);
                startActivity(intent);
            }
        });
        month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(group.this,month.class);
                startActivity(intent);
            }
        });
        eg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(group.this,eg.class);
                startActivity(intent);
            }
        });
        thai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(group.this,thai.class);
                startActivity(intent);
            }
        });
        gamenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(group.this,gamenum.class);
                startActivity(intent);
            }
        });
        readclock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(group.this,time.class);
                startActivity(intent);
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