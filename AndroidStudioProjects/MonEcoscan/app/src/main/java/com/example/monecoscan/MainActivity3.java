package com.example.monecoscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        MaterialButton login = (MaterialButton) findViewById(R.id.loginbutton);
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
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Validate the input fields
                if (username.getText().toString().isEmpty()) {
                    username.setError("Username is required");
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("Password is required");
                } else {
                    startActivity(new Intent(MainActivity3.this,MainActivity4.class));
                }
            }
        });
    }
}