package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp6;
import static com.f0039.geopoint.Massive.stpr6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_6 extends AppCompatActivity {
    public Button buttpar6_1, buttpar6_2, buttpar6_3, buttpar6_4, buttpar6_5, buttpar6_6, buttpar6_7, buttpar6_8, buttpar6_9, buttpar6_10;
    public TextView TextPar6, textViewDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param3);
        buttpar6_1 = findViewById(R.id.buttpar6_1);
        buttpar6_2 = findViewById(R.id.buttpar6_2);
        buttpar6_3 = findViewById(R.id.buttpar6_3);
        buttpar6_4 = findViewById(R.id.buttpar6_4);
        buttpar6_5 = findViewById(R.id.buttpar6_5);

        TextPar6 = findViewById(R.id.TextPar6); // тут по-идее ничего не должно работать

        buttpar6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp6 = stpr6[0];
                Intent gtmain = new Intent(Param_6.this, MainActivity.class);
                startActivity(gtmain);

            }
        });

        buttpar6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp6 = stpr6[1];
                Intent gtmain = new Intent(Param_6.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar6_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp6 = stpr6[2];
                Intent gtmain = new Intent(Param_6.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar6_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp6 = stpr6[3];
                Intent gtmain = new Intent(Param_6.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar6_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp6 = stpr6[4];
                Intent gtmain = new Intent(Param_6.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
    }
