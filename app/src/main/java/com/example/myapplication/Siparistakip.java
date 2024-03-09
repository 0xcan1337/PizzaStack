package com.example.myapplication;


import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.ui.notifications.NotificationsFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Siparistakip#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Siparistakip extends Fragment {

    // TODO: Rename parameter arguments, choose names that match

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

String fakedata;

    private SharedViewModel sharedViewModel;
    private TextView siparisbilgi1,siparisbilgi2,siparisbilgi3,siparisbilgi4, siparisbilgi5, siparisbilgi6, siparisbilgi7, siparisbilgi8, siparisbilgi9, siparisbilgi10, siparisbilgi11,test, siparisbilgi12;


    public Siparistakip() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Siparistakip.
     */
    // TODO: Rename and change types and number of parameters
    public static Siparistakip newInstance(String param1, String param2) {
        Siparistakip fragment = new Siparistakip();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_siparistakip, container, false);









        return view;




    }



}



