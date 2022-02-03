package com.mmoonney.ttrain.oeres;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.onesignal.OneSignal;

public class AMT extends Application {


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        jfd();
        StarRRR.idk(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void jfd(){
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(StarRRR.stdde("Yzk0OTYzNzMtNTAzOC00ZGNiLWJjNDYtNGEyNDExZjE3OTBj"));
    }
}
