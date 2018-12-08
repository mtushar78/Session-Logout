package com.example.tuhin.userinteraction;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.Log;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);


    }

    @Override
    public String getPackageName() {

      String procrss =  super.getPackageName();


        Log.d("myApplication",procrss);
        return super.getPackageName();
    }

    @Override
    public PackageManager getPackageManager() {
        return super.getPackageManager();
    }
}
