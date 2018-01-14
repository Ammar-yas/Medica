package com.example.ammar.medica;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        FragmentManager fm = getSupportFragmentManager();
        SignUpPagerAdapter pagerAdapter = new SignUpPagerAdapter(fm);
        ViewPager viewPager = (ViewPager) findViewById(R.id.sign_up_pager);
        viewPager.setAdapter(pagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sign_up_tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}