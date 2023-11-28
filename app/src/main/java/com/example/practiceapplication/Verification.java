package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Verification extends AppCompatActivity {
    private static final int MILLIS_PER_SECOND = 1000;
    private static final int SECONDS_TO_COUNTDOWN = 30;
    private TextView countdownDisplay;
    private CountDownTimer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        countdownDisplay = findViewById(R.id.countdownDisplay);
        try {
            showTimer(SECONDS_TO_COUNTDOWN * MILLIS_PER_SECOND);
        } catch (NumberFormatException e) {

        }
    }

    private void showTimer(int i) {
        if (timer != null) {
            timer.cancel();
        }
        timer = new CountDownTimer(i, MILLIS_PER_SECOND) {
            @Override
            public void onTick(long millisUntilFinished) {
                countdownDisplay.setText("Resend in 00: " + millisUntilFinished / MILLIS_PER_SECOND);
            }

            @Override
            public void onFinish() {
                countdownDisplay.setText("Resend");
            }
        }.start();
    }

    public void onClick3(View v) {
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);
    }

    public void onClick5(View v) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }


}