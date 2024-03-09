package com.example.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.ui.data.HomeRepository;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public HomeViewModel(HomeRepository instance, MutableLiveData<String> mText) {

        this.mText = mText;
    }

    public LiveData<String> getText() {
        return mText;
    }
}