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

public class week extends AppCompatActivity {
    ImageView showweek;
    TextView tw1, tw2 , tw3,tz1,tz2,tz3;
    Button mo,sun,tus,wed,thurs,fri,sat;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        showweek = findViewById(R.id.showweek);
        tw1 = findViewById(R.id.tw1);
        tw2 = findViewById(R.id.tw2);
        tw3 = findViewById(R.id.tw3);
        tz1 = findViewById(R.id.tz1);
        tz2 = findViewById(R.id.tz2);
        tz3 = findViewById(R.id.tz3);
        mo = findViewById(R.id.mo);
        sun = findViewById(R.id.sun);
        tus = findViewById(R.id.tus);
        wed = findViewById(R.id.wed);
        thurs = findViewById(R.id.thurs);
        fri = findViewById(R.id.fri);
        sat = findViewById(R.id.sat);


        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showweek.setImageResource(R.drawable.monday);
                if (sun.isClickable()){
                    tz1.setText("คำศัพทร์");
                    tz2.setText("คำอ่าน");
                    tz3.setText("คำเเปล");
                    tw1.setText("Sunday");
                    tw2.setText("ซันเดย์");
                    tw3.setText("วันอาทิตย์");
                }
            }
        });

        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showweek.setImageResource(R.drawable.monday);
                if (mo.isClickable()){
                    tz1.setText("คำศัพทร์");
                    tz2.setText("คำอ่าน");
                    tz3.setText("คำเเปล");
                    tw1.setText("Monday");
                    tw2.setText("มันเดย์");
                    tw3.setText("วันจันทร์");
                }
            }
        });
        tus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showweek.setImageResource(R.drawable.monday);
                if (tus.isClickable()){
                    tz1.setText("คำศัพทร์");
                    tz2.setText("คำอ่าน");
                    tz3.setText("คำเเปล");
                    tw1.setText("Tuesday");
                    tw2.setText("ทิวส์เดย์");
                    tw3.setText("วันอังคาร");
                }
            }
        });
        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showweek.setImageResource(R.drawable.monday);
                if (wed.isClickable()){
                    tz1.setText("คำศัพทร์");
                    tz2.setText("คำอ่าน");
                    tz3.setText("คำเเปล");
                    tw1.setText("Wednesday");
                    tw2.setText("ทิวส์เดย์");
                    tw3.setText("วันอังคาร");
                }
            }
        });
        thurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showweek.setImageResource(R.drawable.monday);
                if (thurs.isClickable()){
                    tz1.setText("คำศัพทร์");
                    tz2.setText("คำอ่าน");
                    tz3.setText("คำเเปล");
                    tw1.setText("Thursday");
                    tw2.setText("เธิร์สเดย์");
                    tw3.setText("วันพฤหัสบดี");
                }
            }
        });
        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showweek.setImageResource(R.drawable.monday);
                if (fri.isClickable()){
                    tz1.setText("คำศัพทร์");
                    tz2.setText("คำอ่าน");
                    tz3.setText("คำเเปล");
                    tw1.setText("Friday");
                    tw2.setText("ฟรายเดย์");
                    tw3.setText("วันศุกร์");
                }
            }
        });
        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showweek.setImageResource(R.drawable.monday);
                if (sat.isClickable()){
                    tz1.setText("คำศัพทร์");
                    tz2.setText("คำอ่าน");
                    tz3.setText("คำเเปล");
                    tw1.setText("Saturday");
                    tw2.setText("แซทเธอเดย์");
                    tw3.setText("วันเสาร์");
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