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
    public static int num = 0;

   // private final static String FILE_NAME = "GruntPoint.txt";

    private TextView textViewDone, textView1, textView2, textView3, textView4;
    private Button ButtPar1;
    private Button ButtPar2;
    private Button ButtPar3;
    private Button ButtPar4;
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
        ButtPar1 = findViewById(R.id.ButtPar1);
        ButtPar2 = findViewById(R.id.ButtPar2);
        ButtPar3 = findViewById(R.id.ButtPar3);
        ButtPar4 = findViewById(R.id.ButtPar4);
        ButtDone = findViewById(R.id.ButtDone);
        textView1.setText(svp1);
        textView2.setText(svp2);
        textView3.setText(svp3);
        textView4.setText(svp4);
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

    public void ButtDoneOut(View v) {
        Date date = new Date();
        num++;
        String wrpoint = (date+ ","+ num + ","+ svp1 +"," +svp2 +"," + svp3 +","+ svp4+ "\n");
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

