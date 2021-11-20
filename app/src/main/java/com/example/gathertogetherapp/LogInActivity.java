package com.example.gathertogetherapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogInActivity extends AppCompatActivity {
    //Creating FireBase Object
    FirebaseAuth auth;
//Creating the Object Of Text-View and Button
    EditText emailBox, passwordBox,signUp; // here SignUp is not used as an Button but it is used as TextView
    Button loginBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        auth=FirebaseAuth.getInstance();
        //Assigning The Value To the Objects That are Created Above
        emailBox=findViewById(R.id.emailBox);
        passwordBox =findViewById(R.id.password);
        loginBtn=findViewById(R.id.loginBtn);
        signUp=findViewById(R.id.signUp);

        //Setting The Procedure Of Opening The SignUp Activity After Pressing
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this,SignUpActivity.class));
            }
        });

        //Searching for the User's Account By Passing the User's Credentials That User Have Provided
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;
                email=emailBox.getText().toString();
                password=passwordBox.getText().toString();
                auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(LogInActivity.this, "Logged In Succesfull...", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(LogInActivity.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
