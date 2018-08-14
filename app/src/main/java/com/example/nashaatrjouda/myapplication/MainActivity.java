package com.example.nashaatrjouda.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override

            public void run() {
                Intent intent = new Intent(MainActivity.this, SignIn.class);
                startActivity(intent);
                finish();
           }

        },1500);

    }

    public void nextpage(View view) {
        Intent intent = new Intent(MainActivity.this,SignIn.class);
        startActivity(intent);
    }


    //public void nextsignin(View view) {
      //  Intent intent = new Intent(MainActivity.this, SignIn.class);
      //  startActivity(intent);
   // }
}
