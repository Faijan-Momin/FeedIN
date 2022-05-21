package com.faijan.feedin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Loading_Activity extends AppCompatActivity {

    ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_loading );


        imageView3 = findViewById( R.id.imageView3 );


        imageView3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAction =  new Intent(getApplication(), Accepted_Donation_Details.class);
                startActivity( loginAction );
            }
        } );
    }
}