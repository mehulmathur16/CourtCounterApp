package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorea = 0 , scoreb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threepointsa(View view){
        scorea = scorea+3;
        displayForTeamA(scorea);
    }

    public void twopointsa(View view){
        scorea = scorea+2;
        displayForTeamA(scorea);
    }

    public void freethrowa(View view){
        scorea = scorea+1;
        displayForTeamA(scorea);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    ////////////////////////B/

    public void threepointsb(View view){
        scoreb = scoreb+3;
        displayForTeamB(scoreb);
    }

    public void twopointsb(View view){
        scoreb = scoreb+2;
        displayForTeamB(scoreb);
    }

    public void freethrowb(View view){
        scoreb = scoreb+1;
        displayForTeamB(scoreb);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view){
        scorea = 0;
        scoreb = 0;
        displayForTeamA(scorea);
        displayForTeamB(scoreb);
    }
}