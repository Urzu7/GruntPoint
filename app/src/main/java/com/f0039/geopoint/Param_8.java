package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp8;
import static com.f0039.geopoint.Massive.stpr8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_8 extends AppCompatActivity {
    public Button buttpar8_1, buttpar8_2, buttpar8_3, buttpar8_4, buttpar8_5, buttpar8_6, buttpar8_7, buttpar8_8, buttpar8_9, buttpar8_10;
    public TextView Textpar8, textViewDone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param3);
        buttpar8_1 = findViewById(R.id.buttpar8_1);
        buttpar8_2 = findViewById(R.id.buttpar8_2);
        buttpar8_3 = findViewById(R.id.buttpar8_3);
        buttpar8_4 = findViewById(R.id.buttpar8_4);

        Textpar8 = findViewById(R.id.TextPar8); // тут по-идее ничего не должно работать

        buttpar8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp8 = stpr8[0];
                Intent gtmain = new Intent(Param_8.this, MainActivity.class);
                startActivity(gtmain);

            }
        });

        buttpar8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp8 = stpr8[1];
                Intent gtmain = new Intent(Param_8.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar8_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp8 = stpr8[2];
                Intent gtmain = new Intent(Param_8.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar8_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp8 = stpr8[3];
                Intent gtmain = new Intent(Param_8.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
    }
}