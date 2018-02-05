package com.example.ammar.medica;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;


public class SignUpPagerAdapter extends FragmentPagerAdapter {

    String[] tabTiitles = {"USER", "DOCTOR"};

    public SignUpPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BlankFragment();
            case 1:
                return new BlankFragment2();
        }
        Log.w(FragmentPagerAdapter.class.getSimpleName(), "returning null position error");
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTiitles[position];
    }
}
