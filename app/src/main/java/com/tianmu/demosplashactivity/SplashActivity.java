package com.tianmu.demosplashactivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //如果有v7的actionbar就隐藏
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        
        //延迟启动
       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,HomeActivity.class));
                   finish();
                overridePendingTransition(R.anim.stand,R.anim.splash);
            }
        } ,600);
    }
}
