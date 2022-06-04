package com.f0039.geopoint;

import static com.f0039.geopoint.MainActivity.svp2;
import static com.f0039.geopoint.Massive.stpr2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Param_2 extends AppCompatActivity {
    public Button buttpar2_1, buttpar2_2, buttpar2_3, buttpar2_4;
    public TextView TextPar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param2);
        buttpar2_1 = findViewById(R.id.buttpar2_1);
        buttpar2_2 = findViewById(R.id.buttpar2_2);
        buttpar2_3 = findViewById(R.id.buttpar2_3);
        buttpar2_4 = findViewById(R.id.buttpar2_4);
        TextPar2 = findViewById(R.id.TextPar2); // тут тоже по-идее ничего не должно работать


        buttpar2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp2 = stpr2[0];
                Intent gtmain = new Intent(Param_2.this, MainActivity.class);
                startActivity(gtmain);

            }
        });

        buttpar2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp2 = stpr2[1];
                Intent gtmain = new Intent(Param_2.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp2 = stpr2[2];
                Intent gtmain = new Intent(Param_2.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

        buttpar2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                svp2 = stpr2[3];
                Intent gtmain = new Intent(Param_2.this, MainActivity.class);
                startActivity(gtmain);
            }
        });

}
}
