package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * @Description: java类作用描述
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:37
 */
public class XXFEditText extends EditText {
    public XXFEditText(Context context) {
        super(context);
    }

    public XXFEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        CornerUtil.clipViewCorner(this, attrs);
    }
}
