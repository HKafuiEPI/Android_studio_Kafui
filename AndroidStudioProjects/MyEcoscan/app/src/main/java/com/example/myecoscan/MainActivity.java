package com.example.myecoscan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        TextView cpassword = (TextView) findViewById(R.id.cpassword);
        TextView email = (TextView) findViewById(R.id.email);
        MaterialButton register = (MaterialButton) findViewById(R.id.registerbutton);
        MaterialButton signinlog = (MaterialButton) findViewById(R.id.signinlog);
        signinlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
    }

    public void openMain(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}