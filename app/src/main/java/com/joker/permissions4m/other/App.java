package com.joker.permissions4m.other;

import android.app.Application;
import android.content.Context;

/**
 * Created by joker on 2017/7/27.
 */

public class App extends Application {
    private static App instance;

    public static Context getAppContext() {
        return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
