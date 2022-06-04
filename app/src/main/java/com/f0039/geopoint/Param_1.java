package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp1;
import static com.f0039.geopoint.Massive.stpr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_1 extends AppCompatActivity {

    public Button buttpar1_1, buttpar1_2, buttpar1_3, buttpar1_4,  buttpar1_5,  buttpar1_6,  buttpar1_7,  buttpar1_8;
    public TextView TextPar1, textViewDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param1);
        buttpar1_1 = findViewById(R.id.buttpar1_1);
        buttpar1_2 = findViewById(R.id.buttpar1_2);
        buttpar1_3 = findViewById(R.id.buttpar1_3);
        buttpar1_4 = findViewById(R.id.buttpar1_4);
        buttpar1_5 = findViewById(R.id.buttpar1_5);
        buttpar1_6 = findViewById(R.id.buttpar1_6);
        buttpar1_7 = findViewById(R.id.buttpar1_7);
        buttpar1_8 = findViewById(R.id.buttpar1_8);

        TextPar1 = findViewById(R.id.TextPar1); // тут по-идее ничего не должно работать

        buttpar1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp1 = stpr1[0];
                Intent gtmain = new Intent(Param_1.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp1 = stpr1[1];
                Intent gtmain = new Intent(Param_1.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp1 = stpr1[2];
                Intent gtmain = new Intent(Param_1.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp1 = stpr1[3];
                Intent gtmain = new Intent(Param_1.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp1 = stpr1[4];
                Intent gtmain = new Intent(Param_1.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp1 = stpr1[5];
                Intent gtmain = new Intent(Param_1.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp1 = stpr1[6];
                Intent gtmain = new Intent(Param_1.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar1_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp1 = stpr1[7];
                Intent gtmain = new Intent(Param_1.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
    }
}


   /* public void GoToMain(View v) {
        Intent gtmain = new Intent(this, MainActivity.class);
        startActivity(gtmain);

        }

    }*/  //Эта хуйня была нужна для перехода, потом я сделал другую хуйню
