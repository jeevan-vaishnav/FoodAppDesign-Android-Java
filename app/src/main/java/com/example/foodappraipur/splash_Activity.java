package com.example.foodappraipur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class splash_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

         getWindow().setFlags(
                 WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                 WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
         );
        getSupportActionBar().hide();

        Thread thread  = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(1000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                finally {
                    Intent intent = new Intent(splash_Activity.this,MainActivity.class);
                    startActivity(intent);
                }
            }


        };

        thread.start();



    }

}