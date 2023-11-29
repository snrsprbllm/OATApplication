package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;

public class SplashSkibidi extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_skibidi);
        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);

        // Получаем значение флага isFirstRun, если его нет, то возвращаем true по умолчанию
        boolean isFirstRun = preferences.getBoolean("isFirstRun", false);

        // Если флаг равен true, то запускаем нужное окно
        if (isFirstRun) {
            Intent intent = new Intent(this, HomePage.class);
            startActivity(intent);



        }
        else {
            handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashSkibidi.this, onboarding.class);
                    startActivity(intent);
                    finish();

                }
            }, 3000);
        }




    }
}