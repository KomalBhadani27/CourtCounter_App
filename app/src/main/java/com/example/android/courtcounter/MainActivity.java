package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    final ArrayList<String> ScoreA =new ArrayList<>();
    final ArrayList<String> ScoreB =new ArrayList<>();
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String Key = "Key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void sendMessage(View view) {
        // Do something in response to button
       Intent intent = new Intent(this, Main2Activity.class);
       intent.putExtra(EXTRA_MESSAGE, (ArrayList<String>) ScoreA);
       intent.putExtra(Key, (ArrayList<String>) ScoreB);

        //EditText editText = (EditText) findViewById(R.id.Score_Sheet);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void displayA(int scoreA) {
        TextView scoreBoard = (TextView) findViewById(R.id.scoreBoard_A);
        scoreBoard.setText("" + scoreA);
    }

    public void displayB(int scoreB) {
        TextView scoreBoard = (TextView) findViewById(R.id.scoreBoard_B);
        scoreBoard.setText("" + scoreB);
    }

    public void Add3toA(View view) {
        ScoreA.add("3");
        scoreTeamA += 3;
        displayA(scoreTeamA);
    }

    public void Add3toB(View view) {
        ScoreB.add("3");
        scoreTeamB += 3;
        displayB(scoreTeamB);
    }

    public void Add2toA(View view) {
        ScoreA.add("2");
        scoreTeamA += 2;
        displayA(scoreTeamA);
    }

    public void Add2toB(View view) {
        ScoreB.add("2");
        scoreTeamB += 2;
        displayB(scoreTeamB);
    }

    public void Add1toA(View view) {
        ScoreA.add("1");
        scoreTeamA += 1;
        displayA(scoreTeamA);
    }

    public void Add1toB(View view) {
        ScoreB.add("1");
        scoreTeamB += 1;
        displayB(scoreTeamB);
    }

    public void setTo0(View view) {
        ScoreA.removeAll(ScoreA);
        ScoreB.removeAll(ScoreB);
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayB(scoreTeamB);
        displayA(scoreTeamA);
    }
}


