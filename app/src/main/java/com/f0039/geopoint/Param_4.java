package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_4 extends AppCompatActivity {
    public Button buttpar4_1, buttpar4_2, buttpar4_3, buttpar4_4;
    public TextView TextPar3, textViewDone;
    public String[] Param_4 = {"param4_1", "param4_2", "param4_3", "param4_4",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param4);
        buttpar4_1 = findViewById(R.id.buttpar4_1);
        buttpar4_2 = findViewById(R.id.buttpar4_2);
        buttpar4_3 = findViewById(R.id.buttpar4_3);
        buttpar4_4 = findViewById(R.id.buttpar4_4);
        TextPar3 = findViewById(R.id.TextPar3); // тут по-идее ничего не должно работать

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

    }
}