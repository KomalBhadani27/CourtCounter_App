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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    ListView listView1;

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

