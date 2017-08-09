package com.example.android.exlistview;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by newuser on 08-08-2017.
 */

public class ExpandableListViewAdapter extends BaseExpandableListAdapter {
    String[] groupNames = {"Sport", "Mobile", "Food", "Coding", "TV"};
    String[][] childNames ={{"Cricket","Football","Basketball","Boxing","Judo"}
    ,{"Apple","Samsung","Intex"},{"Apple","Mango"},{"C++"},{"Google TV","Samsung TV"}};
    Context context;
    public ExpandableListViewAdapter(Context context) {
        this.context = context;
    }
    @Override
    public Object getChild(int i, int i1) {
        return childNames[i][i1];
    }

    @Override
    public int getGroupCount() {
        return groupNames.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return childNames[i].length;
    }

    @Override
    public Object getGroup(int i) {
        return groupNames[i];
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        textView.setText(groupNames[i]);
        textView.setPadding(100,0,0,0);
        textView.setTextSize(40);
        textView.setTextColor(Color.GREEN);
        return textView;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        final TextView textView = new TextView(context);
        textView.setText(childNames[i][i1]);
        textView.setPadding(100,0,0,0);
        textView.setTextColor(Color.RED);
        textView.setTextSize(30);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,textView.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });


        return textView;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
