package com.example.benin_e_gouvernance;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText username = (EditText) findViewById(R.id.edit_username);
        EditText password = (EditText) findViewById(R.id.edit_password);
        MaterialButton sign = (MaterialButton) findViewById(R.id.btn_go_to_sign_in);
        MaterialButton signup = (MaterialButton) findViewById(R.id.btn_to_signup);
        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty()) {
                    username.setError("Username is required");
                }
            }
        });
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().isEmpty()) {
                    password.setError("Password is required");
                }
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Validate the input fields
                if (username.getText().toString().isEmpty()) {
                    username.setError("Username is required");
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("Password is required");
                } else {
                    startActivity(new Intent(MainActivity2.this,MainActivity3.class));
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });

    }
}