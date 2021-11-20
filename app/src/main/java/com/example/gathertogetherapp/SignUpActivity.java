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

public class SignUpActivity extends AppCompatActivity {
    //Creating The Object Of FireBase
    FirebaseAuth auth;

    EditText userNameBox,emailBox,passwordBox,alreadyHaveAccount;
    Button signup;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Assigning the Value to the Firebase Created Variable.
        auth = FirebaseAuth.getInstance();

        //Assigning The Value To the Objects That are Created Above
        userNameBox = findViewById(R.id.inputUserName);
        emailBox = findViewById(R.id.inputEmail);
        passwordBox = findViewById(R.id.inputPassword);
        alreadyHaveAccount = findViewById(R.id.alreadyHaveAccount);
        signup = findViewById(R.id.submitButton);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, pass;
                name = userNameBox.getText().toString();
                email = emailBox.getText().toString();
                pass = passwordBox.getText().toString();


            //Passing the User Credentials To The FireBase to Created The User's Account
                auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(SignUpActivity.this, "Account Created Successfully...", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(SignUpActivity.this, (CharSequence) task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        //Setting The Procedure Of Opening The SignUp Activity After Pressing
        alreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this,LogInActivity.class));
            }
        });
    }
    }
