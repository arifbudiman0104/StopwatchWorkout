package com.example.stopwatchworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SelectWorkoutActivity extends AppCompatActivity {

    LinearLayout cardviewMountainClimber, cardviewHighStepping, cardviewJumpingJack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_workout);

        cardviewMountainClimber = findViewById(R.id.cardviewMountainClimber);
        cardviewHighStepping = findViewById(R.id.cardviewHighStepping);
        cardviewJumpingJack = findViewById(R.id.cardviewJumpingJack);

        cardviewMountainClimber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent( SelectWorkoutActivity.this, MountainClimber.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
        cardviewHighStepping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent( SelectWorkoutActivity.this, HighStepping.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
        cardviewJumpingJack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent( SelectWorkoutActivity.this, JumpingJacks.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}
