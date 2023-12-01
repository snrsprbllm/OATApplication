package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class SignUp extends AppCompatActivity {

    TextInputEditText username,email,phone,password,confirmpassword;
    FloatingActionButton btnLog;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
         btnLog = findViewById(R.id.home_arrow);
         mAuth = FirebaseAuth.getInstance();
        username = findViewById(R.id.username_edit_text);
         email = findViewById(R.id.email_edit_text);
         phone = findViewById(R.id.mobile_number_edit_text);
         password = findViewById(R.id.password_edit_text);
         confirmpassword = findViewById(R.id.confirm_password_edit_text);
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String Username,Password,Phone,ConPass,Mail;
            Username = String.valueOf(username.getText());
            Password = String.valueOf(password.getText());
            Phone = String.valueOf(phone.getText());
            ConPass = String.valueOf(confirmpassword.getText());
            Mail = String.valueOf(email.getText());
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                Pattern pattern = Pattern.compile(emailPattern);
                boolean isValid = pattern.matches(emailPattern, Mail);

            if(TextUtils.isEmpty(Username) || TextUtils.isEmpty(Password) || TextUtils.isEmpty(Phone) || TextUtils.isEmpty(ConPass)|| TextUtils.isEmpty(Mail)){
                Toast.makeText(SignUp.this, "Проверьте заполненность полей!", Toast.LENGTH_SHORT).show();
            }

            else if (!isValid) {
                Toast.makeText(SignUp.this, "Проверьте валидность ввода", Toast.LENGTH_SHORT).show();
            }

            else if(Password.equals(ConPass)){
                mAuth.createUserWithEmailAndPassword(Mail,Password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(SignUp.this, "Вы зарегистрировались!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(SignUp.this, HomePage.class);
                        startActivity(intent);
                    }
                });
            }else {
                Toast.makeText(SignUp.this, "Не совпадают пароли!", Toast.LENGTH_SHORT).show();
            }
            }
        });
    }
}