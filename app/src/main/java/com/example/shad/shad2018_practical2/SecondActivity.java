package com.example.shad.shad2018_practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Intent intent = getIntent();
        final String data = intent.getStringExtra("data");
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();

        //adb shell am start -n com.example.shad.shad2018_practical2/.SecondActivity
    }
}
