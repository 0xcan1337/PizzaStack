package com.example.myapplication;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KartBilgiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public KartBilgiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is kartbilgi");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

