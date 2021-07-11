package com.example.votingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText username,vcnum;
    Button login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindViews();
        clickListener();
    }

    private void clickListener() {

    }

    private void bindViews() {
        username = (TextInputEditText) findViewById(R.id.username);
        vcnum = (TextInputEditText) findViewById(R.id.vcnum);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
    }
}