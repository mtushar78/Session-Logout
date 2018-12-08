package com.example.tuhin.userinteraction;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.tuhin.userinteraction.MainActivity.counter;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TaskForInteraction interaction = new TaskForInteraction(getApplicationContext(),this);
        interaction.interactionTask();

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Main3Activity.class));
            }
        });

    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();

        counter=0;
    }
}
