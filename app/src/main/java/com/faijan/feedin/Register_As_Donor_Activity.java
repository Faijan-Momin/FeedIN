package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Register_As_Donor_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register_as_donor );
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

    }
}