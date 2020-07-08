package com.xxf.roundcomponent.skin;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

import com.xxf.roundcomponent.CornerUtil;

import skin.support.widget.SkinCompatImageView;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:47
 */
public class XXFSkinCompatImageView extends SkinCompatImageView {
    public XXFSkinCompatImageView(Context context) {
        super(context);
    }

    public XXFSkinCompatImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFSkinCompatImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }
}
