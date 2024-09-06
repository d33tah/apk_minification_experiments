package com.example.basic_views_activity;

import android.os.Bundle;

import com.example.basic_views_activity.databinding.ActivityMainBinding;

import android.app.Activity;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }

}