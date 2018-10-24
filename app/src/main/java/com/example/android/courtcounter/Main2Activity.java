package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    ListView listView1;
    int total1=0,total2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        listView = (ListView) findViewById(R.id.list);
        listView1 = (ListView) findViewById(R.id.list1);

        List<String> array= new ArrayList<>() ;
        List<String> array1= new ArrayList<>() ;

        if (null != bundle) {
             array = bundle.getStringArrayList(MainActivity.EXTRA_MESSAGE);
             array1= bundle.getStringArrayList(MainActivity.Key);
        }
        TextView winner = findViewById(R.id.winner_text);
        TextView team1 = findViewById(R.id.team1_text);
        TextView team2 = findViewById(R.id.team2_text);
        assert array != null;
        assert array1 != null;
        if(!array.isEmpty() && !array1.isEmpty()) {
            for(int i=0;i<array.size();i++) {
                total1+=Integer.parseInt(array.get(i));
            }
            for(int i=0;i<array1.size();i++) {
                total2+=Integer.parseInt(array1.get(i));
            }
        }
        if(total1>total2) {
            winner.setText("Team 1");
        }
        else if(total2>total1) {
            winner.setText("Team 2");
        } else {
            winner.setText("Tie");
        }
        team1.setText(String.valueOf(total1));
        team2.setText(String.valueOf(total2));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, array);

        listView.setAdapter(arrayAdapter);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, array1);

        listView1.setAdapter(arrayAdapter1);
    }
}

