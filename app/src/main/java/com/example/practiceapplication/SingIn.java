package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class SingIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);
        ImageButton toBack = findViewById(R.id.back_arrow);
        toBack.setOnClickListener(v -> {
            Intent intent = new Intent(this, onboarding.class);
            startActivity(intent);
        });
    }
}