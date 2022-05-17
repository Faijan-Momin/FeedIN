package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Login_activity extends AppCompatActivity {
    ImageView logo;
    TextView register_user_link,forgot_password_link;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        setContentView( R.layout.activity_login );

        register_user_link = findViewById(R.id.register_user_link);
        forgot_password_link = findViewById(R.id.forgot_password_link);

        login_btn = findViewById( R.id.login_btn );


        //        forgot password Link Click
        forgot_password_link.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frgtpassd =  new Intent(getApplication(), Forgot_Password_Activity.class);
                startActivity( frgtpassd );
            }
        } );

//        Login Btn Click

        login_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAction =  new Intent(getApplication(), Dashboard_Activity.class);
                startActivity( loginAction );
            }
        } );


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