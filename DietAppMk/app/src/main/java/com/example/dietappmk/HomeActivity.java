package com.example.dietappmk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


    }

    public void jumpToBmi(View view) {
        Intent i = new Intent(HomeActivity.this, BMIActivity.class);
        startActivity(i);

    }

    public void addDetail(View view) {
        Intent i = new Intent(HomeActivity.this, AddDetailActivity.class);
        startActivity(i);

    }

    public void appointment(View view) {
        Intent i = new Intent(HomeActivity.this, AppointmentActivity.class);
        startActivity(i);

    }

    public void headAche(View view) {
        Intent i = new Intent(HomeActivity.this, HeadacheActivity.class);
        startActivity(i);
    }

    public void weightGain(View view) {
        Intent i = new Intent(HomeActivity.this, WeightGainActivity.class);
        startActivity(i);
    }

    public void weightLoss(View view) {
        Intent i = new Intent(HomeActivity.this, WeightLossActivity.class);
        startActivity(i);
    }

}
