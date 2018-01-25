package com.example.shad.shad2018_practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Для того, чтобы система обработала неявные интенты, необходимо
        //в intent-filter добавить android.intent.category.DEFAULT
        //adb shell am start -a run.activity.action
    }

    public void startService(View view) {
        startService(new Intent(this, MyIntentService.class));
    }
}
