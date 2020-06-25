package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

/**
 * @Description: java类作用描述
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:32
 */
public class XXFCompatButton extends AppCompatButton {

    public XXFCompatButton(Context context) {
        super(context);
    }

    public XXFCompatButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFCompatButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }

}
