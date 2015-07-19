package com.kashizadeh.library.circularprogressbar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;


public class ActivityMain extends Activity {

    private int progress = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final CircularProgressbar circularProgressbar = (CircularProgressbar) findViewById(R.id.circularProgressbar);
        circularProgressbar.setColor(Color.parseColor("#f14d4d"));

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                circularProgressbar.setState(CircularProgressbar.STATE_LOADING);
            }
        }, 1500);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                circularProgressbar.setState(CircularProgressbar.STATE_PROGRESS);
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        while (progress != 100) {
                            progress += 5;
                            circularProgressbar.setProgress(progress);

                            try {
                                Thread.sleep(200);
                            }
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }).start();
            }
        }, 4000);

    }
}