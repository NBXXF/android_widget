package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;

/**
 * @Description: java类作用描述
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:46
 */
public class XXFImageView extends ImageView {
    public XXFImageView(Context context) {
        super(context);
    }

    public XXFImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        CornerUtil.clipViewCorner(this, attrs);
    }
}
