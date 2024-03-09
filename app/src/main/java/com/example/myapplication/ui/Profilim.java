package com.example.myapplication.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.BlankFragment;
import com.example.myapplication.DatabaseHelper;
import com.example.myapplication.R;
import com.example.myapplication.ui.dashboard.DashboardFragment;
import com.example.myapplication.ui.login.LoginFragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Profilim#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Profilim extends Fragment {

    // TODO: Rename parameter arguments, choose names that match

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button siparisdevam;

    private DatabaseHelper dbHelper;

    private TextView textViewUserValue,textViewEmailValue,textViewPhoneValue,textViewAdresValue,textViewPasswordValue;

    public Profilim() {


    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Profilim.
     */
    // TODO: Rename and change types and number of parameters
    public static Profilim newInstance(String param1, String param2) {
        Profilim fragment = new Profilim();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);





        }
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profilim, container, false);
        textViewUserValue = view.findViewById(R.id.textViewUserValue);
        textViewEmailValue = view.findViewById(R.id.textViewEmailValue);
        textViewPhoneValue= view.findViewById(R.id.textViewPhoneValue);
        textViewAdresValue= view.findViewById(R.id.textViewAdresValue);

        textViewPasswordValue=view.findViewById(R.id.textViewPasswordValue);
        siparisdevam=view.findViewById(R.id.siparidevam);
        dbHelper = DatabaseHelper.getInstance(requireContext());
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String storedUsername = sharedPreferences.getString("username", "Kullanıcı adı eklemediniz.");

        textViewUserValue.setText(storedUsername);


        SharedPreferences test = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String storedmail = test.getString("mail", "Mail eklemediniz.");




        textViewEmailValue.setText(storedmail);

        SharedPreferences phones = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String storedphone = phones.getString("phone", "Telefon numarası eklemediniz.");


        textViewPhoneValue.setText(storedphone);


        SharedPreferences adress = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String storedadres = adress.getString("adres", "Adres eklemediniz.");


        textViewAdresValue.setText(storedadres);

        SharedPreferences passwd = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String storedpasswd = passwd.getString("passwd", "********");

        textViewPasswordValue.setText("************");



          siparisdevam.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DashboardFragment newFragment = new DashboardFragment();

        fragmentTransaction.replace(R.id.container, newFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
});




        return view;
    }


    }

