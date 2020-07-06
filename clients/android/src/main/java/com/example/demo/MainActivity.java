package com.example.demo;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.auth.model.Demo;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(Demo.hello);
    }
}
