package com.example.coordinatelayouttest.base;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2017/1/12
 */

public class BaseBehavior extends CoordinatorLayout.Behavior<Button> {
    private int width;

    public BaseBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        DisplayMetrics display = context.getResources().getDisplayMetrics();
        width = display.widthPixels;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, Button child, View dependency) {
        return dependency instanceof TempView;
    }


    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, Button btn, View dependency) {

        int top = dependency.getTop();
        int left = dependency.getLeft();
        int x = width - left - btn.getWidth();
        int y = top;

        setPosition(btn , x , y);

        return true;
    }

    private void setPosition(Button btn, int x, int y) {
        CoordinatorLayout.MarginLayoutParams layout = (CoordinatorLayout.LayoutParams) btn.getLayoutParams();
        layout.leftMargin = x ;
        layout.topMargin = y;
        btn.setLayoutParams(layout);
        btn.requestLayout();
    }


}
