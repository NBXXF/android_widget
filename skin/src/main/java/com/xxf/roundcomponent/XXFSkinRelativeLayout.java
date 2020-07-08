package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import skin.support.widget.SkinCompatRelativeLayout;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:43
 */
public class XXFSkinRelativeLayout extends SkinCompatRelativeLayout {
    public XXFSkinRelativeLayout(Context context) {
        super(context);
    }

    public XXFSkinRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFSkinRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }

}
