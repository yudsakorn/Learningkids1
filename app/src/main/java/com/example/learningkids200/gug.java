package com.example.learningkids200;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class gug extends AppCompatActivity {
    ImageView show2;
    TextView ta,tb1,tc,td;
    Button kai,kui,koad,kuy,kon,kug,snack,jan,ching,cheng,so,cher,she,dorshada,torpatak,tortan, tornabunto,torputao,nornan,dordak,tao,tortouk,tortahan,tortong,nornu,borbaimai,porpa,bee,forfa,porpan,forfun,prosompao,morma,yoyak,ror,rorlink,worvan,sorsara,sorrese,sorseo,haheb,lorla,oroank,honukhuk;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gug);

        ta = findViewById(R.id.t1);
        tb1 =findViewById(R.id.t3);
        tc =findViewById(R.id.t12);
        td=findViewById(R.id.t2);
        show2 = findViewById(R.id.showimage);
        kai = findViewById(R.id.a);
        kui =findViewById(R.id.kui);
        koad=findViewById(R.id.koad);
        kuy= findViewById(R.id.kuy);
        kon=findViewById(R.id.kon);
        kug=findViewById(R.id.kug);
        snack=findViewById(R.id.snack);
        jan=findViewById(R.id.jan);
        ching=findViewById(R.id.ching);
        cheng=findViewById(R.id.cheng);
        so =findViewById(R.id.so);
        cher=findViewById(R.id.cher);
        she =findViewById(R.id.she);
        dorshada =findViewById(R.id.dorshada);
        torpatak =findViewById(R.id.torpatak);
        tortan =findViewById(R.id.tortan);
        tornabunto =findViewById(R.id.tornabunto);
        torputao =findViewById(R.id.torputao);
        nornan =findViewById(R.id.nornan);
        dordak =findViewById(R.id.dordak);
        tao =findViewById(R.id.tao);
        tortouk =findViewById(R.id.tortouk);
        tortahan =findViewById(R.id.tortahan);
        tortong =findViewById(R.id.tortong);
        nornu =findViewById(R.id.nornu);
        borbaimai =findViewById(R.id.borbaimai);
        porpa =findViewById(R.id.porpa);
        bee =findViewById(R.id.bee);
        forfa =findViewById(R.id.forfa);
        porpan =findViewById(R.id.porpan);
        forfun =findViewById(R.id.forfun);
        prosompao =findViewById(R.id.prosompao);
        morma =findViewById(R.id.morma);
        yoyak =findViewById(R.id.yoyak);
        ror =findViewById(R.id.ror);
        rorlink =findViewById(R.id.rorlink);
        worvan =findViewById(R.id.worvan);
        sorsara =findViewById(R.id.sorsara);
        sorrese =findViewById(R.id.sorrese);
        sorseo =findViewById(R.id.sorseo);
        haheb =findViewById(R.id.haheb);
        lorla=findViewById(R.id.lorla);
        oroank =findViewById(R.id.oroank);
        honukhuk =findViewById(R.id.honukhuk);



        kai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.kai100);
                if (kai.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("kor-kai");
                    td.setText("???");
                }
            }
        });
        kui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.khai);
                if (kui.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("kor-kai");
                    td.setText("???");
                }
            }
        });
        koad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.khuat);
                if (kui.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("kar-kuuat");
                    td.setText("???");
                }
            }
        });
        kuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.khwai);
                if (kui.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("kor-kwaai");
                    td.setText("???");
                }
            }
        });
        kon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.khon);
                if (kon.isClickable()){
                    tb1.setText("???.??????");
                    tc.setText("kor-kon");
                    td.setText("???");
                }
            }
        });
        kug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.rakhang);
                if (kug.isClickable()){
                    tb1.setText("???.???????????????");
                    tc.setText("kor-ra-kang");
                    td.setText("???");
                }
            }
        });
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.ngu);
                if (snack.isClickable()){
                    tb1.setText("???.??????");
                    tc.setText("ngor-ngoo");
                    td.setText("???");
                }
            }
        });
        jan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.chan);
                if (jan.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("jor-jaan");
                    td.setText("???");
                }
            }
        });
        ching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.ching1);
                if (ching.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("chor-ch??ng");
                    td.setText("???");
                }
            }
        });
        cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.chang);
                if (cheng.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("chor-chaang");
                    td.setText("???");
                }
            }
        });
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.so111);
                if (so.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("sor-soh");
                    td.setText("???");
                }
            }
        });
        cher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.choe);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("chor-cher");
                    td.setText("???");
                }
            }
        });
        she.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.yor_ying1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("yor-ying");
                    td.setText("???");
                }
            }
        });
        dorshada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.dor_cha_daa1);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("dor-cha-daa");
                    td.setText("???");
                }
            }
        });
        torpatak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.dtor_bpa_dtak1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("dtor-bpa-dtak");
                    td.setText("???");
                }
            }
        });
        tortan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.tar_taan1);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("tar-taan");
                    td.setText("???");
                }
            }
        });
        tornabunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.tor_mon_toh1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("tor-mon-toh");
                    td.setText("???");
                }
            }
        });
        torputao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.tor_poo_tao1);
                if (cher.isClickable()){
                    tb1.setText("???.?????????????????????");
                    tc.setText("tor-poo-tao");
                    td.setText("???");
                }
            }
        });
        nornan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.nor_nen12);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("nor-nen");
                    td.setText("???");
                }
            }
        });
        dordak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.dor_dek1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("dor-dek");
                    td.setText("???");
                }
            }
        });
        tao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.dtor_dtao1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("dtor-dtao");
                    td.setText("???");
                }
            }
        });
        tortouk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.tor_tung1234);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("tor-tung");
                    td.setText("???");
                }
            }
        });
        tortahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.tor_ta_haan1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("tor-ta-haan");
                    td.setText("???");
                }
            }
        });
        tortong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.tor_tong1);
                if (cher.isClickable()){
                    tb1.setText("???.??????");
                    tc.setText("tor-tong");
                    td.setText("???");
                }
            }
        });
        nornu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.nor_noo1);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("nor-noo");
                    td.setText("???");
                }
            }
        });
        borbaimai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.bor_bai_mai);
                if (cher.isClickable()){
                    tb1.setText("???.???????????????");
                    tc.setText("bor-bai-mai");
                    td.setText("???");
                }
            }
        });
        porpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.bpor_bplaa);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("bpor-bplaa");
                    td.setText("???");
                }
            }
        });
        bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.por_peung1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("por-peung");
                    td.setText("???");
                }
            }
        });
        forfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.for_faa);
                if (cher.isClickable()){
                    tb1.setText("???.??????");
                    tc.setText("for-faa");
                    td.setText("???");
                }
            }
        });
        porpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.por_paan1);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("por-paan");
                    td.setText("???");
                }
            }
        });
        forfun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.for_fan);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("for-fan");
                    td.setText("???");
                }
            }
        });
        prosompao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.por_sam_pao1);
                if (cher.isClickable()){
                    tb1.setText("???.???????????????");
                    tc.setText("por-sam-pao");
                    td.setText("???");
                }
            }
        });
        morma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.mor_maa1);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("por-sam-pao");
                    td.setText("???");
                }
            }
        });
        yoyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.yor_yak);
                if (cher.isClickable()){
                    tb1.setText("???.???????????????");
                    tc.setText("yor-yak");
                    td.setText("???");
                }
            }
        });
        ror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.ror_reuua1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("ror-reuua");
                    td.setText("???");
                }
            }
        });
        rorlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.lor_ling1);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("lor-ling");
                    td.setText("???");
                }
            }
        });
        worvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.wor_huan1);
                if (cher.isClickable()){
                    tb1.setText("???.???????????????");
                    tc.setText("wor-huan");
                    td.setText("???");
                }
            }
        });
        sorsara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.sor_saa_laa1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("sor-saa-laa");
                    td.setText("???");
                }
            }
        });
        sorrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.sor_reu_see1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("sor-reu-see");
                    td.setText("???");
                }
            }
        });
        sorseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.sor_seuua12);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("sor-seuua");
                    td.setText("???");
                }
            }
        });
        haheb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.hor_heep);
                if (cher.isClickable()){
                    tb1.setText("???.?????????");
                    tc.setText("hor_heep");
                    td.setText("???");
                }
            }
        });
        lorla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.ror_ju_laa1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("ror-ju-laa");
                    td.setText("???");
                }
            }
        });
        oroank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.or_aang1);
                if (cher.isClickable()){
                    tb1.setText("???.????????????");
                    tc.setText("or_aang");
                    td.setText("???");
                }
            }
        });
        honukhuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setImageResource(R.drawable.hor_nok_hook);
                if (cher.isClickable()){
                    tb1.setText("???.???????????????");
                    tc.setText("hor-nok-hook");
                    td.setText("???");
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