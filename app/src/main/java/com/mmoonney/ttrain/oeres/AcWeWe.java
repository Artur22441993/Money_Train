package com.mmoonney.ttrain.oeres;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class AcWeWe extends WebView {
    public AcWeWe(@NonNull Context context) {
        super(context);
    }

    public AcWeWe(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        StarRRR.set(this);
        this.setWebViewClient(new Wwweee());
        this.setWebChromeClient(new Weewe());
    }

    static class Wwweee extends WebViewClient{

        public static MT mt;
        @SuppressLint("StaticFieldLeak")
        public static AcWe acWe;

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            if (StarRRR.bbb == false){
                mt.getSharedPreferences(mt.getPackageName(), mt.MODE_PRIVATE).edit().putString(StarRRR.stdde("c2F2ZWRVcmw="), url).apply();
            }else {
            }

        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if(url.contains(StarRRR.stdde("NDA0"))){
                acWe.startActivity(new Intent(acWe.getApplicationContext(), StarRRR.class));
                acWe.finishAffinity();
            }
        }
    }

    static class Weewe extends WebChromeClient{

        @SuppressLint("StaticFieldLeak")
        public static AcWe acWe;

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> filePath,
                                         FileChooserParams fileChooserParams) {
            if (One.oidanq != null) {
                One.oidanq.onReceiveValue(null);
            }
            One.oidanq = filePath;
            Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
            contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
            contentSelectionIntent.setType("*/*");
            Intent[] intentArray = new Intent[0];
            Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
            chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
            chooserIntent.putExtra(Intent.EXTRA_TITLE, StarRRR.stdde("U2VsZWN0IE9wdGlvbjo="));
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
            acWe.startActivityForResult(chooserIntent, 1);
            return true;
        }
    }
}
