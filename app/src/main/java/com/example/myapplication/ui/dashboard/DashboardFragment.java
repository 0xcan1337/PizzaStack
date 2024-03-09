package com.example.myapplication.ui.dashboard;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.myapplication.DatabaseHelper;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.SharedViewModel;
import com.example.myapplication.databinding.FragmentDashboardBinding;
import com.example.myapplication.ui.notifications.NotificationsFragment;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardFragment extends Fragment {

    String urunAdi, urunFiyat, urunAck;

    private FragmentDashboardBinding binding;

    private DatabaseHelper dbHelper;

    Integer tutar=0;

    private SharedViewModel sharedViewModel;
    private int ekleme=1, sayac=0;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
   final Button pepporoni=binding.pepporoni;
   final Button festival=binding.festival;
   final Button sebze=binding.sebze;
   final Button xxl=binding.xxl;
   final Button donatello=binding.donatello;
   final Button raphael=binding.raphael;
   final ImageButton imageButton= binding.imageButton;
   final ImageButton imageButton1= binding.imageButton1;
   final ImageButton imageButton2= binding.imageButton2;
   final ImageButton imageButton3= binding.imageButton3;
   final ImageButton imageButton4= binding.imageButton4;
   final ImageButton imageButton5= binding.imageButton5;





        DatabaseHelper dbHelper = new DatabaseHelper((MainActivity) requireContext());
        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (ekleme >0){
                    sayac=ekleme*tutar;
                    ekleme++;
                }
                pepporoni.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("Range")
                    @Override
                    public void onClick(View v) {
                        tutar=tutar+190+sayac;
                        sharedViewModel.updateDataForFirstButton();
                        sharedViewModel.tutartutbutonu(tutar);
                        navigateToSecondFragment();

                        SQLiteDatabase db = dbHelper.getReadableDatabase();
                        Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + "", null);

                        if (cursor.moveToFirst()) {
                            urunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ADI));
                            urunAck = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ACK));
                            urunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_FIYAT));
                            sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
                            sharedViewModel.setSharedData(urunAdi);
                            sharedViewModel.setSharedData1(urunAck);
                            sharedViewModel.setSharedData2(urunFiyat);
                        }
                        cursor.close();
                        db.close();
                    }
                });

            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (ekleme >0){
                    sayac=ekleme*tutar;
                    ekleme++;

                }
        festival.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                tutar=tutar+190;
                sharedViewModel.updateDataForSecondButton();
                sharedViewModel.tutartutbutonu(tutar);
                navigateToSecondFragment();

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE ID = 2", null);


                if (cursor.moveToFirst()) {
                    urunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ADI));
                    urunAck = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ACK));
                    urunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_FIYAT));
                    sharedViewModel.setSharedData3(urunAdi);
                    sharedViewModel.setSharedData4(urunAck);
                    sharedViewModel.setSharedData5(urunFiyat);

                }

                cursor.close();
                db.close();
            }



        });

            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (ekleme >0){
                    sayac=ekleme*tutar;
                    ekleme++;

                }
        sebze.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                tutar= tutar +190;
                sharedViewModel.updateDataForThreeButton();
                sharedViewModel.tutartutbutonu(tutar);
                navigateToSecondFragment();
                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE ID = 3", null);


                if (cursor.moveToFirst()) {
                    urunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ADI));
                    urunAck = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ACK));
                    urunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_FIYAT));
                    sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
                    sharedViewModel.setSharedData6(urunAdi);
                    sharedViewModel.setSharedData7(urunAck);
                    sharedViewModel.setSharedData8(urunFiyat);

                }

                cursor.close();
                db.close();
            }



        });

            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (ekleme >0){
                    sayac=ekleme*tutar;
                    ekleme++;

                }

        xxl.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                tutar=tutar+250;
                sharedViewModel.updateDataForFourButton();
                sharedViewModel.tutartutbutonu(tutar);

                navigateToSecondFragment();

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE ID = 4", null);


                if (cursor.moveToFirst()) {
                    urunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ADI));
                    urunAck = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ACK));
                    urunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_FIYAT));
                    sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
                    sharedViewModel.setSharedData9(urunAdi);
                    sharedViewModel.setSharedData10(urunAck);
                    sharedViewModel.setSharedData11(urunFiyat);

                }

                cursor.close();
                db.close();
            }



        });

            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (ekleme >0){
                    sayac=ekleme*tutar;
                    ekleme++;

                }
        donatello.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                tutar=tutar+250;
                sharedViewModel.updateDataForFiveButton();
                sharedViewModel.tutartutbutonu(tutar);

                navigateToSecondFragment();

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE ID = 5", null);


                if (cursor.moveToFirst()) {
                    urunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ADI));
                    urunAck = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ACK));
                    urunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_FIYAT));
                    sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
                    sharedViewModel.setSharedData12(urunAdi);
                    sharedViewModel.setSharedData13(urunAck);
                    sharedViewModel.setSharedData14(urunFiyat);

                }

                cursor.close();
                db.close();
            }



        });

            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (ekleme >0){
                    sayac=ekleme*tutar;
                    ekleme++;

                }
        raphael.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                tutar=tutar+250;
                sharedViewModel.updateDataForSixButton();
                sharedViewModel.tutartutbutonu(tutar);
                navigateToSecondFragment();

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE ID = 6", null);


                if (cursor.moveToFirst()) {
                    urunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ADI));
                    urunAck = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_ACK));
                    urunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_URUN_FIYAT));
                    sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);



                    sharedViewModel.setSharedData15(urunAdi);
                    sharedViewModel.setSharedData16(urunAck);
                    sharedViewModel.setSharedData17(urunFiyat);

                }

                cursor.close();
                db.close();
            }



        });

            }
        });





        return root;
    }

    private void navigateToSecondFragment() {
        NotificationsFragment fragment = new NotificationsFragment();
        FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}

