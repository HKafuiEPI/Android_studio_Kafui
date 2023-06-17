package com.example.benin_e_gouvernance;

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
        EditText first_name = (EditText) findViewById(R.id.first_name);
        EditText last_name = (EditText) findViewById(R.id.last_name);
        EditText age = (EditText) findViewById(R.id.age);
        EditText address = (EditText) findViewById(R.id.adress);
        EditText number = (EditText) findViewById(R.id.telephone);
        MaterialButton save_exit = (MaterialButton) findViewById(R.id.save_exit);
        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty()) {
                    username.setError("Username is required");
                }
            }
        });

        first_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_name.getText().toString().isEmpty()) {
                    first_name.setError("First name is required");
                }
            }
        });

        last_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (last_name.getText().toString().isEmpty()) {
                    last_name.setError("Last name is required");
                }
            }
        });

        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (age.getText().toString().isEmpty()) {
                    age.setError("Age is required");
                }else if (age.getText().length() > 4 && age.getText().length() < 1){
                    age.setError("Please enter a reasonable age");
                }
            }
        });

        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (address.getText().toString().isEmpty()) {
                    address.setError("Address is required");
                }
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number.getText().toString().isEmpty()) {
                    number.setError("Number is required");
                }else if (number.getText().length() != 8){
                    number.setError("You need eight digits");
                }
            }
        });

        save_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Validate the input fields
                if (first_name.getText().toString().isEmpty()) {
                    first_name.setError("First name is required");
                } else if (last_name.getText().toString().isEmpty()) {
                    last_name.setError("Last name is required");
                } else if (age.getText().toString().isEmpty()) {
                    age.setError("Age is required");
                } else if (address.getText().toString().isEmpty()) {
                    address.setError("Address is required");
                }else if (number.getText().toString().isEmpty()) {
                    number.setError("Telephone number is required");
                } else {
                    startActivity(new Intent(MainActivity3.this,MainActivity4.class));
                }
            }
        });

    }
}