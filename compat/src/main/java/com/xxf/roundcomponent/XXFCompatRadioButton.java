package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatRadioButton;


/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:39
 */
public class XXFCompatRadioButton extends AppCompatRadioButton implements XXFRoundWidget {
    public XXFCompatRadioButton(Context context) {
        super(context);
    }

    public XXFCompatRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipView(this, attrs);
    }

    public XXFCompatRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipView(this, attrs);
    }

    public void setRadius(float radius) {
        CornerUtil.clipViewRadius(this, radius);
    }

}
