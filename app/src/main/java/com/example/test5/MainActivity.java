package com.example.test5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.example.test5.View.HomeFragment;
import com.example.test5.View.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        bottomNavigationView = findViewById(R.id.main_bottomnavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_body, new HomeFragment()).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            Fragment fragment = null;

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.bm_home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.bm_statistic:
                        fragment = new HomeFragment();
                        break;
                    case R.id.bm_routines:
                        fragment = new HomeFragment();
                        break;
                    case R.id.bm_setting:
                        fragment = new SettingFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_body, fragment).commit();
                return true;
            }
        });

    }
}