package com.f0039.geopoint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public static String svp1;
    public static String svp2;
    public static String svp3;
    public static String svp4;
    public static String svp5;
    public static String svp6;
    public static String svp7;
    public static String svp8;

    public static int num = 0;

   // private final static String FILE_NAME = "GruntPoint.txt";

    private TextView textViewDone, textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8;
    private Button ButtPar1;
    private Button ButtPar2;
    private Button ButtPar3;
    private Button ButtPar4;
    private Button ButtPar5;
    private Button ButtPar6;
    private Button ButtPar7;
    private Button ButtPar8;

    private Button ButtDone;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDone = findViewById(R.id.textViewDone);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);

        ButtPar1 = findViewById(R.id.ButtPar1);
        ButtPar2 = findViewById(R.id.ButtPar2);
        ButtPar3 = findViewById(R.id.ButtPar3);
        ButtPar4 = findViewById(R.id.ButtPar4);
        ButtPar5 = findViewById(R.id.ButtPar5);
        ButtPar6 = findViewById(R.id.ButtPar6);
        ButtPar7 = findViewById(R.id.ButtPar7);
        ButtPar8 = findViewById(R.id.ButtPar8);
        ButtDone = findViewById(R.id.ButtDone);

        textView1.setText(svp1);
        textView2.setText(svp2);
        textView3.setText(svp3);
        textView4.setText(svp4);
        textView1.setText(svp5);
        textView2.setText(svp6);
        textView3.setText(svp7);
        textView4.setText(svp8);

        ButtDone = findViewById(R.id.ButtDone);

    }

    public void GoToP1(View v) {
        Intent gtp1 = new Intent(this, Param_1.class);
        startActivity(gtp1);

    }

    public void GoToP2(View v) {
        Intent gtp2 = new Intent(this, Param_2.class);
        startActivity(gtp2);
    }

    public void GoToP3(View v) {
        Intent gtp3 = new Intent(this, Param_3.class);
        startActivity(gtp3);
    }

    public void GoToP4(View v) {
        Intent gtp4 = new Intent(this, Param_4.class);
        startActivity(gtp4);
    }

    public void GoToP5(View v) {
        Intent gtp5 = new Intent(this, Param_5.class);
        startActivity(gtp5);
    }

    public void GoToP6(View v) {
        Intent gtp6 = new Intent(this, Param_6.class);
        startActivity(gtp6);
    }

    public void GoToP7(View v) {
        Intent gtp7 = new Intent(this, Param_7.class);
        startActivity(gtp7);
    }

    public void GoToP8(View v) {
        Intent gtp8 = new Intent(this, Param_8.class);
        startActivity(gtp8);
    }

    public void ButtDoneOut(View v) {
        Date date = new Date();
        num++;
        String wrpoint = (date+ ","+ num + ","+ svp1 +"," +svp2 +"," + svp3 +","+ svp4 +","+ svp5 +"," +svp6 +"," + svp7 +","+ svp8 + "\n");
        /*String filePath = Environment.getExternalStorageDirectory() + "/GruntPoint.csv";*/
        try {
            /*BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filePath ));*/
            FileOutputStream fos  = openFileOutput("GruntPoint.csv", MODE_APPEND);
            fos.write(wrpoint.getBytes());
            fos.flush();
            fos.close();
            Toast.makeText(MainActivity.this, "Точка добавлена", Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }
