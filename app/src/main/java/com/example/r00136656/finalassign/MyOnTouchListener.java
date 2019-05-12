package com.example.r00136656.finalassign;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by R00136656 on 23/11/2017.
 */
public class MyOnTouchListener extends View.OnTouchListener {
    final GestureDetector gesture;

    public MyOnTouchListener(Activity activity) {
        gesture = new GestureDetector(activity, new MyGestureListener());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gesture.onTouchEvent(event);
    }
}

 class MyGestureListener extends GestureDetector.SimpleOnGestureListener {

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        final int SWIPE_MIN_DISTANCE = 120;
        final int SWIPE_MAX_OFF_PATH = 250;
        final int SWIPE_THRESHOLD_VELOCITY = 200;

        try {
            if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH) {
                return false;
            }

            if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {

            }
        } catch (Exception e) {
            // nothing
        }

        return super.onFling(e1, e2, velocityX, velocityY);
    }
}
