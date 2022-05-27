package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_3 extends AppCompatActivity {
    public Button buttpar3_1, buttpar3_2, buttpar3_3, buttpar3_4;
    public TextView TextPar3, textViewDone;
    public String[] param_3 = {"param3_1", "param3_2", "param3_3", "param3_4",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param3);
        buttpar3_1 = findViewById(R.id.buttpar3_1);
        buttpar3_2 = findViewById(R.id.buttpar3_2);
        buttpar3_3 = findViewById(R.id.buttpar3_3);
        buttpar3_4 = findViewById(R.id.buttpar3_4);
        TextPar3 = findViewById(R.id.TextPar3); // тут по-идее ничего не должно работать

        buttpar3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = param_3[0];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);

            }
        });

        buttpar3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = param_3[1];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = param_3[2];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp3 = param_3[3];
                Intent gtmain = new Intent(Param_3.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

    }
}