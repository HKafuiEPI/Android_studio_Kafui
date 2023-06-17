package com.example.benin_e_gouvernance;


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

        mUsernameEditText = findViewById(R.id.edit_username);
        mPasswordEditText = findViewById(R.id.edit_password);
        mConfirmPasswordEditText = findViewById(R.id.confirm_password);
        mEmailEditText = findViewById(R.id.edit_email);
        mRegisterButton = findViewById(R.id.btn_register);
        mSignInLogButton = findViewById(R.id.btn_go_to_sign);

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
                    startActivity(new Intent(MainActivity.this,MainActivity3.class));
                }
            }
        });

        mSignInLogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }
}