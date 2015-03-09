package com.example.sjoerd.srilankavakantie.Model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Sjoerd on 7-3-2015.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    private Fragment[] mFragments;

    public PagerAdapter(FragmentManager fm, Fragment[] fragments) {
        super(fm);
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        if (mFragments.length > i)
            return mFragments[i];
        else return null;
    }

    @Override
    public int getCount() {
        return mFragments.length;
    }
}
