package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Donor_Dashboard extends AppCompatActivity {

    ImageButton logout_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_donor_dashboard );

        logout_btn = findViewById( R.id.logout_btn );


        logout_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAction =  new Intent(getApplication(), Donation_Details_Activity.class);
                startActivity( loginAction );
            }
        } );
    }
}