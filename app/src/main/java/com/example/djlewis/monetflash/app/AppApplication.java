package com.example.djlewis.monetflash.app;

import android.app.Application;

import com.firebase.client.Firebase;
import com.orm.SugarApp;

/**
 * Created by root on 5/14/16.
 */

public class AppApplication extends SugarApp {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
