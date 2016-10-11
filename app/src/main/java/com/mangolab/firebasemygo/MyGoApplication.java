package com.mangolab.firebasemygo;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by rajforhad on 16/8/16.
 */
public class MyGoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }

}