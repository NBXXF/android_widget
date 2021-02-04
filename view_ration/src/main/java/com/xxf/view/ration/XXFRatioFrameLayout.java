package com.xxf.view.ration;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

import com.xxf.roundcomponent.XXFFrameLayout;
import com.xxf.view.ration.inner.RatioDatumMode;
import com.xxf.view.ration.inner.RatioLayoutDelegate;
import com.xxf.view.ration.inner.XXFRatioWidget;

/**
 * @Author: XGod  xuanyouwu@163.com  17611639080
 * Date: 2/4/21 2:45 PM
 * Description: TODO
 */
public class XXFRatioFrameLayout extends XXFFrameLayout implements XXFRatioWidget {

    private RatioLayoutDelegate mRatioLayoutDelegate;


    public XXFRatioFrameLayout(Context context) {
        super(context);
    }

    public XXFRatioFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mRatioLayoutDelegate = RatioLayoutDelegate.obtain(this, attrs);
    }

    public XXFRatioFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mRatioLayoutDelegate = RatioLayoutDelegate.obtain(this, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public XXFRatioFrameLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mRatioLayoutDelegate = RatioLayoutDelegate.obtain(this, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (mRatioLayoutDelegate != null) {
            mRatioLayoutDelegate.update(widthMeasureSpec, heightMeasureSpec);
            widthMeasureSpec = mRatioLayoutDelegate.getWidthMeasureSpec();
            heightMeasureSpec = mRatioLayoutDelegate.getHeightMeasureSpec();
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public void setRatio(RatioDatumMode mode, float widthRatio, float heightRatio) {
        if (mRatioLayoutDelegate != null) {
            mRatioLayoutDelegate.setRatio(mode, widthRatio, heightRatio);
        }
    }



    @Override
    public void setAspectRatio(float aspectRatio) {
        if (mRatioLayoutDelegate != null) {
            mRatioLayoutDelegate.setAspectRatio(aspectRatio);
        }
    }
}