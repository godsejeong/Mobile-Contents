package com.wark.stop_road_;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                Fragment_one Fragment_one = new Fragment_one();
                return Fragment_one;
            case 1:
                Fragment_two Fragment_two = new Fragment_two();
                return Fragment_two;
            case 2:
                Fragment_three Fragment_three = new Fragment_three();
                return Fragment_three;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
