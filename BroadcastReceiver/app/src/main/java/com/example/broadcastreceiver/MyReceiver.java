package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String actionString= intent.getAction();
        String timezone = intent.getStringExtra("time-zone");

        Log.d("broadcast",actionString+" "+timezone);

    }
}