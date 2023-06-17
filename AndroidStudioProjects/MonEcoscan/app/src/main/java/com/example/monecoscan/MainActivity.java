package com.example.monecoscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private EditText mConfirmPasswordEditText;
    private EditText mEmailEditText;
    private MaterialButton mRegisterButton;
    private MaterialButton mSignInLogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameEditText = findViewById(R.id.username);
        mPasswordEditText = findViewById(R.id.password);
        mConfirmPasswordEditText = findViewById(R.id.cpassword);
        mEmailEditText = findViewById(R.id.email);
        mRegisterButton = findViewById(R.id.registerbutton);
        mSignInLogButton = findViewById(R.id.signinlog);

        mUsernameEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mUsernameEditText.getText().toString().isEmpty()) {
                    mUsernameEditText.setError("Username is required");
                }
            }
        });

        mPasswordEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPasswordEditText.getText().toString().isEmpty()) {
                    mPasswordEditText.setError("Password is required");
                }
            }
        });

        mConfirmPasswordEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mConfirmPasswordEditText.getText().toString().isEmpty()) {
                    mConfirmPasswordEditText.setError("Confirm your password");
                }
            }
        });

        mSignInLogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Validate the input fields
                if (mUsernameEditText.getText().toString().isEmpty()) {
                    mUsernameEditText.setError("Username is required");
                } else if (mPasswordEditText.getText().toString().isEmpty()) {
                    mPasswordEditText.setError("Password is required");
                } else if (mConfirmPasswordEditText.getText().toString().isEmpty()) {
                    mConfirmPasswordEditText.setError("Confirm your password");
                } else if (!mPasswordEditText.getText().toString().equals(mConfirmPasswordEditText.getText().toString())) {
                    mConfirmPasswordEditText.setError("Passwords do not match");
                } else if (mEmailEditText.getText().toString().isEmpty()) {
                    mEmailEditText.setError("Email is required");
                } else {
                    // Input is valid, redirect to the next page
                    startActivity(new Intent(MainActivity.this,MainActivity3.class));
                }
            }
        });

    }
}
