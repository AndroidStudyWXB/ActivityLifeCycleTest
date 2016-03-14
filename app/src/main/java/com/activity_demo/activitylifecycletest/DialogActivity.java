package com.activity_demo.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by WXB506 on 2016/2/18.
 */
public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);
    }
}
