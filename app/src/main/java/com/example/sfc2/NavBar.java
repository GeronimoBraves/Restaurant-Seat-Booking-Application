package com.example.sfc2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavBar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_bar);
//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
//        NavController navController = Navigation.findNavController(this,  R.id.fragmentContainerView);
//        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.bottom_nav, menu);

        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.menu2:

                startActivity(new Intent(this, Menu2.class));

                return true;

            case R.id.branches:

                startActivity(new Intent(this, Branches.class));

                return true;

            default:

                return super.onOptionsItemSelected(item);

        }
//respond to menu item selection

    }
}