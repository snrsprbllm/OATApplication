package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Flat extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat);



    }

    public void onClick3(View v) {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void changehotalphaclick(View view) {
        ImageButton hotcup = (ImageButton) findViewById(R.id.hotcup);
        ImageButton icebottle = (ImageButton) findViewById(R.id.icebottle);
        icebottle.setAlpha(0.2f);
        hotcup.setAlpha(1f);
    }

    public void changeicebottleaplehaclick(View view) {
        ImageButton hotcup = (ImageButton) findViewById(R.id.hotcup);
        ImageButton icebottle = (ImageButton) findViewById(R.id.icebottle);
        icebottle.setAlpha(1f);
        hotcup.setAlpha(0.2f);
    }

    public void changesmolcupalphaclick(View view) {
        ImageButton smolcup = (ImageButton) findViewById(R.id.smolcup);
        ImageButton middlecup = (ImageButton) findViewById(R.id.middlecup);
        ImageButton bigcup = (ImageButton) findViewById(R.id.bigcup);
        smolcup.setAlpha(1f);
        middlecup.setAlpha(0.2f);
        bigcup.setAlpha(0.2f);
    }

    public void changemiddlecupalphaclick(View view) {
        ImageButton smolcup = (ImageButton) findViewById(R.id.smolcup);
        ImageButton middlecup = (ImageButton) findViewById(R.id.middlecup);
        ImageButton bigcup = (ImageButton) findViewById(R.id.bigcup);
        smolcup.setAlpha(0.2f);
        middlecup.setAlpha(1f);
        bigcup.setAlpha(0.2f);
    }

    public void changebigcupalphaclick(View view) {
        ImageButton smolcup = (ImageButton) findViewById(R.id.smolcup);
        ImageButton middlecup = (ImageButton) findViewById(R.id.middlecup);
        ImageButton bigcup = (ImageButton) findViewById(R.id.bigcup);
        smolcup.setAlpha(0.2f);
        middlecup.setAlpha(0.2f);
        bigcup.setAlpha(1f);
    }

    public void changeoneicealphaclick(View view) {
        ImageButton oneice = (ImageButton) findViewById(R.id.oneice);
        ImageButton twoice =(ImageButton) findViewById(R.id.twoice);
        ImageButton threeice = (ImageButton) findViewById(R.id.threeice);
        oneice.setAlpha(1f);
        twoice.setAlpha(0.2f);
        threeice.setAlpha(0.2f);
    }

    public void changetwoicealphaclick(View view) {
        ImageButton oneice = (ImageButton) findViewById(R.id.oneice);
        ImageButton twoice =(ImageButton) findViewById(R.id.twoice);
        ImageButton threeice = (ImageButton) findViewById(R.id.threeice);
        oneice.setAlpha(0.2f);
        twoice.setAlpha(1f);
        threeice.setAlpha(0.2f);
    }

    public void changethreeicealphaclick(View view) {
        ImageButton oneice = (ImageButton) findViewById(R.id.oneice);
        ImageButton twoice =(ImageButton) findViewById(R.id.twoice);
        ImageButton threeice = (ImageButton) findViewById(R.id.threeice);
        oneice.setAlpha(0.2f);
        twoice.setAlpha(0.2f);
        threeice.setAlpha(1f);
    }


}