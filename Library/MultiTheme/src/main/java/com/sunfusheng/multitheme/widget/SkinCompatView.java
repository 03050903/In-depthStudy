package com.sunfusheng.multitheme.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SkinCompatView extends View implements SkinCompatSupportable {
    private final SkinCompatBackgroundHelper mBackgroundTintHelper;

    public SkinCompatView(Context context) {
        this(context, null);
    }

    public SkinCompatView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SkinCompatView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mBackgroundTintHelper = new SkinCompatBackgroundHelper(this);
        mBackgroundTintHelper.loadFromAttributes(attrs, defStyleAttr);

    }

    @Override
    public void setBackgroundResource(int resid) {
        super.setBackgroundResource(resid);
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.applySkin();
        }
    }

    @Override
    public void applySkin() {
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.applySkin();
        }
    }
}
