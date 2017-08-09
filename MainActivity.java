package com.example.android.exlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity {

ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
ExpandableListViewAdapter adapter = new ExpandableListViewAdapter(MainActivity.this);
        expandableListView.setAdapter(adapter);
    }
}
