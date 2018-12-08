package com.example.tuhin.userinteraction;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static String TAG = "com.example.tuhin.userinteraction";

    public static int counter=0;
    public static boolean isIdle= true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button main = findViewById(R.id.main);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MyService.class);

                startService(intent);

                startActivity(new Intent(getApplicationContext(),Main2Activity.class));

            }
        });

    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();

        counter=0;

        isIdle = false;

        Log.d(TAG,"user interacted");
    }


}
