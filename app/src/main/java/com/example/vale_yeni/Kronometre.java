package com.example.vale_yeni;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Kronometre extends AppCompatActivity {

    TextView textView ;

    Button start, pause, reset, lap ;

    long MillisecondTime, StartTime, TimeBuff, UpdateTime = 0L ;

    Handler handler;

    int Seconds, Minutes, MilliSeconds,saat_kayıt,dakika,saniye_kayıt;

    ListView listView ;

    String[] ListElements = new String[] {  };

    List<String> ListElementsArrayList ;

    ArrayAdapter<String> adapter ;

    long tStart,sonMilis,tDelta;
    double elapsedSeconds;

    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kronometre_deneme);

        textView = (TextView)findViewById(R.id.textView);
        start = (Button)findViewById(R.id.button);
        pause = (Button)findViewById(R.id.button2);
        reset = (Button)findViewById(R.id.button3);
        lap = (Button)findViewById(R.id.button4) ;
        listView = (ListView)findViewById(R.id.listview1);

        sharedPref = this.getPreferences(Context.MODE_PRIVATE);



        final SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);



        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                long ilk= System.currentTimeMillis();
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putLong("intValue",ilk); //int değer ekleniyor
                editor.commit();






            }


        });




        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long son= System.currentTimeMillis();


                long ilk_kayıt = sharedPref.getLong("intValue",0);


                long fark=(son - ilk_kayıt);
                long minutes = TimeUnit.MILLISECONDS.toMinutes(fark);


                textView.setText(String.valueOf(minutes));




            }


        });







    }




}