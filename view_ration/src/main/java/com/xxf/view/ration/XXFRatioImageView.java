package com.xxf.view.ration;

import android.content.Context;
import android.util.AttributeSet;

import com.xxf.roundcomponent.XXFCompatImageView;
import com.xxf.view.ration.inner.RatioDatumMode;
import com.xxf.view.ration.inner.RatioLayoutDelegate;
import com.xxf.view.ration.inner.XXFRatioWidget;

/**
 * @Author: XGod  xuanyouwu@163.com  17611639080
 * Date: 2/4/21 2:45 PM
 * Description: TODO
 */
public class XXFRatioImageView extends XXFCompatImageView implements XXFRatioWidget {

    private RatioLayoutDelegate mRatioLayoutDelegate;

    public XXFRatioImageView(Context context) {
        super(context);
    }

    public XXFRatioImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mRatioLayoutDelegate = RatioLayoutDelegate.obtain(this, attrs);
    }

    public XXFRatioImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mRatioLayoutDelegate = RatioLayoutDelegate.obtain(this, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(mRatioLayoutDelegate != null){
            mRatioLayoutDelegate.update(widthMeasureSpec,heightMeasureSpec);
            widthMeasureSpec = mRatioLayoutDelegate.getWidthMeasureSpec();
            heightMeasureSpec = mRatioLayoutDelegate.getHeightMeasureSpec();
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }



    @Override
    public void setAspectRatio(float aspectRatio) {
        if (mRatioLayoutDelegate != null) {
            mRatioLayoutDelegate.setAspectRatio(aspectRatio);
        }
    }

    @Override
    public void setRatio(RatioDatumMode mode, float widthRatio, float heightRatio) {
        if(mRatioLayoutDelegate != null){
            mRatioLayoutDelegate.setRatio(mode, widthRatio, heightRatio);
        }
    }
}
