package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Register_As_Activity extends AppCompatActivity {

    TextView login_user_link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register_as );
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        login_user_link = findViewById(R.id.login_user_link );


//        Login User Link Click
        login_user_link.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registeredUser =  new Intent(getApplication(), Login_activity.class);
                startActivity( registeredUser );
            }
        } );

    }
}