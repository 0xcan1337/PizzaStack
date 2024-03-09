package com.example.myapplication.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.ui.dashboard.DashboardFragment;


public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;



        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            HomeViewModel homeViewModel =
                    new ViewModelProvider(this).get(HomeViewModel.class);






            binding = FragmentHomeBinding.inflate(inflater, container, false);
            View root = binding.getRoot();







            return root;
        }




    }








