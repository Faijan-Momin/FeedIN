package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Donation_Details_Activity extends AppCompatActivity {

    LinearLayout request_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_donation_details );

        request_btn = findViewById( R.id.request_btn );


        request_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAction =  new Intent(getApplication(), Loading_Activity.class);
                startActivity( loginAction );
            }
        } );
    }
}