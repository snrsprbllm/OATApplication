package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SignIn extends AppCompatActivity {

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

    public void onClick(View v) {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void onClick1(View v) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }

    public void onClick2(View v) {
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);
    }

    public void toHome(View v) {
        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
        preferences.edit().putBoolean("isFirstRun", true).apply();
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
