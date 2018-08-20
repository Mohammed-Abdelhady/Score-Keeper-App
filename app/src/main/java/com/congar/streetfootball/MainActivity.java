package com.congar.streetfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0 , goalTeamB = 0 , foulTeamA = 0 , foulTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void addGoalsTeamA(View view) {
        goalTeamA++;
        displayGoalsTeamA(goalTeamA);
    }

    public void minusTeamAGoals(View view) {
        goalTeamA--;
        if(goalTeamA < 0){
            goalTeamA = 0;
        }
        displayGoalsTeamA(goalTeamA);
    }


    public void addFoulsTeamA(View view) {
        foulTeamA++;
        displayFoulsTeamA(foulTeamA);
    }

    public void minusFoulsGoalsTeamA(View view) {
        foulTeamA--;
        if(foulTeamA < 0){
            foulTeamA = 0;
        }
        displayFoulsTeamA(foulTeamA);
    }
    public void addGoalsTeamB(View view) {
        goalTeamB++;
        displayGoalsTeamB(goalTeamB);
    }

    public void minusTeamBGoals(View view) {
        goalTeamB--;
        if(goalTeamB < 0){
            goalTeamB = 0;
        }
        displayGoalsTeamB(goalTeamB);
    }

    public void addFoulsTeamB(View view) {
        foulTeamB++;
        displayFoulsTeamB(foulTeamB);
    }

    public void minusFoulsGoalsTeamB(View view) {
        foulTeamB--;
        if(foulTeamB < 0){
            foulTeamB = 0;
        }
        displayFoulsTeamB(foulTeamB);
    }


    public void resetScore(View view) {
        goalTeamB = 0;
        goalTeamA = 0;
        foulTeamB = 0;
        foulTeamA = 0;
        displayGoalsTeamA(goalTeamA);
        displayFoulsTeamA(foulTeamA);
        displayGoalsTeamB(goalTeamB);
        displayFoulsTeamB(foulTeamB);
    }

    private void displayGoalsTeamA(int goalsScore){
        TextView goalView = findViewById(R.id.team_A_goals);
        goalView.setText(String.valueOf(goalsScore));
    }

    private void displayGoalsTeamB(int goalsScore){
        TextView goalView = findViewById(R.id.team_B_goals);
        goalView.setText(String.valueOf(goalsScore));
    }

    private void displayFoulsTeamA(int foulsScore){
        TextView goalView = findViewById(R.id.team_A_Fouls);
        goalView.setText(String.valueOf(foulsScore));
    }
    private void displayFoulsTeamB(int foulsScore){
        TextView goalView = findViewById(R.id.team_B_Fouls);
        goalView.setText(String.valueOf(foulsScore));
    }
}
