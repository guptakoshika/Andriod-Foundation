package com.example.android.chandigarh_letstakeaview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Koshika Gupta on 21-02-2018.
 */

public class fragment_adapter extends FragmentPagerAdapter {

    public fragment_adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new Rock_info();
        }
        else
        {
            return new Rock_info_2();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}