package com.xxf.roundcomponent.skin;

import android.content.Context;
import android.util.AttributeSet;

import com.xxf.roundcomponent.CornerUtil;
import com.xxf.roundcomponent.XXFRoundWidget;

import skin.support.widget.SkinCompatButton;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:32
 */
public class XXFSkinCompatButton extends SkinCompatButton implements XXFRoundWidget {

    public XXFSkinCompatButton(Context context) {
        super(context);
    }

    public XXFSkinCompatButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipView(this, attrs);
    }

    public XXFSkinCompatButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipView(this, attrs);
    }

    @Override
    public void setRadius(float radius) {
        CornerUtil.clipViewRadius(this, radius);
    }
}
