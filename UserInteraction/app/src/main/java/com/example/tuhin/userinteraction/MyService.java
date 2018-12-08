package com.example.tuhin.userinteraction;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class MyService extends Service implements View.OnTouchListener {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d("myservice","service started");

        WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);


        Timer timer = new Timer();


        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {


                ActivityManager am = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
                ComponentName cn = am.getRunningTasks(1).get(0).topActivity;


                Log.d("myservice",  cn.getClassName());


            }
        },10,1000);



        return START_REDELIVER_INTENT;
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d("myservice", "Touch event captured");
        return false;
    }


}
