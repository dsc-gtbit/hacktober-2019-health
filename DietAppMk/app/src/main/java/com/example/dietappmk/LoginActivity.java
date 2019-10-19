package com.example.dietappmk;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView emailTextView=findViewById(R.id.email);
        TextView passwordTextView=findViewById(R.id.password);

    }

    public void signInBtn(View view) {

        Intent i = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(i);

    }
}
