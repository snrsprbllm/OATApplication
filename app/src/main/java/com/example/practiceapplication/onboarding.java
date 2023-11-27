package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageButton;

public class onboarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding);
        ImageButton toSignIn = findViewById(R.id.toSignIn);
        toSignIn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SingIn.class);
            startActivity(intent);
        });




    }
}