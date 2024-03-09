package com.example.myapplication;


import androidx.lifecycle.LiveData;
        import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.ViewModel;

public class siparisver2ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public siparisver2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is siparisver2");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

