package com.example.tuhin.userinteraction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

import static com.example.tuhin.userinteraction.MainActivity.counter;

public class TaskForInteraction {

    private Context mContext;
    private Activity mActivity;
    TaskForInteraction(Context context ,Activity activity){

        mContext = context;
        mActivity = activity;
    }

    public void interactionTask() {

        final Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                counter++;
                if (counter > 1) {

                  // Intent intent= mActivity.getIntent();

                   mActivity.startActivity(new Intent(mContext,MainActivity.class));

                   timer.cancel();
                }
            }
        }, 10,5000);
    }

}
