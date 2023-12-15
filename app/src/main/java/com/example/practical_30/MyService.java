package com.example.practical_30;
import static android.content.ClipData.newIntent;

import android.app.Service;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MyService extends Service {
    final String LOG_TAG = "myLogs";
    String text;

    public void onCreate() {
        super.onCreate();
        Log.d(LOG_TAG, "onCreate");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(LOG_TAG, "onStartCommand");
        someTask();
        return super.onStartCommand(intent, flags, startId);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public IBinder onBind(Intent intent) {
        Log.d(LOG_TAG, "onBind");
        return null;
    }

    public void someTask() {
        for(int i = 1; i<=5; i++) {
            Log.d(LOG_TAG, "i = "+ i);
            text="i = "+i;
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
