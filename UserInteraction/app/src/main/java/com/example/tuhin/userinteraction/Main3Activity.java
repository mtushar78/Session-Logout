package com.example.tuhin.userinteraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.tuhin.userinteraction.MainActivity.counter;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TaskForInteraction taskForInteraction=new TaskForInteraction(getApplicationContext(),this);
        taskForInteraction.interactionTask();
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        counter=0;
    }
}
