package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp5;
import static com.f0039.geopoint.Massive.stpr5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_5 extends AppCompatActivity {
    public Button buttpar5_1, buttpar5_2, buttpar5_3, buttpar5_4, buttpar5_5, buttpar5_6, buttpar5_7, buttpar5_8, buttpar5_9, buttpar5_10;
    public TextView TextPar5, textViewDone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param3);
        buttpar5_1 = findViewById(R.id.buttpar5_1);
        buttpar5_2 = findViewById(R.id.buttpar5_2);
        buttpar5_3 = findViewById(R.id.buttpar5_3);
        buttpar5_4 = findViewById(R.id.buttpar5_4);
        buttpar5_5 = findViewById(R.id.buttpar5_5);
        buttpar5_6 = findViewById(R.id.buttpar5_6);
        buttpar5_7 = findViewById(R.id.buttpar5_7);
        buttpar5_8 = findViewById(R.id.buttpar5_8);
        buttpar5_9 = findViewById(R.id.buttpar5_9);
        buttpar5_10 = findViewById(R.id.buttpar5_10);

        TextPar5 = findViewById(R.id.TextPar5); // тут по-идее ничего не должно работать

        buttpar5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[0];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);

            }
        });

        buttpar5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[1];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[2];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[3];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[4];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar5_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[5];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar5_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[6];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar5_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[7];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar5_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[8];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar5_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp5 = stpr5[9];
                Intent gtmain = new Intent(Param_5.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
    }
}
