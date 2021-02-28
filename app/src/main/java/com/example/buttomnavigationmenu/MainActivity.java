package com.example.buttomnavigationmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavMenuId);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.menuHomeId:
                        Toast.makeText(MainActivity.this, "Clicked Home", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menuAboutUsId:
                        Toast.makeText(MainActivity.this, "Clicked About Us", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.menuContactUsId:
                        Toast.makeText(MainActivity.this, "Clicked Contact Us", Toast.LENGTH_SHORT).show();
                        return true;

                    default:
                        return false;
                }


            }
        });

    }
}