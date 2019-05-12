package com.example.r00136656.finalassign;

import android.content.Intent;

/**
 * Created by R00136656 on 02/12/2017.
 */

public class BackGroundIntent extends BackGroundService {


    public BackGroundIntent() {
        this(BackGroundIntent.class.getName());
    }
    protected void onHandleIntent(Intent intent) {
        showToast("Starting Backgeound service");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        showToast("Finishing Background service");
    }

    public BackGroundIntent(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
