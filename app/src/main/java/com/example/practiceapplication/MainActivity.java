package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
//import android.widget.Toolbar;

import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater layoutInflater = getLayoutInflater();
        View myView = layoutInflater.inflate(R.layout.my_layout,null );
        Toast toast = new Toast(getApplicationContext());
        toast.setView(myView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void CallingIntent(View view){
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        if(sharingIntent.resolveActivity(getPackageManager()) != null){
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
        }
    }

    public void NewActivity(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity3.class);
        //intent.putExtra("sample text","HELOOO THIS IS SENT FROM MAIN ACITIVTY");
        startActivity(intent);
    }
    public void GotoActivity3(View view){
//        Intent intent = new Intent();
//        intent.setAction(Intent.ACTION_SEND);
//        intent.setPackage("com.whatsapp");
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT,"My Message");
//        startActivity(intent);


        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"bsef18a519@pucit.edu.pk"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"SENT from android app");
        intent.putExtra(Intent.EXTRA_TEXT,"This text is sent from app for flexing purposes.");
        if (intent.resolveActivity(getPackageManager())!=null)
            startActivity(intent);
    }
}