package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

/**
 * @Description: java类作用描述
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:34
 */
public class XXFCompatTextView extends AppCompatTextView {
    public XXFCompatTextView(Context context) {
        super(context);
    }

    public XXFCompatTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFCompatTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }
}
