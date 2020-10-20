package com.xxf.roundcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @Description: eg app:radius="4dp"
 * @Author: XGod
 * @CreateDate: 2020/6/25 15:41
 */
public class XXFFrameLayout extends FrameLayout implements XXFRoundWidget {
    public XXFFrameLayout(@NonNull Context context) {
        super(context);
    }

    public XXFFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        CornerUtil.clipView(this, attrs);
    }

    public XXFFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        CornerUtil.clipView(this, attrs);
    }

    public XXFFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        CornerUtil.clipView(this, attrs);
    }

    @Override
    public void setRadius(float radius) {
        CornerUtil.clipViewRadius(this, radius);
    }
}
