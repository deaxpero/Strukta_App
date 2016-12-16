package com.example.slawek.struktaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Slawek on 11/12/2016.
 */

public class StoresFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstance)
    {
        return inflater.inflate(R.layout.fragment_store_layout,container,false);
    }
}
