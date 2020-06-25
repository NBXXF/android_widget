package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;


/**
 * @Description: 带圆角的Button
 * @Author: XGod
 * @CreateDate: 2020/6/25 10:50
 */
public class XXFButton extends Button {
    public XXFButton(Context context) {
        super(context);
    }

    public XXFButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }
}
