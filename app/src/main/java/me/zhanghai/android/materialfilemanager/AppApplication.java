/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.materialfilemanager;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.jakewharton.threetenabp.AndroidThreeTen;

import eu.chainfire.libsuperuser.Debug;

public class AppApplication extends Application {

    private static AppApplication sInstance;

    public AppApplication() {
        sInstance = this;
    }

    public static AppApplication getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Debug.setDebug(true);
        }

        // TODO
        //NightModeHelper.setup(this);

        AndroidThreeTen.init(this);
        //FabricUtils.init(this);
        Stetho.initializeWithDefaults(this);
    }
}