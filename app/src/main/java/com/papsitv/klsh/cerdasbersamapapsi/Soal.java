package com.papsitv.klsh.cerdasbersamapapsi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

/**
 * Created by KLSH on 4/3/2017.
 */

public class Soal extends Activity {
    Button btnSubmit;
    RadioGroup rgSoal1,rgSoal2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        rgSoal1 = (RadioGroup)findViewById(R.id.rgSoal1);
        rgSoal2 = (RadioGroup)findViewById(R.id.rgSoal2);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int jwb1,jwb2;

                jwb1=rgSoal1.getCheckedRadioButtonId();
                jwb2=rgSoal2.getCheckedRadioButtonId();

                Intent intentReview = new Intent(Soal.this, Review.class);

                if(jwb1==R.id.rb1A) {
                    intentReview.putExtra("1","Satu");
                }else if(jwb1==R.id.rb1B){
                    intentReview.putExtra("1","Tiga");
                }

                if(jwb2==R.id.rb2A) {
                    intentReview.putExtra("2","Gravitasi");
                }else if(jwb2==R.id.rb2B)
                    intentReview.putExtra("2","Imunisasi");

                startActivity(intentReview);
            }
        });
    }
}
