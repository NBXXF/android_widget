package com.xxf.roundcomponent.skin;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.xxf.roundcomponent.CornerUtil;
import com.xxf.roundcomponent.XXFRoundWidget;

import skin.support.widget.SkinCompatLinearLayout;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:39
 */
public class XXFSkinLinearLayout extends SkinCompatLinearLayout implements XXFRoundWidget {
    public XXFSkinLinearLayout(Context context) {
        super(context);
    }

    public XXFSkinLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipView(this, attrs);
    }

    public XXFSkinLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipView(this, attrs);
    }
    @Override
    public void setRadius(float radius) {
        CornerUtil.clipViewRadius(this, radius);
    }
}
