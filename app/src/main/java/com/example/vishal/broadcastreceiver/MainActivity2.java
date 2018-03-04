package com.example.vishal.broadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by VISHAL on 2/26/2017.
 */

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        Bundle b1 = i.getExtras();

        if (b1 != null) {
            Toast.makeText(this, b1.getString("K1"), Toast.LENGTH_SHORT).show();
        }
    }

}