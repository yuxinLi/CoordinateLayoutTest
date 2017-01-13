package com.example.coordinatelayouttest.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.coordinatelayouttest.R;

public class CLBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clbase);
    }
}
