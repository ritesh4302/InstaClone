package com.thinkfoolishdosmart.ritesh.instaclone;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;

public class StarterApplication extends Application {

    public static final String TAG = StarterApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();

        Log.i(TAG, "onCreate() called");

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("c55b7e3cfb02780bc3c57fa48eb4b44ed22936ea")
                .clientKey("20a9bcb9ad3f5f367416224af8937bda4bb0f30d")
                .server("http://34.219.144.143:80/parse/")
                .build()
        );
    }
}
