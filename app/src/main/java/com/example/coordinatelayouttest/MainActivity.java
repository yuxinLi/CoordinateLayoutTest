package com.example.coordinatelayouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.coordinatelayouttest.advanced.AdvancedActivity;
import com.example.coordinatelayouttest.advanced.CollapsActivity;
import com.example.coordinatelayouttest.base.CLBaseActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.bt_1).setOnClickListener(this);
        findViewById(R.id.bt_2).setOnClickListener(this);
        findViewById(R.id.bt_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_1:
                startActivity(new Intent(this , CLBaseActivity.class));
                break;
            case R.id.bt_2:
                startActivity(new Intent(this , AdvancedActivity.class));
                break;
            case R.id.bt_3:
                startActivity(new Intent(this , CollapsActivity.class));
                break;
        }
    }
}
