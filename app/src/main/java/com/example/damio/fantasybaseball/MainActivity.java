package com.example.damio.fantasybaseball;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView boston_red_sox;
    private TextView houston_astros;
    private Session session;
    private Sessions sessions;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boston_red_sox = findViewById(R.id.boston_red_sox);
        handler = new Handler();
        houston_astros = findViewById(R.id.houston_astros);
        handler = new Handler();
    }

    //method that calls the data from the hitters and pitchers java classes to display
    @Override
    protected void onResume() {
        super.onResume();
        session = Session.getInstance();
        sessions = Sessions.getInstance();
        boston_red_sox.setText("" + session.getTotalScore());
        houston_astros.setText("" + sessions.getTotalScore3());

    }

    // The method for the reset button
    public void reset(View view) {
        session = Session.getInstance();
        sessions = Sessions.getInstance();
        session.setTotalScore(0);
        sessions.setTotalScore3(0);
        boston_red_sox.setText("0");
        houston_astros.setText("0");

    }


    //  Takes you to hitters for boston_red_sox page
    public void hit1(View view) {
        Intent intent = new Intent(getApplicationContext(), Hitters1.class);
        startActivity(intent);
    }

    //to destroy the old activity and not log to many ones to in order not to fill up memory space
    @Override
    protected void onDestroy() {
        super.onDestroy();
        session = Session.getInstance();
        session = null;
        sessions = Sessions.getInstance();
        sessions = null;
    }

    //  Takes you to Pitchers for boston_red_sox page
    public void pitch1(View view) {
        Intent intent = new Intent(getApplicationContext(), Pitchers1.class);
        startActivity(intent);

    }

    //  Takes you to hitters  for houston_astros page
    public void hit2(View view) {
        Intent intent = new Intent(getApplicationContext(), Hitters2.class);
        startActivity(intent);
    }

    //  Takes you to pitchers  for houston_astros page
    public void pitch2(View view) {
        Intent intent = new Intent(getApplicationContext(), Pitchers2.class);
        startActivity(intent);
    }

}
