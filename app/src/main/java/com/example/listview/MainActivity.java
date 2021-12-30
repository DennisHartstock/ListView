package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");

        ArrayAdapter<String> colorsArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_selectable_list_item, colors);

        listView.setAdapter(colorsArrayAdapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(MainActivity.this,
                "Number " + (i + 1) + ": " + colors.get(i), Toast.LENGTH_SHORT).show());
    }
}