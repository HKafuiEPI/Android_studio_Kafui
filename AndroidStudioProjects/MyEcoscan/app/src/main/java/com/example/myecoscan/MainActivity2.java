package com.example.myecoscan;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        username.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText userName = (EditText) findViewById(R.id.username);
                if( userName.getText().toString().length() == 0 )
                    userName.setError("First name is required!");
            }
        });
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText passWord = (EditText) findViewById(R.id.password);
                if(passWord.getText().toString().length() == 0)
                    passWord.setError("Password Required");
            }
        });
    }
}