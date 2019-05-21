package com.aghniya.uts_akb_if3_10116117;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.aghniya.uts_akb_if3_10116117.R;
import com.aghniya.uts_akb_if3_10116117.Views.WalkthroughActivity;

import static java.lang.Thread.sleep;


/*=========================================
Tanggal Pembuatan   : 16 Mei 2019
NIM                 : 10116117
Nama                : Aghniya Ni'amillah Nurhilman
Kelas               : AKB-3
 =========================================*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = findViewById(R.id.logo);
        TextView tv = findViewById(R.id.namaApp);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        tv.startAnimation(animation);
        iv.startAnimation(animation);
        final Intent intent = new Intent(this, WalkthroughActivity.class);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(4000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        });
        timer.start();
    }
}
