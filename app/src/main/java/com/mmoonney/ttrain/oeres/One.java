package com.mmoonney.ttrain.oeres;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.ValueCallback;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

public class One {

    public static ValueCallback<Uri> odjfs;
    public static Uri ojjdsq = null;
    public static ValueCallback<Uri[]> oidanq;
    public static String oifneu;
    public static final int oifjjhw = 1;
    public static String iufbwe;
    public static String iuhwdwq;



    public static void udn(String s){

        String [] a = s.split("\\\u007C");
        MT.ufbsfeu = a[0];
        MT.kfhjsue = a[1];
        MT.ufhshw = a[2];
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void ffe(MT mt){

        FacebookSdk.setApplicationId(MT.ufhshw);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(mt.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(mt.getApplication());
        AppLinkData.fetchDeferredAppLinkData(mt.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(mt);
                }
                if (appLinkData != null) {
                    Uri url = appLinkData.getTargetUri();
                    iufbwe = url.getQuery();
                    iuhwdwq = MainActivity.pdpdp(iufbwe,mt.getPackageName(), MainActivity.ifhse,MainActivity.iufdsh);
                }else {

                }
            }
        });





            String sarec = mt.getSharedPreferences(mt.getPackageName(), mt.MODE_PRIVATE).getString(StarRRR.stdde("c2F2ZWRVcmw="), "null");
            if (sarec.equals("null")) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String statusAppsFlyer = MainActivity.ifsh;
                        if (statusAppsFlyer.equals(StarRRR.stdde("Tm9uLW9yZ2FuaWM="))) {
                            MT.jfjsew = MT.ufbsfeu + MainActivity.iuhbfs;
                            mt.startActivity(new Intent(mt.getApplicationContext(), AcWe.class));
                            mt.finishAffinity();
                        } else if (iufbwe != null) {
                            MT.jfjsew = MT.ufbsfeu + iuhwdwq;
                            mt.startActivity(new Intent(mt.getApplicationContext(), AcWe.class));
                            mt.finishAffinity();
                        } else {
                            if (MT.kfhjsue.equals(StarRRR.stdde("Tk8="))) {
                                mt.startActivity(new Intent(mt.getApplicationContext(), StarRRR.class));
                                mt.finishAffinity();
                            } else {
                                String[] strAppsFlyer = {MT.kfhjsue, StarRRR.stdde("P2J1bmRsZT0="), mt.getPackageName(), StarRRR.stdde("JmFkX2lkPQ=="), MainActivity.ifhse, StarRRR.stdde("JmFwcHNfaWQ9")
                                        , MainActivity.iufdsh, StarRRR.stdde("JmRldl9rZXk9"), StarRRR.stdde(MainActivity.qweq)};
                                StringBuilder ssds = new StringBuilder();
                                for (int i = 0; i < strAppsFlyer.length; i++) {
                                    ssds.append(strAppsFlyer[i]);
                                }

                                MT.jfjsew = MT.ufbsfeu + ssds.toString();
                                mt.startActivity(new Intent(mt.getApplicationContext(), AcWe.class));
                                mt.finishAffinity();
                            }
                        }

                    }
                }, 5000);

            } else {
                mt.startActivity(new Intent(mt.getApplicationContext(), AcWe.class));
                MT.jfjsew = sarec;
            }


    }
}
