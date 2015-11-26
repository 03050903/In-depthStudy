package com.sun.study.framework.dialog;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by sunfusheng on 15/8/7.
 */
public class ToastTip {

    private static Toast mToast;

    public static void show(Context context, String message) {
        show(context, message, Gravity.CENTER);
    }

    public static void show(Context context, String message, int gravity) {
        if (mToast != null) {
            mToast.cancel();
        }
        int duration;
        if (message.length() > 10) {
            duration = Toast.LENGTH_LONG; //如果字符串比较长，那么显示的时间也长一些。
        } else {
            duration = Toast.LENGTH_SHORT;
        }
        mToast = Toast.makeText(context.getApplicationContext(), message, duration);
        if (gravity == Gravity.CENTER) {
            mToast.setGravity(gravity, 0, 0);
        }
        mToast.show();
    }
}
