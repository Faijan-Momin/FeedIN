package com.faijan.feedin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Volunteer_Dashboard_Activity extends AppCompatActivity {

    ImageButton logout_btn;
    BottomNavigationView bottom_navbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_volunteer_dashboard );


        logout_btn = findViewById( R.id.logout_btn );

        bottom_navbar =  findViewById( R.id.bottom_navbar );
        bottom_navbar.setOnItemSelectedListener( NavListner );
        getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container,
                new dashboard_fragment()).commit();


        logout_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAction =  new Intent(getApplication(), NGO_Dashboard_Activity.class);
                startActivity( loginAction );
            }
        } );


    }


//    Nav bar Code
    private NavigationBarView.OnItemSelectedListener NavListner =
            new NavigationBarView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.dashboard_icon:
                            selectedFragment = new dashboard_fragment();
                            break;
                        case R.id.history_icon:
                            selectedFragment = new history_fragment();
                            break;
                        case R.id.wallet_icon:
                            selectedFragment = new wallet_fragment();
                            break;
                        case R.id.profile_icon:
                            selectedFragment = new profile_fragment();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };
}