package com.ssoftwares.pickupanddrop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.widget.RadioGroup;

import com.ssoftwares.pickupanddrop.adapters.ViewpagerAdapter;
import com.ssoftwares.pickupanddrop.utils.CustomViewpager;

public class MainActivity extends AppCompatActivity {

    CustomViewpager viewPager;
    RadioGroup navGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        navGroup = findViewById(R.id.radio_group);

        final ViewpagerAdapter adapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        navGroup.check(R.id.pickup_radio);
                        break;
                    case 1:
                        navGroup.check(R.id.drop_radio);
                        break;
                    case 2:
                        navGroup.check(R.id.courier_radio);
                        break;
                    case 3:
                        navGroup.check(R.id.summary_radio);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        navGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.pickup_radio:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.drop_radio:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.courier_radio:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.summary_radio:
                        viewPager.setCurrentItem(3);
                        break;
                }
            }
        });

    }
}