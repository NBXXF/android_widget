package com.xxf.roundcomponent.skin;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.xxf.roundcomponent.CornerUtil;

import skin.support.widget.SkinCompatFrameLayout;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:41
 */
public class XXFSkinFrameLayout extends SkinCompatFrameLayout {
    public XXFSkinFrameLayout(@NonNull Context context) {
        super(context);
    }

    public XXFSkinFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFSkinFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }

}
