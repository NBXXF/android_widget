package com.xxf.roundcomponent.skin;

import android.content.Context;
import android.util.AttributeSet;

import com.xxf.roundcomponent.CornerUtil;
import com.xxf.roundcomponent.XXFRoundWidget;

import skin.support.widget.SkinCompatImageView;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:47
 */
public class XXFSkinCompatImageView extends SkinCompatImageView implements XXFRoundWidget {
    public XXFSkinCompatImageView(Context context) {
        super(context);
    }

    public XXFSkinCompatImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipView(this, attrs);
    }

    public XXFSkinCompatImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipView(this, attrs);
    }

    @Override
    public void setRadius(float radius) {
        CornerUtil.clipViewRadius(this, radius);
    }
}
