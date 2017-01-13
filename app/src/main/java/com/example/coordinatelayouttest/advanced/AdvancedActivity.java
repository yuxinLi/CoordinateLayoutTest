package com.example.coordinatelayouttest.advanced;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.coordinatelayouttest.R;

public class AdvancedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("This is Title");
        toolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(toolbar);
    }
}
