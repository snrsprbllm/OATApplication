package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);


    }

    public void onClick4(View v) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }

    public void onClick5(View v) {
        Intent intent = new Intent(this, Verification.class);
        startActivity(intent);
    }
}