package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);




    }

    public void AmericanoClick(View v) {
        Intent intent = new Intent(this, Americano.class);
        startActivity(intent);
    }

    public void CapClick(View v) {
        Intent intent = new Intent(this, Cap.class);
        startActivity(intent);
    }

    public void MochaClick(View v) {
        Intent intent = new Intent(this, Mocha.class);
        startActivity(intent);
    }

    public void FlatWhiteClick(View v) {
        Intent intent = new Intent(this, Flat.class);
        startActivity(intent);
    }

    public void onClick3(View v) {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

}