package com.example.myapplication.ui.data;

import com.example.myapplication.ui.data.model.LoggedInUser;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class HomeRepository {

    private static volatile HomeRepository instance;

    private HomeDataSource dataSource;

    // If user credentials will be cached in local storage, it is recommended it be encrypted
    // @see https://developer.android.com/training/articles/keystore
    private LoggedInUser user = null;

    private HomeRepository(HomeDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static HomeRepository getInstance(HomeDataSource dataSource) {
        if (instance == null) {
            instance = new HomeRepository(dataSource);
        }
        return instance;
    }






}