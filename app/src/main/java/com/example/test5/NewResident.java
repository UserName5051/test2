package com.example.test5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewResident extends AppCompatActivity {

    private EditText emailEt, nameEt, passwordEt;
    private Button registerBtn, enterBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_resident);

        emailEt = findViewById(R.id.regiter_email);
        nameEt = findViewById(R.id.regiter_name);
        passwordEt = findViewById(R.id.regiter_password);

        String EmailPattern = "[a-zA-Z0-9._]+@[a-z]+\\.+[a-z]+";
        registerBtn = findViewById(R.id.register_register);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEt.getText().toString();
                String name = nameEt.getText().toString();
                String password = passwordEt.getText().toString();
                if (email.isEmpty()){
                    emailEt.setError("Введите почту");
                } else if(!email.matches(EmailPattern)){
                    emailEt.setError("Введите почту\nпо парттерну user@gmail.com");
                } else if(name.isEmpty()){
                    nameEt.setError("Введите имя");
                } else if (password.isEmpty()){
                    passwordEt.setError("Введите пароль");
                } else{
                    Intent intent = new Intent(NewResident.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        enterBtn = findViewById(R.id.register_login);
        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewResident.this, EnterYourHouseActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}