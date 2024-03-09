package com.example.myapplication.ui.notifications;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.DatabaseHelper;
import com.example.myapplication.KartBilgi;
import com.example.myapplication.R;
import com.example.myapplication.SharedViewModel;
import com.example.myapplication.Siparistakip;
import com.example.myapplication.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {




    String yanurunAdi, yanurunFiyat;

    Integer gecici=0;
    Integer toplam;
    Integer fakedata,tenders1=0,nugget1=0, sufle1=0, mozaik1=0, icecek1=0,icecek2=0, icecek3=0, icecek4=0, ortaboy=0, buyukboy=0;

    private FragmentNotificationsBinding binding;
    private DatabaseHelper dbHelper;


    private SharedViewModel sharedViewModel;


    @SuppressLint("Range")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView urunadi=binding.urunadi;
        final TextView urunack=binding.urunack;
        final TextView urunfiyat=binding.urunfiyat;
        final Spinner spinner=binding.spinner2;
        final Spinner spiner2=binding.spinner;
        final Button tenders=binding.tenders;
        final TextView yanurunadi=binding.yanurunadi;
        final TextView yanurunfiyat=binding.yanurunfiyat;
        final Button nugget=binding.nugget;
        final Button sufle= binding.sufle;
        final Button mozaik=binding.mozaik;
        final Button sepetonay=binding.sepetonay;
        final TextView yanurunadi2=binding.yanurunadi2;
        final TextView yanurunfiyat2=binding.yanurunfiyat2;
        final TextView yanurunadi3=binding.yanurunadi3;
        final TextView yanurunfiyat3=binding.yanurunfiyat3;
        final TextView yanurunadi4=binding.yanurunadi4;
        final TextView yanurunfiyat4=binding.yanurunfiyat4;
        final TextView sepettutar=binding.sepettutar;
        final TextView sepettutar1=binding.sepettutar1;








        dbHelper = DatabaseHelper.getInstance(requireContext());

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.menuler,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        adapter = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.boy,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner2.setAdapter(adapter);



     sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        sharedViewModel.getSharedData().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                 urunadi.setVisibility(View.VISIBLE);
                urunadi.setText(data);





            }
        });



        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        sharedViewModel.getSharedData1().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunfiyat.setVisibility(View.VISIBLE);
                urunfiyat.setText(data);




            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        sharedViewModel.getSharedData2().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunack.setVisibility(View.VISIBLE);
                urunack
                        .setText(data);
            }
        });



        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData3().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunadi.setVisibility(View.VISIBLE);
                urunadi.setText(data);


            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData5().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunack.setVisibility(View.VISIBLE);
                urunack
                        .setText(data);


            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData4().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunfiyat.setVisibility(View.VISIBLE);
                urunfiyat
                        .setText(data);


            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData6().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunadi.setVisibility(View.VISIBLE);
                urunadi
                        .setText(data);

            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData8().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunack.setVisibility(View.VISIBLE);
                urunack
                        .setText(data);
            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData7().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunfiyat.setVisibility(View.VISIBLE);
                urunfiyat
                        .setText(data);
            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData9().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunadi.setVisibility(View.VISIBLE);
                urunadi
                        .setText(data);
            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData11().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunack.setVisibility(View.VISIBLE);
                urunack
                        .setText(data);
            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData10().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunfiyat.setVisibility(View.VISIBLE);
                urunfiyat
                        .setText(data);
            }
        });
        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData12().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunadi.setVisibility(View.VISIBLE);
                urunadi
                        .setText(data);

            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData14().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunack.setVisibility(View.VISIBLE);
                urunack
                        .setText(data);
            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData13().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunfiyat.setVisibility(View.VISIBLE);
                urunfiyat
                        .setText(data);
            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData15().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunadi.setVisibility(View.VISIBLE);
                urunadi
                        .setText(data);

            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData17().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunack.setVisibility(View.VISIBLE);
                urunack
                        .setText(data);
            }
        });

        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        sharedViewModel.getSharedData16().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {

                urunfiyat.setVisibility(View.VISIBLE);
                urunfiyat
                        .setText(data);
            }
        });

        sharedViewModel.getTutarTut().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer data) {

                sepettutar.setText(String.valueOf(data));

                fakedata = data;
                sepettutar1.setText("" +fakedata);

            }
        });
        tenders.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
                Integer sonuc = fakedata + gecici;
                gecici = 25;
                sepettutar1.setText("" +sonuc);
                tenders1 = gecici;
                toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;

                sepettutar1.setText(String.valueOf(toplam));
                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_YANURUN + "", null);

                if (cursor.moveToFirst()) {
                    yanurunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.YANURUN_ADI));
                    yanurunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.YANURUN_FIYAT));

                    yanurunfiyat.setVisibility(View.VISIBLE);
                    yanurunfiyat.setText(yanurunFiyat);

                   yanurunadi.setVisibility(View.VISIBLE);
                    yanurunadi.setText(yanurunAdi);
                }

                cursor.close();
                db.close();
            }
        });

        nugget.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                Integer sonuc = fakedata + gecici;
                gecici =25;
                sepettutar1.setText("" +sonuc);
                nugget1 = gecici;
                toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;

                sepettutar1.setText(String.valueOf(toplam));


                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_YANURUN + " WHERE ID = 2", null);


                if (cursor.moveToFirst()) {
                    yanurunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.YANURUN_ADI));
                    yanurunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.YANURUN_FIYAT));

                    yanurunfiyat2.setVisibility(View.VISIBLE);
                    yanurunfiyat2.setText(yanurunFiyat);

                    yanurunadi2.setVisibility(View.VISIBLE);
                    yanurunadi2.setText(yanurunAdi);


                }

                cursor.close();
                db.close();
            }


        });

        sufle.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                Integer sonuc = fakedata + gecici;
                gecici =35;
                sepettutar1.setText("" +sonuc);
                sufle1 = gecici;
                toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;

                sepettutar1.setText(String.valueOf(toplam));

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_YANURUN + " WHERE ID = 3", null);


                if (cursor.moveToFirst()) {
                    yanurunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.YANURUN_ADI));
                    yanurunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.YANURUN_FIYAT));

                    yanurunfiyat3.setVisibility(View.VISIBLE);
                    yanurunfiyat3.setText(yanurunFiyat);

                    yanurunadi3.setVisibility(View.VISIBLE);
                    yanurunadi3.setText(yanurunAdi);


                }

                cursor.close();
                db.close();
            }


        });
     mozaik.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View v) {
                Integer sonuc = fakedata + gecici;
                gecici =35;
                sepettutar1.setText("" +sonuc);
                mozaik1 = gecici;
                toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;
                sepettutar1.setText(String.valueOf(toplam));

                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_YANURUN + " WHERE ID = 4", null);


                if (cursor.moveToFirst()) {
                    yanurunAdi = cursor.getString(cursor.getColumnIndex(DatabaseHelper.YANURUN_ADI));
                    yanurunFiyat = cursor.getString(cursor.getColumnIndex(DatabaseHelper.YANURUN_FIYAT));

                    yanurunfiyat4.setVisibility(View.VISIBLE);
                    yanurunfiyat4.setText(yanurunFiyat);

                    yanurunadi4.setVisibility(View.VISIBLE);
                    yanurunadi4.setText(yanurunAdi);




                }

                cursor.close();
                db.close();
            }


        });


     sepetonay.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             KartBilgi fragment = new KartBilgi();
             FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
             transaction.replace(R.id.container, fragment);
             transaction.addToBackStack(null);
             transaction.commit();
         }
     });


     spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             String selectedValue = parent.getItemAtPosition(position).toString();
             if (selectedValue.equals("Coco Cola(kutu) +25 TL")){
                 Integer sonuc = fakedata + gecici;
                 gecici =25;
                 sepettutar1.setText("" +sonuc);
                 icecek1 = gecici;
                 toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;
                 sepettutar1.setText(String.valueOf(toplam));

             }
             else if (selectedValue.equals("Coco Cola(1 lt) +45 TL")) {
                 Integer sonuc = fakedata + gecici;
                 gecici =45;
                 sepettutar1.setText("" +sonuc);
                 icecek2 = gecici;
                 toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;
                 sepettutar1.setText(String.valueOf(toplam));
             }
             else if (selectedValue.equals("Fanta(kutu) +25 TL")) {
                 Integer sonuc = fakedata + gecici;
                 gecici =25;
                 sepettutar1.setText("" +sonuc);
                 icecek3 = gecici;
                 toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;
                 sepettutar1.setText(String.valueOf(toplam));
             }
             else if (selectedValue.equals("Lipton Ice Tea(kutu) +20 TL")) {
                 Integer sonuc = fakedata + gecici;
                 gecici =20;
                 sepettutar1.setText("" +sonuc);
                 icecek4 = gecici;
                 toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;
                 sepettutar1.setText(String.valueOf(toplam));
             }



         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });

     spiner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             String selectedValue = parent.getItemAtPosition(position).toString();
             if (selectedValue.equals("Orta Boy +15 TL")){
                 Integer sonuc = fakedata + gecici;
                 gecici =15;
                 sepettutar1.setText("" +sonuc);
                 ortaboy = gecici;
                 toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;
                 sepettutar1.setText(String.valueOf(toplam));

             }
            else if (selectedValue.equals("Büyük Boy +40 TL")){
                 Integer sonuc = fakedata + gecici;
                 gecici =40;
                 sepettutar1.setText("" +sonuc);
                 buyukboy = gecici;
                 toplam = fakedata + tenders1 + nugget1 +sufle1+ mozaik1+icecek1 +icecek2+icecek3+icecek4+ ortaboy + buyukboy;
                 sepettutar1.setText(String.valueOf(toplam));

             }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });





        return root;
    }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}