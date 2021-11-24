package com.example.gathertogetherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DashBoardActivity extends AppCompatActivity {

    EditText codeGenerateBox;
    Button createMeetButton,shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        //Assigning The Value To The Variables Declared Above
        codeGenerateBox=findViewById(R.id.codeBox);
        createMeetButton=findViewById(R.id.createMeet);
        shareButton=findViewById(R.id.shareButton);
    }
}