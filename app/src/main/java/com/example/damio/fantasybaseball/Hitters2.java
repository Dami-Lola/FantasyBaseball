package com.example.damio.fantasybaseball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Hitters2 extends AppCompatActivity {

    int run1 = 1;
    int single1 = 1;
    int doble1 = 2;
    int triple1 = 3;
    int homeRun1 = 4;
    int runBattedIn1 = 1;
    int walks1 = 1;
    int hitByPitch1 =1;
    int stolenBases1 = 1;
    int caughtStealing1 = 1;
    int sum3 = 0;
    Sessions sessions;
    private int returnedValue;
    private TextView totals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitters2);
        totals = findViewById(R.id.total3);
        sessions = Sessions.getInstance();
        returnedValue = sessions.getTotalScore3();
        totals.setText("" + returnedValue);
    }


    public void buttonClicked(View view) {
        TextView textView = (TextView) view;
        String button = textView.getText().toString();

        switch (button) {

            case "singles":
                sum3 = sum3 + single1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "doubles":
                sum3 = sum3 + doble1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "Triples":
                sum3 = sum3 + triple1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "Home Runs":
                sum3 = sum3 + homeRun1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "Run":
                sum3 = sum3 + run1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "Runs Batted In":
                sum3 = sum3 + runBattedIn1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "Walks":
                sum3 = sum3 + walks1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "Hit By Pitch":
                sum3 = sum3 + hitByPitch1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "Stolen Bases":
                sum3 = sum3 + stolenBases1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;

            case "Caught Stealing":
                sum3 = sum3 + caughtStealing1;
                addTotal(sum3);
                displayTotal3(sum3);
                break;
        }
    }

    void addTotal(int value) {
        sessions = Sessions.getInstance();
        value = value + returnedValue;
        sessions.setTotalScore3(value);
        totals.setText(String.valueOf(value));
    }


    // total method
    public void displayTotal3(int value){
    }

    public void back3 (View view){
        finish();
    }
}
