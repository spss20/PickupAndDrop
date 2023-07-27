package com.ssoftwares.pickupanddrop.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.ssoftwares.pickupanddrop.fragments.CourierFragment;
import com.ssoftwares.pickupanddrop.fragments.DropFragment;
import com.ssoftwares.pickupanddrop.fragments.PickupFragment;
import com.ssoftwares.pickupanddrop.fragments.SummaryFragment;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {

    public ViewpagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PickupFragment();
            case 1 :
                return new DropFragment();
            case 2:
                return new CourierFragment();
            default:
                return new SummaryFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
