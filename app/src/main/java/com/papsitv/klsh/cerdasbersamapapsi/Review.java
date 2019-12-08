package com.papsitv.klsh.cerdasbersamapapsi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by KLSH on 4/3/2017.
 */

public class Review extends Activity {
    TextView txtReviewJawaban;
    String jawaban="";
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);

        txtReviewJawaban = (TextView)findViewById(R.id.txtReviewjawaban);

        //ambil pesannya -> extra
        Bundle pesan=getIntent().getExtras();

        if(pesan.getString("1").equalsIgnoreCase("Tiga")) {
            score=score+10;
            jawaban=jawaban+"1. "+pesan.getString("1")+" - Benar"+"\n";
        }else{
            score=score-5;
            jawaban=jawaban+"1. "+pesan.getString("1")+" - Salah"+"\n";
        }

        if(pesan.getString("2").equalsIgnoreCase("Gravitasi")) {
            score=score+10;
            jawaban=jawaban+"2. "+pesan.getString("2")+" - Benar"+"\n";
        }else{
            score=score-5;
            jawaban=jawaban+"2. "+pesan.getString("2")+" - Salah"+"\n";
        }

        txtReviewJawaban.setText(jawaban+"\n\n"+"Score Anda : "+score);
    }
}
