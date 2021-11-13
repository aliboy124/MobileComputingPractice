package com.example.practiceapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        TextView txt = (TextView) findViewById(R.id.textView2);
        txt.setText(intent.getStringExtra("sample text"));

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
        //builder.setMessage("MA MESSAGE");
        //builder.setTitle("MA TITLE");
        builder.setCancelable(true);

        LayoutInflater layoutInflater = getLayoutInflater();
        View myView = layoutInflater.inflate(R.layout.my_layout,(ViewGroup)findViewById(R.id.toastBase) );
        builder.setView(myView);
        //builder.setIcon(R.drawable.ic_baseline_account_balance_24);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}