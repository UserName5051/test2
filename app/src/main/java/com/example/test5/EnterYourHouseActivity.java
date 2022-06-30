package com.example.test5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterYourHouseActivity extends AppCompatActivity {

    private EditText emailEt, passwordEt;
    private Button enterBtn, registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_your_house);

        emailEt = findViewById(R.id.enter_email);
        passwordEt = findViewById(R.id.enter_password);

        String EmailPattern = "[a-zA-Z0-9._]+@[a-z]+\\.+[a-z]+";

        enterBtn = findViewById(R.id.enter_enter);
        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEt.getText().toString();
                String password = passwordEt.getText().toString();

                if (email.isEmpty()){
                    emailEt.setError("Введите почту");
                } else if(!email.matches(EmailPattern)){
                    emailEt.setError("Введите почту\nпо паттерну user@gmail.com");
                } else if (password.isEmpty()){
                    passwordEt.setError("Введите пароль");
                } else{
                    Intent intent = new Intent(EnterYourHouseActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        registerBtn = findViewById(R.id.enter_register);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnterYourHouseActivity.this, NewResident.class);
                startActivity(intent);
                finish();
            }
        });
    }
}