package com.example.damio.fantasybaseball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Hitters1 extends AppCompatActivity {

    int run = 1;
    int single = 1;
    int doble = 2;
    int triple = 3;
    int homeRun = 4;
    int runBattedIn = 1;
    int walks = 1;
    int hitByPitch = 1;
    int stolenBases = 1;
    int caughtStealing = 1;
    int sum = 0;
    Session session;
    private int returnedValue;
    private TextView totals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitters1);
        totals = findViewById(R.id.total);
        session = Session.getInstance();
        returnedValue = session.getTotalScore();
        totals.setText("" + returnedValue);
    }


    public void buttonClicked(View view) {
        TextView textView = (TextView) view;
        String button = textView.getText().toString();

        switch (button) {

            case "singles":
                sum = sum + single;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "doubles":
                sum = sum + doble;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "Triples":
                sum = sum + triple;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "Home Runs":
                sum = sum + homeRun;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "Run":
                sum = sum + run;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "Runs Batted In":
                sum = sum + runBattedIn;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "Walks":
                sum = sum + walks;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "Hit By Pitch":
                sum = sum + hitByPitch;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "Stolen Bases":
                sum = sum + stolenBases;
                addTotal(sum);
                displayTotal(sum);
                break;

            case "Caught Stealing":
                sum = sum + caughtStealing;
                addTotal(sum);
                displayTotal(sum);
                break;
        }
    }

    void addTotal(int value) {
        session = Session.getInstance();
        value = value + returnedValue;
        session.setTotalScore(value);
        totals.setText(String.valueOf(value));
    }

    // total method
    public void displayTotal(int value) {
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    public void back1(View view) {
        finish();
    }
}
