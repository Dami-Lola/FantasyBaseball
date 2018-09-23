package com.example.damio.fantasybaseball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pitchers2 extends AppCompatActivity {

    int win1 = 4;
    int save1 = 5;
    int inningPitched1= 50;
    int earnedRun1 = -50;
    int hitBatsmen1 = -25;
    int noHitter1 = 5;
    int strikeOut1 = 1;
    int qualityStart1= 4;
    int hold1 = -1;
    int blownSave1 = 2;
    int sum4 =0;
    Sessions sessions;
    private int returnedValue;
    private TextView totals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitchers2);
        totals = findViewById(R.id.total4);
        sessions = Sessions.getInstance();
        returnedValue = sessions.getTotalScore3();
        totals.setText("" + returnedValue);
    }


    public void buttonClicked(View view) {
        TextView textView = (TextView) view;
        String button = textView.getText().toString();

        switch (button) {

            case "Win":
                sum4 = sum4 + win1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "Save":
                sum4 = sum4 + save1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "Inning Pitched":
                sum4 = sum4 + inningPitched1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "Earned Run":
                sum4 = sum4 + earnedRun1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "Hit Batsmen":
                sum4 = sum4 + hitBatsmen1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "No Hitter":
                sum4 = sum4 + noHitter1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "Strikeout":
                sum4 = sum4 + strikeOut1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "Quality Start":
                sum4 = sum4 + qualityStart1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "Hold":
                sum4 = sum4 + hold1;
                addTotal(sum4);
                displayTotal4(sum4);
                break;

            case "Blown Save":
                sum4 = sum4 + blownSave1;
                addTotal(sum4);
                displayTotal4(sum4);
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
    public void displayTotal4(int value){
    }

    public void back4 (View view){

        finish();
    }
}
