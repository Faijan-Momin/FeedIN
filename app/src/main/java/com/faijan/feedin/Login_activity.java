package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_activity extends AppCompatActivity {
    ImageView logo;
    TextView register_user_link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        setContentView( R.layout.activity_login );

        register_user_link = findViewById(R.id.register_user_link);


        //        New User Link Click
        register_user_link.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newUser =  new Intent(getApplication(), Register_As_Activity.class);
                startActivity( newUser );
            }
        } );

    }
}