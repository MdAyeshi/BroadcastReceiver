package com.example.vishal.broadcastreceiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    NotificationManager nim;
    Button b1,b2,b3,b4;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =(Button) findViewById(R.id.but1);
        b2 = (Button)findViewById(R.id.but2);
        b3 = (Button) findViewById(R.id.but3);
        b4 = (Button)findViewById(R.id.but4);
    }
    public  void dothis(View v)
    {
        Intent i = new Intent(this,MyReceiver.class);
        sendBroadcast(i);
    }

    public  void StartNotification(View v)
    {
        Intent i = new Intent(this,MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("K1","LPU");
        i.putExtras(b);

        PendingIntent pi = PendingIntent.getActivity(this,0,i,0);

        NotificationCompat.Builder nib = new NotificationCompat.Builder(this);
        nib.setSmallIcon(R.mipmap.ic_launcher);
        nib.setContentTitle("My Notification");
        nib.setContentText("Hello...");
        nib.setContentIntent(pi);
        nib.addAction(R.mipmap.ic_launcher,"This is first Notification",pi);

        Notification ni = nib.build();

        nim = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nim.notify(0,ni);
    }
   /* public void StartService(View v)
    {
        i = new Intent(this,MyService.class);
        startService(i);
    }

    public void StopService(View v)
    {
        i = new Intent(this,MyService.class);
        stopService(i);
    }*/




}