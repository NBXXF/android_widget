package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:37
 */
public class XXFCompatEditText extends AppCompatEditText implements XXFRoundWidget {
    public XXFCompatEditText(Context context) {
        super(context);
    }

    public XXFCompatEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipView(this, attrs);
    }

    public XXFCompatEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipView(this, attrs);
    }
    @Override
    public void setRadius(float radius) {
        CornerUtil.clipViewRadius(this, radius);
    }
}
