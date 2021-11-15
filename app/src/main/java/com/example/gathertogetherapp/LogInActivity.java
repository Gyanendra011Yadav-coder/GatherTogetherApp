package com.example.gathertogetherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {
//Creating the Object Of Text-View and Button
    EditText emailBox,password,signUp; // here SignUp is not used as an Button but it is used as TextView
    Button loginBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        //Assigning The Value To the Objects That are Created Above
        emailBox=findViewById(R.id.emailBox);
        password=findViewById(R.id.password);
        loginBtn=findViewById(R.id.loginBtn);
        signUp=findViewById(R.id.signUp);
    }
}
