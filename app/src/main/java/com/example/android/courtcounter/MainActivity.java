package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     this method displays the given score for team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     this method displays the given score for team B
     */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /* this method adds 3 points to team A score */
    public void addThreeForTeamA (View v){
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /* this method adds 3 points to team B score */
    public void addThreeForTeamB (View v){
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /* this method adds 2 points to team A score */
    public void addTwoForTeamA (View v){
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /* this method adds 2 points to team B score */
    public void addTwoForTeamB (View v){
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /* this method adds 1 to team A score */
    public void freeThrowForTeamA(View v){
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /* this method adds 1 to team B score */
    public void freeThrowForTeamB(View v){
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
