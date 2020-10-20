package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:43
 */
public class XXFRelativeLayout extends RelativeLayout implements XXFRoundWidget {
    public XXFRelativeLayout(Context context) {
        super(context);
    }

    public XXFRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipView(this, attrs);
    }

    public XXFRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipView(this, attrs);
    }

    public XXFRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        CornerUtil.clipView(this, attrs);
    }

    @Override
    public void setRadius(float radius) {
        CornerUtil.clipViewRadius(this, radius);
    }
}
