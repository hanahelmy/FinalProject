package com.example.healthbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthbuddy.fragments.Home;
import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ViewPager viewPager = findViewById(R.id.viewpager);
        tabsadapter tabsadapter = new tabsadapter(getSupportFragmentManager());
        viewPager.setAdapter(tabsadapter);
        TabLayout tab = findViewById(R.id.tablayout);
        tab.setupWithViewPager(viewPager);
        tab.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        tab.getTabAt(1).setIcon(R.drawable.ic_baseline_person_24);
        tab.getTabAt(2).setIcon(R.drawable.ic_baseline_menu_24);

        Button workoutsbtn = findViewById(R.id.workoutsid);



    }
}