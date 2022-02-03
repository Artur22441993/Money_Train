package com.mmoonney.ttrain.oeres;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ncorti.slidetoact.SlideToActView;

import java.util.Base64;
import java.util.Map;

public class StarRRR extends AppCompatActivity {


    public static boolean bbb = false;
    public SlideToActView exampleCL,exampleST,examplePL;
    public static int sd = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.str);


        exampleCL = (SlideToActView) findViewById(R.id.exampleCL);
        exampleCL.setAnimDuration(500);
        exampleST = (SlideToActView) findViewById(R.id.exampleST);

        exampleST.setAnimDuration(500);
        examplePL = (SlideToActView) findViewById(R.id.examplePL);

        examplePL.setAnimDuration(500);

        exampleST.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finishAffinity();
            }
        });

        examplePL.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                startActivity(new Intent(getApplicationContext(),AcWe.class));
                MT.jfjsew = StarRRR.stdde("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49NDhzdWh3Q3VvTGNIeDRJZkhmMkRqeGxGbmhBUUxnS1E=");
                bbb = true;

            }
        });

        exampleCL.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(@NonNull SlideToActView slideToActView) {
                finishAffinity();
            }
        });
    }

    public static void set(AcWeWe acWeWe){
        CookieManager.getInstance().setAcceptThirdPartyCookies(acWeWe, true);
        CookieManager.getInstance().setAcceptCookie(true);
        acWeWe.getSettings().setAllowFileAccessFromFileURLs(true);
        acWeWe.getSettings().setSavePassword(true);
        acWeWe.getSettings().setDatabaseEnabled(true);
        acWeWe.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        acWeWe.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        acWeWe.getSettings().setAppCacheEnabled(true);
        acWeWe.getSettings().setLoadsImagesAutomatically(true);
        acWeWe.setSaveEnabled(true);
        acWeWe.getSettings().setMixedContentMode(0);
        acWeWe.setFocusable(true);
        acWeWe.getSettings().setAllowUniversalAccessFromFileURLs(true);
        acWeWe.getSettings().setJavaScriptEnabled(true);
        acWeWe.getSettings().setAllowContentAccess(true);
        acWeWe.getSettings().setLoadWithOverviewMode(true);
        acWeWe.getSettings().setEnableSmoothTransition(true);
        acWeWe.getSettings().setUseWideViewPort(true);
        acWeWe.getSettings().setSaveFormData(true);
        acWeWe.getSettings().setAllowFileAccess(true);
        acWeWe.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        acWeWe.getSettings().setDomStorageEnabled(true);
        acWeWe.setFocusableInTouchMode(true);

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String stdde(String idns){
        Base64.Decoder uds = Base64.getDecoder();
        String idnad = new String(uds.decode(idns));
        return idnad;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void idk(AMT amt){

        MainActivity.iufdsh = AppsFlyerLib.getInstance().getAppsFlyerUID(amt.getApplicationContext());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    MainActivity.ifhse = AdvertisingIdClient.getAdvertisingIdInfo(amt.getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();


        AppsFlyerLib.getInstance().init(stdde(MainActivity.qweq), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                MainActivity.ifsh = map.get(stdde("YWZfc3RhdHVz")).toString();
                if (MainActivity.ifsh.equals(stdde("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(stdde("Y2FtcGFpZ24=")).toString();
                    MainActivity.iuhbfs = MainActivity.pdpdp(str,amt.getPackageName(),MainActivity.ifhse,MainActivity.iufdsh);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },amt.getApplicationContext());
        AppsFlyerLib.getInstance().start(amt.getApplicationContext());

    }
}
