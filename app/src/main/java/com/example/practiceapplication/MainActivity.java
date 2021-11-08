package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CallingIntent(View view){
        Uri uri = Uri.parse("tel:+923351076620");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    public void NewActivity(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("sample text","HELOOO THIS IS SENT FROM MAIN ACITIVTY");
        startActivity(intent);
    }
}