package com.example.myapplication.ui.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;

import com.example.myapplication.ui.data.HomeDataSource;
import com.example.myapplication.ui.data.HomeRepository;

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
public class HomeViewModelFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(HomeViewModel.class)) {
            MutableLiveData<String> mText = null;
            return (T) new HomeViewModel(HomeRepository.getInstance(new HomeDataSource()), mText);
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}