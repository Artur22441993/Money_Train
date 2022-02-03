package com.mmoonney.ttrain.oeres;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AcWe extends AppCompatActivity {

    WebView werds;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.acwe);
        AcWeWe.Wwweee.acWe = this;
        AcWeWe.Weewe.acWe = this;
        werds = findViewById(R.id.werds);
        werds.loadUrl(MT.jfjsew);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode != One.oifjjhw || One.oidanq == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (One.oifneu != null) {
                    results = new Uri[]{Uri.parse(One.oifneu)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        One.oidanq.onReceiveValue(results);
        One.oidanq = null;
        if (One.odjfs == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? One.ojjdsq : data.getData();
            }
        } catch (Exception e) { }
        One.odjfs.onReceiveValue(result);
        One.odjfs = null;
    }

    @Override
    public void onBackPressed() {
        if (StarRRR.bbb == false){
        if (werds.isFocused() && werds.canGoBack()) {
            werds.goBack();
        }}else {
            startActivity(new Intent(getApplicationContext(),StarRRR.class));
            finishAffinity();
            StarRRR.bbb = false;
        }
    }
}
