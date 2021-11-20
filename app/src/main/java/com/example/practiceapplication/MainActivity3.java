package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("ali");
        myArrayList.add("ahmed");
        myArrayList.add("waqar");
        myArrayList.add("bilal");
        myArrayList.add("haider");
        myArrayList.add("qasim");
        myArrayList.add("babar");
        myArrayList.add("shahzad");
        myArrayList.add("awais");
        myArrayList.add("saad");
        myArrayList.add("haseeb");
        myArrayList.add("hasher");
        Collections.sort(myArrayList);

        ArrayAdapter<String> adap = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myArrayList);
        ListView myListView = findViewById(R.id.mylistview);
        myListView.setAdapter(adap);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("sample text",myArrayList.get(i));
                startActivity(intent);
            }
        });
    }
}