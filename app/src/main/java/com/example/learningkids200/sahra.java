package com.example.learningkids200;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class sahra extends AppCompatActivity {
    TextView tr1,tr2,tr3;
    Button aa,ar,eee,ee,eoi,errr,oui,oro,ara,aaa,arra,air,oooo,land,pencil,lar,maaar,earrr,ear,oeer,both,hit,cow,eat,b,fi,dark,rain,with,ruu,ruuu,ark,house,gog,ba;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahra);

        tr1 = findViewById(R.id.tr1);
        tr2 = findViewById(R.id.tr2);
        tr3 = findViewById(R.id.tr3);

        aa = findViewById(R.id.aa);
        ar = findViewById(R.id.ar);
        eee = findViewById(R.id.eee);
        ee = findViewById(R.id.ee);
        eoi = findViewById(R.id.eoi);
        errr = findViewById(R.id.errr);
        oui = findViewById(R.id.oui);
        oro = findViewById(R.id.oro);
        ara =findViewById(R.id.ara);
        aaa =findViewById(R.id.aaa);
        arra =findViewById(R.id.arra);
        air =findViewById(R.id.air);
        oooo =findViewById(R.id.oooo);
        land =findViewById(R.id.land);
        pencil =findViewById(R.id.pencil);
        lar =findViewById(R.id.lar);
        maaar =findViewById(R.id.maaar);
        earrr =findViewById(R.id.earrr);
        ear =findViewById(R.id.ear);
        oeer =findViewById(R.id.oeer);
        both =findViewById(R.id.both);
        hit =findViewById(R.id.hit);
        cow =findViewById(R.id.cow);
        eat =findViewById(R.id.eat);
        b = findViewById(R.id.b);
        fi =findViewById(R.id.fi);
        dark =findViewById(R.id.dark);
        rain =findViewById(R.id.rain);
        with =findViewById(R.id.with);
        ruu =findViewById(R.id.ruu);
        ruuu =findViewById(R.id.ruuu);
        ark =findViewById(R.id.ark);
        house =findViewById(R.id.house);
        gog =findViewById(R.id.gog);
        ba =findViewById(R.id.ba);


        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aa.isClickable()){
                    tr1.setText("-ะ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ar.isClickable()){
                    tr1.setText("-า");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eee.isClickable()){
                    tr1.setText(" -ิ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ee.isClickable()){
                    tr1.setText(" -ี");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        eoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eoi.isClickable()){
                    tr1.setText(" -ึ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        errr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (errr.isClickable()){
                    tr1.setText(" -ื");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        oui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oui.isClickable()){
                    tr1.setText(" -ุ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        oro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oro.isClickable()){
                    tr1.setText(" -ู");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ara.isClickable()){
                    tr1.setText(" เ-ะ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        aaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aaa.isClickable()){
                    tr1.setText(" เ-");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        arra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arra.isClickable()){
                    tr1.setText(" เเ-ะ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (air.isClickable()){
                    tr1.setText(" เเ-");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        oooo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oooo.isClickable()){
                    tr1.setText(" โ-");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (land.isClickable()){
                    tr1.setText(" เ-าะ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pencil.isClickable()){
                    tr1.setText(" -อ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        lar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lar.isClickable()){
                    tr1.setText(" เ-อะ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        maaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (maaar.isClickable()){
                    tr1.setText(" เ-อ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        earrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (earrr.isClickable()){
                    tr1.setText(" เ -ียะ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ear.isClickable()){
                    tr1.setText(" เ -ีย");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        oeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oeer.isClickable()){
                    tr1.setText(" เ -ือะ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        both.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (both.isClickable()){
                    tr1.setText(" เ -ือ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hit.isClickable()){
                    tr1.setText(" -ัวะ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cow.isClickable()){
                    tr1.setText(" -ัว");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eat.isClickable()){
                    tr1.setText(" -ำ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b.isClickable()){
                    tr1.setText(" ใ-");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fi.isClickable()){
                    tr1.setText(" ไ-");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dark.isClickable()){
                    tr1.setText(" เ-า");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rain.isClickable()){
                    tr1.setText(" ฤ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        with.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (with.isClickable()){
                    tr1.setText(" ฤา");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        ruu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ruu.isClickable()){
                    tr1.setText(" ฦ");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        ruuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ruuu.isClickable()){
                    tr1.setText(" ฦา");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        ark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ark.isClickable()){
                    tr1.setText("  ่");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (house.isClickable()){
                    tr1.setText("  ้");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        gog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gog.isClickable()){
                    tr1.setText("  ๊");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
                }
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ba.isClickable()){
                    tr1.setText("  ๋");
                    //tr2.setText("สระอะ");
                    //tr3.setText("อะ");
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