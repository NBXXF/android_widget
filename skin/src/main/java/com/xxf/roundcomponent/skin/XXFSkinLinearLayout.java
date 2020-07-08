package com.xxf.roundcomponent.skin;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.xxf.roundcomponent.CornerUtil;

import skin.support.widget.SkinCompatLinearLayout;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:39
 */
public class XXFSkinLinearLayout extends SkinCompatLinearLayout {
    public XXFSkinLinearLayout(Context context) {
        super(context);
    }

    public XXFSkinLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFSkinLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }

}
