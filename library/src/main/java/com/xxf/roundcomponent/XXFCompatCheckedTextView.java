package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckedTextView;

/**
 * @Description: java类作用描述
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:49
 */
public class XXFCompatCheckedTextView extends AppCompatCheckedTextView {
    public XXFCompatCheckedTextView(Context context) {
        super(context);
    }

    public XXFCompatCheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFCompatCheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }
}
