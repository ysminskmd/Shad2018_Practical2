package com.example.shad.shad2018_practical2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootCompletedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //если у Ресивера может быть разное поведение на событие автозагрузкиc
        // и получения других событий, можно считать action из интента
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            context.startService(new Intent(context, MyIntentService.class));
        }

        Toast.makeText(context, "ACTION_BOOT_COMPLETED", Toast.LENGTH_SHORT).show();
        //<uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />
        //adb shell am broadcast -a android.intent.action.BOOT_COMPLETED -c android.intent.category.HOME -n com.example.shad.shad2018_practical2/.MyReceiver
    }
}
