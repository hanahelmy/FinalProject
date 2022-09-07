package com.example.healthbuddy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.healthbuddy.fragments.Home;
import com.example.healthbuddy.fragments.Profile;
import com.example.healthbuddy.fragments.Sidemenu;

public class tabsadapter extends FragmentPagerAdapter {
    public tabsadapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0 : return new Home();
            case 1 : return new Profile();
            case 2 : return new Sidemenu();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
