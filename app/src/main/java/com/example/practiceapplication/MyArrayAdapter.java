package com.example.practiceapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyArrayAdapter extends ArrayAdapter {
    public final Activity context;
    public final String[] firstNames;
    public final String[] lastNames;
    public MyArrayAdapter(Activity context,String[] firstNames, String[] lastNames){
        super(context, android.R.layout.simple_list_item_1,firstNames);
        this.context = context;
        this.firstNames = firstNames;
        this.lastNames = lastNames;
    }
    public View getView(int i, View view, ViewGroup parent){
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View myView = layoutInflater.inflate(R.layout.listviewcustom,null);
        TextView firstname = myView.findViewById(R.id.firstname);
        TextView lastname = myView.findViewById(R.id.lastname);
        firstname.setText(firstNames[i]);
        lastname.setText(lastNames[i]);
        return myView;
    }
}
