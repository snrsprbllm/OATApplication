package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class SignIn extends AppCompatActivity {


    TextInputEditText mail,password;
    FloatingActionButton btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_sign_in);
        mail = findViewById(R.id.email_edit_text);
        password = findViewById(R.id.password_edit_text);
        btnHome = findViewById(R.id.home_arrow);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mail, Password;
                Mail = String.valueOf(mail.getText());
                Password = String.valueOf(password.getText());
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                Pattern pattern = Pattern.compile(emailPattern);
                boolean isValid = pattern.matches(emailPattern, Mail);



                if(TextUtils.isEmpty(Password)|| TextUtils.isEmpty(Mail)) {
                    Toast.makeText(SignIn.this, "Проверьте заполненность полей", Toast.LENGTH_SHORT).show();
                }

                else if (!isValid) {
                    Toast.makeText(SignIn.this, "Проверьте валидность ввода", Toast.LENGTH_SHORT).show();
                }




                else if (Password.equals(password)){
                    mAuth.signInWithEmailAndPassword(Mail, Password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            Toast.makeText(SignIn.this, "Вы вошли в аккаунт", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignIn.this, HomePage.class);
                            startActivity(intent);
                        }
                    });
                } else {
                    Toast.makeText(SignIn.this, "Не совпадают пароли", Toast.LENGTH_SHORT).show();
                }

            }
        });

        ImageButton toBack = findViewById(R.id.back_arrow);
        toBack.setOnClickListener(v -> {
            Intent intent = new Intent(this, onboarding.class);
            startActivity(intent);
        });


    }

    public void onClick10(View v) {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }


    public void onClick2(View v) {
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);
    }

    public void toHome(View v) {
        // SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
       // preferences.edit().putBoolean("isFirstRun", true).apply();
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
