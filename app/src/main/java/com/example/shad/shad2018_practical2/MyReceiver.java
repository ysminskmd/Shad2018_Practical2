package com.example.shad.shad2018_practical2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startActivity(new Intent(context, SecondActivity.class));
        /*final Intent newIntent = new Intent();
        newIntent.setAction("run.activity.action");*/

        //adb shell am broadcast -a -n com.example.shad.shad2018_practical2/.MyReceiver
    }
}
