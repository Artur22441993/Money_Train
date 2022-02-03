package com.mmoonney.ttrain.oeres;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.onesignal.OneSignal;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView ifjsf;
    private TextView oifshw;
    private int p = 0;
    private int b= 0;
    private int c =0;
    private int a =0;
    public static String iufdsh;
    public static String ifsh = "";
    public static String ifhse;
    public static String iuhbfs;
    public static String qweq = "SHNnOVRNTWp3eTllN1dla0E2b2dTVg==";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        ifjsf = findViewById(R.id.imageView3);
        oifshw = findViewById(R.id.textView);

        ifjsf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Handler handler = new Handler();



                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Random random = new Random();
                        a = random.nextInt(30);
                        int w = random.nextInt(4);
                        int t = random.nextInt(900);
                        int r = (int) ifjsf.getRotation();
                        ifjsf.setRotation(r+a);
                        oifshw.setText(""+ a);
                        ifjsf.setMaxHeight(350);
                        ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) ifjsf.getLayoutParams();
                        int myHeight = t;
                        params.height = myHeight;
                        ifjsf.setLayoutParams(params);
                        switch (w){
                            case 0:
                                ifjsf.setImageResource(R.drawable.ic_slot_1);
                                break;
                            case 1:
                                ifjsf.setImageResource(R.drawable.ic_slot_2);
                                break;
                            case 2:
                                ifjsf.setImageResource(R.drawable.ic_slot_3);
                                break;
                        }

                        p++;
                        if (p != 20){
                            handler.postDelayed(this::run,10);
                        }else {
                            p = 0;
                        }

                    }
                });

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), StarRRR.class));
        finishAffinity();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String pdpdp(String rwrq, String trewq, String qwrwr, String ofjsj){

         String iidha;
         String mmmcns;
         String vvvcxsd;
         String iucbsad;
         String udbajd;
         String jcbshd;
         String nnbbcd;

        String[] jugadw = rwrq.split("::");

        try {
            iidha = jugadw[0];
        }catch (Exception e){
            iidha = "";
        }
        try {
            mmmcns = jugadw[1];
        }catch (Exception e){
            mmmcns = "";
        }

        try {
            vvvcxsd = jugadw[2];
        }catch (Exception e){
            vvvcxsd = "";

        }

        try {
            iucbsad = jugadw[3];
        }catch (Exception e){
            iucbsad = "";
        }

        try {
            udbajd = jugadw[4];
        }catch (Exception e){
            udbajd = "";
        }


        try {
            jcbshd = jugadw[5];
        }catch (Exception e){
            jcbshd = "";
        }

        try {
            nnbbcd = jugadw[6];
        }catch (Exception e){
            nnbbcd = "";
        }

        OneSignal.sendTag(StarRRR.stdde("c3ViX2FwcA=="), mmmcns);

        String khsja = iidha + StarRRR.stdde("P2J1bmRsZT0=") + trewq + StarRRR.stdde("JmFkX2lkPQ==") + qwrwr + StarRRR.stdde("JmFwcHNfaWQ9") + ofjsj +
                StarRRR.stdde("JnN1YjY9") + mmmcns +
                StarRRR.stdde("JnN1Yjc9") + vvvcxsd +
                StarRRR.stdde("JnN1YjI9") + iucbsad +
                StarRRR.stdde("JnN1YjM9") + udbajd +
                StarRRR.stdde("JnN1YjQ9") + jcbshd +
                StarRRR.stdde("JnN1YjU9") + nnbbcd +
                StarRRR.stdde("JmRldl9rZXk9") + StarRRR.stdde(qweq);
        return khsja;

    }
}