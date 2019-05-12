package com.example.r00136656.finalassign;

/**
 * Created by R00136656 on 25/11/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public abstract class Ahri_Activity extends AppCompatActivity  {
    private GestureDetector gestureDetector;
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gestureDetector = new GestureDetector( this, new SwipeDetector());
        setContentView(R.layout.counter_activity);
    }
    protected abstract void onSwipeRight();
    public class SwipeDetector extends GestureDetector.SimpleOnGestureListener
    {

        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX)
        {
            if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
            {
                return false;
            }
            if( e2.getX() > e1.getX() )
            {
                if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY)
                {
                    onSwipeRight();
                    return true;
                }
            }

            return false;
        }
    }
    public boolean dispatchTouchEvent(MotionEvent ev)
    {
        if (gestureDetector != null)
        {
            if (gestureDetector.onTouchEvent(ev))
                return true;
        }
        return super.dispatchTouchEvent(ev);
    }
    public boolean onTouchEvent(MotionEvent event)
    {
        return gestureDetector.onTouchEvent(event);
        Toast t = Toast.makeText(Ahri_Activity.this, "Right", Toast.LENGTH_LONG);
        t.show();
        Intent moreInfo = new Intent(this,MoreActivity.class);
        startActivity(moreInfo);
    }
}

