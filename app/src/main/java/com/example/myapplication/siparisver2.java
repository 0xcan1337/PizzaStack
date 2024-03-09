package com.example.myapplication;

import static java.security.AccessController.getContext;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;


import com.example.myapplication.databinding.FragmentSiparisver2Binding;
import com.example.myapplication.siparisver2ViewModel;
import com.example.myapplication.ui.login.LoginFragment;


public class siparisver2 extends Fragment

{

    private Button sebze1, festival, donatello, xxl, raphael, pepperoni;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_siparisver2, container, false);



        sebze1=view.findViewById(R.id.sebze1);
        donatello=view.findViewById(R.id.donatello);
        festival=view.findViewById(R.id.festival);
        raphael=view.findViewById(R.id.raphael);
        xxl=view.findViewById(R.id.xxl);
        pepperoni=view.findViewById(R.id.pepporoni);


        sebze1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginFragment fragment = new LoginFragment();
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();

                Toast.makeText(getContext(), "Sepetinizi görüntülemek için giriş yapınız.", Toast.LENGTH_SHORT).show();


            }
        });
        festival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginFragment fragment = new LoginFragment();
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();

                Toast.makeText(getContext(), "Sepetinizi görüntülemek için giriş yapınız.", Toast.LENGTH_SHORT).show();


            }
        });
        donatello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginFragment fragment = new LoginFragment();
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();

                Toast.makeText(getContext(), "Sepetinizi görüntülemek için giriş yapınız.", Toast.LENGTH_SHORT).show();


            }
        });

        raphael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginFragment fragment = new LoginFragment();
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();

                Toast.makeText(getContext(), "Sepetinizi görüntülemek için giriş yapınız.", Toast.LENGTH_SHORT).show();


            }
        });
        xxl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginFragment fragment = new LoginFragment();
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();

                Toast.makeText(getContext(), "Sepetinizi görüntülemek için giriş yapınız.", Toast.LENGTH_SHORT).show();


            }
        });

        pepperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginFragment fragment = new LoginFragment();
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();

                Toast.makeText(getContext(), "Sepetinizi görüntülemek için giriş yapınız.", Toast.LENGTH_SHORT).show();


            }
        });




        return view;
}




}