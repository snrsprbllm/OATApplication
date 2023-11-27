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
       /* SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);

        // Получаем значение флага isFirstRun, если его нет, то возвращаем true по умолчанию
        boolean isFirstRun = preferences.getBoolean("isFirstRun", true);

        // Если флаг равен true, то запускаем нужное окно
        if (isFirstRun) {
            Intent intent = new Intent(this, SingIn.class);
            startActivity(intent);

            // Сохраняем значение флага в false, чтобы при следующем запуске не показывать окно
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("isFirstRun", false);
            editor.apply();
        } */

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(SplashSkibidi.this, onboarding.class);
                startActivity(intent);
                finish();

            }
        },3000);


    }
}