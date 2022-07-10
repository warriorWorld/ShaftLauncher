package com.harbinger.shaft;

import android.app.Application;

import com.zh.pocket.PocketSdk;


/**
 * Created by acorn on 2022/7/10.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //TODO 获取AppID
        PocketSdk.initSDK(this, "common", "1");
    }
}
