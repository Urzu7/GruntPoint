package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp7;
import static com.f0039.geopoint.Massive.stpr7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_7 extends AppCompatActivity {
    public Button buttpar7_1, buttpar7_2, buttpar7_3, buttpar7_4, buttpar7_5, buttpar7_6, buttpar7_7, buttpar7_8, buttpar7_9, buttpar7_10;
    public TextView Textpar7, textViewDone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param3);
        buttpar7_1 = findViewById(R.id.buttpar7_1);
        buttpar7_2 = findViewById(R.id.buttpar7_2);
        buttpar7_3 = findViewById(R.id.buttpar7_3);
        buttpar7_4 = findViewById(R.id.buttpar7_4);
        buttpar7_5 = findViewById(R.id.buttpar7_5);
        buttpar7_6 = findViewById(R.id.buttpar7_6);
        buttpar7_7 = findViewById(R.id.buttpar7_7);

        Textpar7 = findViewById(R.id.TextPar7); // тут по-идее ничего не должно работать

        buttpar7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp7 = stpr7[0];
                Intent gtmain = new Intent(Param_7.this, MainActivity.class);
                startActivity(gtmain);

            }
        });

        buttpar7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp7 = stpr7[1];
                Intent gtmain = new Intent(Param_7.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar7_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp7 = stpr7[2];
                Intent gtmain = new Intent(Param_7.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar7_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp7 = stpr7[3];
                Intent gtmain = new Intent(Param_7.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar7_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp7 = stpr7[4];
                Intent gtmain = new Intent(Param_7.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar7_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp7 = stpr7[5];
                Intent gtmain = new Intent(Param_7.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
        buttpar7_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp7 = stpr7[6];
                Intent gtmain = new Intent(Param_7.this, MainActivity.class);
                startActivity(gtmain);
            }
        });
    }
}
