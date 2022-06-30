package com.example.test5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.test5.View.LightFragment;
import com.example.test5.View.ThermostatFragment;
import com.google.android.material.appbar.MaterialToolbar;

public class UserRoomActivity extends AppCompatActivity {

    private ImageView light, thermostat;
    private MaterialToolbar materialToolbar;
    private ImageButton imageButton;

    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_room);



        light = findViewById(R.id.user_light);
        thermostat = findViewById(R.id.user_thermostat);

        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new LightFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.user_body, fragment).commit();
            }
        });
        thermostat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new ThermostatFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.user_body, fragment).commit();
            }
        });

        materialToolbar = findViewById(R.id.user_toolbar);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}