package com.example.vishal.broadcastreceiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by VISHAL on 2/26/2017.
 */
public class MyService extends Service {
    public MyService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;

    }
    public int onStartCommand(Intent intent, int flags, int startId) {


        Toast.makeText(this,"Services Started",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Services Stopped..",Toast.LENGTH_SHORT).show();
        super.onDestroy();

    }
}
