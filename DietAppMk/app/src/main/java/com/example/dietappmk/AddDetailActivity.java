package com.example.dietappmk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_detail);
    }


    public void showDiet(View view) {
        Intent i = new Intent(AddDetailActivity.this, ShowDiet.class);
        startActivity(i);
    }

    public void detailedChart(View view) {
        Intent i = new Intent(AddDetailActivity.this, DetailedChartActivity.class);
        startActivity(i);

    }
}
