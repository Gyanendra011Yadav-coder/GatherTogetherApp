package com.example.gathertogetherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URL;

public class DashBoardActivity extends AppCompatActivity {

    EditText codeGenerateBox;
    Button joinButton,shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        //Assigning The Value To The Variables Declared Above
        codeGenerateBox=findViewById(R.id.codeBox);
        joinButton =findViewById(R.id.createMeet);
        shareButton=findViewById(R.id.shareButton);



        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}