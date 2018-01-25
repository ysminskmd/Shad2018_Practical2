package com.example.shad.shad2018_practical2;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    //adb shell am startservice com.example.shad.shad2018_practical2/.MyIntentService

    @Override
    protected void onHandleIntent(Intent intent) {
        for (int i = 0; i < 100; i++) {
            Log.d("SHAD", "i = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
