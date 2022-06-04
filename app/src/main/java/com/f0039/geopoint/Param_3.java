package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp3;
import static com.f0039.geopoint.Massive.stpr3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_3 extends AppCompatActivity {
    public Button buttpar3_1, buttpar3_2, buttpar3_3, buttpar3_4, buttpar3_5, buttpar3_6, buttpar3_7, buttpar3_8, buttpar3_9, buttpar3_10;
    public TextView TextPar3, textViewDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param3);
        buttpar3_1 = findViewById(R.id.buttpar3_1);
        buttpar3_2 = findViewById(R.id.buttpar3_2);
        buttpar3_3 = findViewById(R.id.buttpar3_3);
        buttpar3_4 = findViewById(R.id.buttpar3_4);
        buttpar3_5 = findViewById(R.id.buttpar3_5);
        buttpar3_6 = findViewById(R.id.buttpar3_6);
        buttpar3_7 = findViewById(R.id.buttpar3_7);
        buttpar3_8 = findViewById(R.id.buttpar3_8);
        buttpar3_9 = findViewById(R.id.buttpar3_9);
        buttpar3_10 = findViewById(R.id.buttpar3_10);

        TextPar3 = findViewById(R.id.TextPar3); // тут по-идее ничего не должно работать

        buttpar3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[0];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);

            }
        });

        buttpar3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[1];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[2];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[3];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[4];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[5];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[6];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar3_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[7];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar3_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[8];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar3_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = stpr3[9];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
    }
}
