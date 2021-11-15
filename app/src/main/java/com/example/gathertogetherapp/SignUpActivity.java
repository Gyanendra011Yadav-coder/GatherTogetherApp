package com.example.gathertogetherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    EditText userName,emailBox,password,alreadyHaveAccount;
    Button signup;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Assigning The Value To the Objects That are Created Above
        userName=findViewById(R.id.inputUserName);
        emailBox=findViewById(R.id.inputEmail);
        password=findViewById(R.id.inputPassword);
        alreadyHaveAccount=findViewById(R.id.alreadyHaveAccount);
        signup=findViewById(R.id.submitButton);

    }
}