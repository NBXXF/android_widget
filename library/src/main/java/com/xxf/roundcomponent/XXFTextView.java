package com.xxf.roundcomponent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

/**
 * @Description: java类作用描述
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:34
 */
@SuppressLint("AppCompatCustomView")
public class XXFTextView extends TextView {
    public XXFTextView(Context context) {
        super(context);
    }

    public XXFTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        CornerUtil.clipViewCorner(this, attrs);
    }
}
