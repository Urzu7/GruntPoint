package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_4 extends AppCompatActivity {
    public Button buttpar4_1, buttpar4_2, buttpar4_3, buttpar4_4, buttpar4_5, buttpar4_6, buttpar4_7, buttpar4_8, buttpar4_9, buttpar4_10, buttpar4_11;
    public TextView TextPar4, textViewDone;
    public String[] Param_4 = {"AT", "FC", "GL", "GS", "R", "S", "SC", "SL", "TC", "V", "FS",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param4);
        buttpar4_1 = findViewById(R.id.buttpar4_1);
        buttpar4_2 = findViewById(R.id.buttpar4_2);
        buttpar4_3 = findViewById(R.id.buttpar4_3);
        buttpar4_4 = findViewById(R.id.buttpar4_4);
        buttpar4_5 = findViewById(R.id.buttpar4_5);
        buttpar4_6 = findViewById(R.id.buttpar4_6);
        buttpar4_7 = findViewById(R.id.buttpar4_7);
        buttpar4_8 = findViewById(R.id.buttpar4_8);
        buttpar4_9 = findViewById(R.id.buttpar4_9);
        buttpar4_10 = findViewById(R.id.buttpar4_10);
        buttpar4_11 = findViewById(R.id.buttpar4_11);

        TextPar4 = findViewById(R.id.TextPar4); // тут по-идее ничего не должно работать

        buttpar4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[0];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);

            }
        });

        buttpar4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[1];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[2];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[3];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[4];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[5];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar4_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[6];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar4_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[7];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar4_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[8];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar4_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[9];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar4_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp4 = Param_4[10];
                Intent gtmain = new Intent(Param_4.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
    }
}
