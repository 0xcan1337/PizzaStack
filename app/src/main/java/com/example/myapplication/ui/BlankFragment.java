package com.example.myapplication.ui;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.DatabaseHelper;
import com.example.myapplication.R;

public class BlankFragment extends Fragment {

    private DatabaseHelper dbHelper;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);

        EditText editTextUsername = view.findViewById(R.id.editTextUsername);
        EditText editTextPassword = view.findViewById(R.id.editTextPassword);
        EditText editTextMail = view.findViewById(R.id.editTextEmail);
        EditText editTextPhone=view.findViewById(R.id.editTextPhone);
        EditText editTextAdres=view.findViewById(R.id.editTextAdres);
        Button buttonRegister = view.findViewById(R.id.buttonRegister);
        dbHelper = DatabaseHelper.getInstance(requireContext());

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                String mail = editTextMail.getText().toString().trim();
                String phone = editTextPhone.getText().toString().trim();
                String adres = editTextAdres.getText().toString().trim();

                boolean success = dbHelper.addUser(username, password, mail, phone, adres);

                if (isValidPassword(password)) {
                    Toast.makeText(requireContext(), "Kullanıcı başarıyla kaydedildi", Toast.LENGTH_SHORT).show();

                    Profilim fragment = new Profilim();

                    FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.container, fragment); //
                    transaction.addToBackStack("ProfilimFragmentTag");
                    transaction.commit();


                    SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", username);
                    editor.apply();


                    SharedPreferences test = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                    SharedPreferences.Editor tested = sharedPreferences.edit();
                    editor.putString("mail", mail); //
                    editor.apply();

                    SharedPreferences phones = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                    SharedPreferences.Editor phone1 = sharedPreferences.edit();
                    editor.putString("phone", phone);
                    editor.apply();

                    SharedPreferences adress = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                    SharedPreferences.Editor adres1 = sharedPreferences.edit();
                    editor.putString("adres", adres);
                    editor.apply();

                    SharedPreferences passwd = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                    SharedPreferences.Editor passwd1 = sharedPreferences.edit();
                    editor.putString("passwd", password);
                    editor.apply();

                } else {
                    Toast.makeText(requireContext(), "Şifre en az bir büyük harf içermeli ve en az 4 karakter olmalı!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    private boolean isValidPassword(String sifre) {

        if (sifre.length() < 4) {
            return false;
        }


        boolean sifrekontrol = !sifre.equals(sifre.toLowerCase());

        return sifrekontrol;
    }




}