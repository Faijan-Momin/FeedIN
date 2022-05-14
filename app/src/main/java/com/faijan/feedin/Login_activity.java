package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Login_activity extends AppCompatActivity {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        logo = findViewById(R.id.splash_logo);


        setContentView( R.layout.activity_login );


    }
}