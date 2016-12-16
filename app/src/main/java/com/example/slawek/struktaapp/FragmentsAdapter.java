package com.example.slawek.struktaapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Slawek on 11/12/2016.
 */

public class FragmentsAdapter extends FragmentStatePagerAdapter {

    private String fragments [] = {"Products", "Stores"};
    private Context context;

    public FragmentsAdapter(FragmentManager supportFragmentManager, Context context)
    {
        super(supportFragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ProductFragment();
            case 1:
                return new StoresFragment();
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return fragments[position];
    }
}
