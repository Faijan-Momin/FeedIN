package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView splash_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        setContentView( R.layout.activity_main );
        splash_logo = findViewById(R.id.splash_logo);



        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        @SuppressLint("ResourceType") Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.transition.slide);
                        splash_logo.startAnimation(animation);
                        new java.util.Timer().schedule(
                                new java.util.TimerTask() {
                                    @Override
                                    public void run() {
                                        Intent intent = new Intent(getApplicationContext(), Register_As_Activity.class);
                                        startActivity( intent ); }
                                },
                                1000
                        );

                    }
                },
                2000
        );
//        fadeBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // To add fade animation
//                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.transition.slide);
//                splash_logo.startAnimation(animation);
//            }
//        });
    }
}