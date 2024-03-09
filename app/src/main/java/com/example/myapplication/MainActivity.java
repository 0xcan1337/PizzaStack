package com.example.myapplication;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.ui.dashboard.DashboardFragment;
import com.example.myapplication.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {




    private ActivityMainBinding binding;

  private ImageView pizza1, pizza2, pizza3, kampanya, yanurun, menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
        pizza1 = findViewById(R.id.pizza1);
        pizza2 = findViewById(R.id.pizza2);
        pizza3 = findViewById(R.id.pizza3);
        kampanya = findViewById(R.id.kampanya);
        yanurun = findViewById(R.id.yanurun);
        menu = findViewById(R.id.menu);


        pizza1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siparisver2 fragment = new siparisver2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack("DashboardFragmentTag");
                transaction.commitAllowingStateLoss();
            }
        });

        pizza2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siparisver2 fragment = new siparisver2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack("DashboardFragmentTag");
                transaction.commitAllowingStateLoss();
            }
        });
        pizza3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siparisver2 fragment = new siparisver2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack("DashboardFragmentTag");
                transaction.commitAllowingStateLoss();
            }
        });
        yanurun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siparisver2 fragment = new siparisver2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack("DashboardFragmentTag");
                transaction.commitAllowingStateLoss();
            }
        });
        kampanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siparisver2 fragment = new siparisver2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack("DashboardFragmentTag");
                transaction.commitAllowingStateLoss();
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siparisver2 fragment = new siparisver2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack("DashboardFragmentTag");
                transaction.commitAllowingStateLoss();
            }
        });



    }
    }




