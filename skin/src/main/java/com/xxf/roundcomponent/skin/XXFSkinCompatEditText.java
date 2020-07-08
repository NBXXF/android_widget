package com.xxf.roundcomponent.skin;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

import com.xxf.roundcomponent.CornerUtil;

import skin.support.widget.SkinCompatEditText;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:37
 */
public class XXFSkinCompatEditText extends SkinCompatEditText {
    public XXFSkinCompatEditText(Context context) {
        super(context);
    }

    public XXFSkinCompatEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipViewCorner(this, attrs);
    }

    public XXFSkinCompatEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipViewCorner(this, attrs);
    }
}
