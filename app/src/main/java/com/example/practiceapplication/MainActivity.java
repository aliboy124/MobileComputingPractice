package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater layoutInflater = getLayoutInflater();
        View myView = layoutInflater.inflate(R.layout.my_layout,(ViewGroup)findViewById(R.id.toastBase) );
        Toast toast = new Toast(getApplicationContext());
        toast.setView(myView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
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
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("sample text","HELOOO THIS IS SENT FROM MAIN ACITIVTY");
        startActivity(intent);
    }
}