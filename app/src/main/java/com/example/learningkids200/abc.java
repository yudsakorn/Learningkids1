package com.example.learningkids200;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class abc extends AppCompatActivity {
    TextView ta1,ta2,ta3,ta4,ta5,ta6,ta7;
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    ImageView showim;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);

        ta1 = findViewById(R.id.ta1);
        ta2 = findViewById(R.id.ta2);
        ta3 = findViewById(R.id.ta3);
        ta4 = findViewById(R.id.ta4);
        ta5 = findViewById(R.id.ta5);
        ta6 = findViewById(R.id.ta6);
        ta7 = findViewById(R.id.ta7);

        a = findViewById(R.id.a);
        b= findViewById(R.id.b);
        c= findViewById(R.id.c);
        d= findViewById(R.id.d);
        e= findViewById(R.id.e);
        f= findViewById(R.id.f);
        g= findViewById(R.id.g);
        h= findViewById(R.id.h);
        i= findViewById(R.id.i);
        j= findViewById(R.id.j);
        k= findViewById(R.id.k);
        l= findViewById(R.id.l);
        m= findViewById(R.id.m);
        n= findViewById(R.id.n);
        o= findViewById(R.id.o);
        p= findViewById(R.id.p);
        q= findViewById(R.id.q);
        r= findViewById(R.id.r);
        s= findViewById(R.id.s);
        t= findViewById(R.id.t);
        u= findViewById(R.id.u);
        v= findViewById(R.id.v);
        w= findViewById(R.id.w);
        x= findViewById(R.id.x);
        y= findViewById(R.id.y);
        z= findViewById(R.id.z);

        showim = findViewById(R.id.showim);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.apple);
                if (a.isClickable()){
                    ta7.setText("Aa");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Apple");
                    ta5.setText("เเอพเพิล");
                    ta6.setText("เเอปเปิ้ล");
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.banana);
                if (b.isClickable()){
                    ta7.setText("Bb");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Banana");
                    ta5.setText("บะเเเนนอะ");
                    ta6.setText("กล้วย");
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.cat);
                if (c.isClickable()){
                    ta7.setText("Cc");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Cat");
                    ta5.setText("เเค็ท");
                    ta6.setText("เเมว");
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.dog);
                if (d.isClickable()){
                    ta7.setText("Dd");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Dog");
                    ta5.setText("ด้อก");
                    ta6.setText("สนัข");
                }
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.ee);
                if (e.isClickable()){
                    ta7.setText("Ee");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Elephant");
                    ta5.setText("เอลอิแฟ็นท");
                    ta6.setText("ช้าง");
                }
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.fox);
                if (f.isClickable()){
                    ta7.setText("Ff");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Fox");
                    ta5.setText("ฟ็อคซ");
                    ta6.setText("หมาจิ้งจอก");
                }
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.gg);
                if (g.isClickable()){
                    ta7.setText("Gg");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Giraffe");
                    ta5.setText("จิราฟ");
                    ta6.setText("ยีราฟ");
                }
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.hose);
                if (h.isClickable()){
                    ta7.setText("Hh");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("horse");
                    ta5.setText("ฮอซ");
                    ta6.setText("ม้า");
                }
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.ice);
                if (i.isClickable()){
                    ta7.setText("Ii");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Ice cream");
                    ta5.setText("ไอศครีม");
                    ta6.setText("ไอศครีม");
                }
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.jug);
                if (j.isClickable()){
                    ta7.setText("Jj");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("jug");
                    ta5.setText("จัก");
                    ta6.setText("เหยือกน้ำ");
                }
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.king);
                if (k.isClickable()){
                    ta7.setText("Kk");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("King");
                    ta5.setText("คิง");
                    ta6.setText("ราชา");
                }
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.lion);
                if (l.isClickable()){
                    ta7.setText("Ll");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Lion");
                    ta5.setText("ไลอัน");
                    ta6.setText("สิงโต");
                }
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.mokey);
                if (m.isClickable()){
                    ta7.setText("Mm");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Monkey");
                    ta5.setText("มังคิ");
                    ta6.setText("ลิง");
                }
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.notebook);
                if (n.isClickable()){
                    ta7.setText("Nn");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Notebook");
                    ta5.setText("โน๊ตบุ้ค");
                    ta6.setText("สมุด");
                }
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.ox);
                if (n.isClickable()){
                    ta7.setText("Oo");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Ox");
                    ta5.setText("อ็อคซ");
                    ta6.setText("วัว");
                }
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.pen);
                if (p.isClickable()){
                    ta7.setText("Pp");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Pen");
                    ta5.setText("เพ็น");
                    ta6.setText("ปากกา");
                }
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.qeen);
                if (q.isClickable()){
                    ta7.setText("Qq");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Qeen");
                    ta5.setText("ควีน");
                    ta6.setText("ราชนี");
                }
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.rapbit);
                if (r.isClickable()){
                    ta7.setText("Rr");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Rabbit");
                    ta5.setText("แรบบิท");
                    ta6.setText("กระต่าย");
                }
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.snack);
                if (s.isClickable()){
                    ta7.setText("Ss");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Snake");
                    ta5.setText("ซเนค");
                    ta6.setText("งู");
                }
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.tiger);
                if (t.isClickable()){
                    ta7.setText("Tt");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Tiger");
                    ta5.setText("ไทเกอะ");
                    ta6.setText("เสือ");
                }
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.um);
                if (u.isClickable()){
                    ta7.setText("Uu");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Umbrella");
                    ta5.setText("อัมบเรลละ");
                    ta6.setText("ร่ม");
                }
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.van);
                if (v.isClickable()){
                    ta7.setText("Vv");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Van");
                    ta5.setText("เเวน");
                    ta6.setText("รถตู้");
                }
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.women);
                if (w.isClickable()){
                    ta7.setText("Ww");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("women");
                    ta5.setText("วีมเมน");
                    ta6.setText("ผู้หญิง");
                }
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.xmas);
                if (x.isClickable()){
                    ta7.setText("Xx");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Xmas");
                    ta5.setText("เอ็กมัส");
                    ta6.setText("คริสต์มาส");
                }
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.yot);
                if (y.isClickable()){
                    ta7.setText("Yy");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("yacht");
                    ta5.setText("ย็อท");
                    ta6.setText("เรือยอท");
                }
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showim.setImageResource(R.drawable.zebra);
                if (z.isClickable()){
                    ta7.setText("Zz");
                    ta1.setText("คำศัพทร์");
                    ta2.setText("คำอ่าน");
                    ta3.setText("เเปล");
                    ta4.setText("Zebra");
                    ta5.setText("สีบระ");
                    ta6.setText("ม้าลาย");
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