package com.example.coordinatelayouttest.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2017/1/12
 */

public class VPTest extends ViewGroup {


    public VPTest(Context context) {
        super(context);
    }

    public VPTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VPTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
