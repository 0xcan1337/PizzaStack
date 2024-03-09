package com.example.myapplication.ui.login;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.DatabaseHelper;
import com.example.myapplication.databinding.FragmentLoginBinding;

import com.example.myapplication.R;
import com.example.myapplication.ui.BlankFragment;
import com.example.myapplication.ui.Profilim;
import com.example.myapplication.ui.dashboard.DashboardFragment;
import com.example.myapplication.ui.home.HomeFragment;
import com.example.myapplication.ui.login.LoginFragment;
import com.example.myapplication.ui.BlankViewModel;


public class LoginFragment extends Fragment {

    private LoginViewModel loginViewModel;
    private FragmentLoginBinding binding;


    private DatabaseHelper dbHelper;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loginViewModel = new ViewModelProvider(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);

        final EditText usernameEditText = binding.username;
        final EditText passwordEditText = binding.password;
        final Button loginButton = binding.login;
        final Button registerButton= binding.login2;




        dbHelper = DatabaseHelper.getInstance(requireContext());



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kullaniciAdi = usernameEditText.getText().toString().trim();
                String sifre = passwordEditText.getText().toString().trim();

                if (TextUtils.isEmpty(kullaniciAdi) || TextUtils.isEmpty(sifre)) {

                } else {
                    kullaniciGiris(kullaniciAdi, sifre);
                }
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment fragment = new BlankFragment();

                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack("RegisterFragmentTag");
                transaction.commit();
            }
        });



    }



    private void kullaniciGiris(String kullaniciAdi, String sifre) {


        boolean girisDurumu = dbHelper.kullaniciGiris(kullaniciAdi, sifre);
        if (girisDurumu) {
            Toast.makeText(getContext(), "Hoş geldin " + kullaniciAdi + "!", Toast.LENGTH_SHORT).show();

            Profilim fragment = new Profilim();
            FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, fragment);
            transaction.addToBackStack("SettingsFragmentTag");
            transaction.commit();

            SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("username", kullaniciAdi); //
            editor.apply();

        } else {
            Toast.makeText(getContext(), "Kullanıcı adı veya şifre hatalı", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}