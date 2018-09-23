package com.example.damio.fantasybaseball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pitchers1 extends AppCompatActivity {

    int win = 4;
    int save = 5;
    int inningPitched= 50;
    int earnedRun = -50;
    int hitBatsmen = -25;
    int noHitter = 5;
    int strikeOut = 1;
    int qualityStart= 4;
    int hold = -1;
    int blownSave = 2;
    int sum2 =0;
    Session session;
    private int returnedValue;
    private TextView totals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitchers1);
        totals = findViewById(R.id.total2);
        session = Session.getInstance();
        returnedValue = session.getTotalScore();
        totals.setText("" + returnedValue);
    }


    public void buttonClicked(View view) {
        TextView textView = (TextView) view;
        String button = textView.getText().toString();

        switch (button) {

            case "Win":
                sum2 = sum2 + win;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

            case "Save":
                sum2 = sum2 + save;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

            case "Inning Pitched":
                sum2 = sum2 + inningPitched;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

                case "Earned Run":
                sum2 = sum2 + earnedRun;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

            case "Hit Batsmen":
                sum2 = sum2 + hitBatsmen;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

            case "No Hitter":
                sum2 = sum2 + noHitter;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

            case "Strikeout":
                sum2 = sum2 + strikeOut;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

            case "Quality Start":
                sum2 = sum2 + qualityStart;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

            case "Hold":
                sum2 = sum2 + hold;
                addTotal(sum2);
                displayTotal2(sum2);
                break;

            case "Blown Save":
                sum2 = sum2 + blownSave;
                addTotal(sum2);
                displayTotal2(sum2);
                break;
        }
    }

    void addTotal(int value) {
        session = Session.getInstance();
        value = value + returnedValue;
        session.setTotalScore(value);
        totals.setText(String.valueOf(value));
    }

    //total method
    public void displayTotal2(int value) {
    }

    @Override
    public void onResume() {
        super.onResume();
    }
    public void back2 (View view){
        finish();
    }
}
