package com.example.learningkids200;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class number extends AppCompatActivity {
    ImageView shownumber;
    TextView tm1,tm2,tm3,tm4;
    Button one,two,tree,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        shownumber= findViewById(R.id.shownumber);

        tm1 = findViewById(R.id.tm1);
        tm2 = findViewById(R.id.tm2);
        tm3 = findViewById(R.id.tm3);
        tm4 = findViewById(R.id.tm4);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        tree = findViewById(R.id.tree);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);
        eleven = findViewById(R.id.eleven);
        twelve = findViewById(R.id.twelve);
        thirteen = findViewById(R.id.thirteen);
        fourteen = findViewById(R.id.fourteen);
        fifteen = findViewById(R.id.fifteen);
        sixteen = findViewById(R.id.sixteen);
        seventeen = findViewById(R.id.seventeen);
        eighteen = findViewById(R.id.eighteen);
        nineteen = findViewById(R.id.nineteen);
        twenty = findViewById(R.id.twenty);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.oneshow);
                if (one.isClickable()){
                    tm1.setText("1");
                    tm2.setText("one");
                    tm3.setText("?????????");
                   // tm4.setText("???");

                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.twoshow);
                if (two.isClickable()){
                    tm1.setText("2");
                    tm2.setText("two");
                    tm3.setText("?????????");
                    //tm4.setText("???");

                }
            }
        });
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showthree);
                if (tree.isClickable()){
                    tm1.setText("3");
                    tm2.setText("tree");
                    tm3.setText("?????????");
                    //tm4.setText("???");

                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showfour);
                if (four.isClickable()){
                    tm1.setText("4");
                    tm2.setText("four");
                    tm3.setText("?????????");
                    //tm4.setText("???");

                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showfive);
                if (five.isClickable()){
                    tm1.setText("5");
                    tm2.setText("five");
                    tm3.setText("?????????");
                    //tm4.setText("???");

                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showsix);
                if (six.isClickable()){
                    tm1.setText("6");
                    tm2.setText("six");
                    tm3.setText("??????");
                    //tm4.setText("???");

                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showseven);
                if (seven.isClickable()){
                    tm1.setText("7");
                    tm2.setText("seven");
                    tm3.setText("????????????");
                    //tm4.setText("???");

                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showeight);
                if (eight.isClickable()){
                    tm1.setText("8");
                    tm2.setText("eight");
                    tm3.setText("????????????");
                    //tm4.setText("???");

                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.shownineteen);
                if (nine.isClickable()){
                    tm1.setText("9");
                    tm2.setText("nine");
                    tm3.setText("????????????");
                    //tm4.setText("???");

                }
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showten);
                if (ten.isClickable()){
                    tm1.setText("10");
                    tm2.setText("ten");
                    tm3.setText("?????????");
                    //tm4.setText("??????");

                }
            }
        });
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showeleven);
                if (eleven.isClickable()){
                    tm1.setText("11");
                    tm2.setText("eleven");
                    tm3.setText("?????????????????????");
                    //tm4.setText("??????");

                }
            }
        });
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showtwle);
                if (twelve.isClickable()){
                    tm1.setText("12");
                    tm2.setText("twelve");
                    tm3.setText("??????????????????");
                    //tm4.setText("??????");

                }
            }
        });
        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showtherteen);
                if (twelve.isClickable()){
                    tm1.setText("13");
                    tm2.setText("twelve");
                    tm3.setText("??????????????????");
                    //tm4.setText("??????");

                }
            }
        });
        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showfourteen);
                if (fourteen.isClickable()){
                    tm1.setText("14");
                    tm2.setText("fourteen");
                    tm3.setText("??????????????????");
                    //tm4.setText("??????");

                }
            }
        });
        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showfifteen);
                if (fifteen.isClickable()){
                    tm1.setText("15");
                    tm2.setText("fifteen");
                    tm3.setText("??????????????????");
                    //tm4.setText("??????;

                }
            }
        });
        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showsixteen);
                if (sixteen.isClickable()){
                    tm1.setText("16");
                    tm2.setText("sixteen");
                    tm3.setText("???????????????");
                    //tm4.setText("??????);

                }
            }
        });
        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showseventeen);
                if (seventeen.isClickable()){
                    tm1.setText("17");
                    tm2.setText("seventeen");
                    tm3.setText("?????????????????????");
                    //tm4.setText("??????);

                }
            }
        });
        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showeighttrrn);
                if (eighteen.isClickable()){
                    tm1.setText("18");
                    tm2.setText("eighteen");
                    tm3.setText("?????????????????????");
                    //tm4.setText("??????);

                }
            }
        });
        nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.shownineteen);
                if (nineteen.isClickable()){
                    tm1.setText("19");
                    tm2.setText("nineteen");
                    tm3.setText("?????????????????????");
                    //tm4.setText("??????);

                }
            }
        });
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownumber.setImageResource(R.drawable.showtwenty);
                if (twenty.isClickable()){
                    tm1.setText("20");
                    tm2.setText("twenty");
                    tm3.setText("??????????????????");
                    //tm4.setText("??????);

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