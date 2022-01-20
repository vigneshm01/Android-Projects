package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("onclick called");
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                String CHANNEL_ID="MYCHANNEL";
                NotificationChannel notificationChannel=new NotificationChannel(CHANNEL_ID,"name",NotificationManager.IMPORTANCE_LOW);
                PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(),1,intent,0);
                Notification notification=new Notification.Builder(getApplicationContext(),CHANNEL_ID)
                        .setContentText("New Notification")
                        .setContentTitle("Notification is successfully implemented")
                        .setContentIntent(pendingIntent)
                        .addAction(android.R.drawable.sym_action_chat,"Title",pendingIntent)
                        .setChannelId(CHANNEL_ID)
                        .setSmallIcon(android.R.drawable.sym_action_chat)
                        .build();

                NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.createNotificationChannel(notificationChannel);
                notificationManager.notify(1,notification);

            }
        });
    }
}