package com.batchmates.android.fistofflurry;

import android.app.Application;

import com.flurry.android.FlurryAgent;

/**
 * Created by Android on 7/25/2017.
 */

public class ApplicationDerp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "8G8HYM7RVHS5NBD4P4GY");
    }
}
