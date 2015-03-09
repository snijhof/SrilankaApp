package com.example.sjoerd.srilankavakantie.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sjoerd.srilankavakantie.R;

/**
 * Created by Sjoerd on 7-3-2015.
 */
public class CostsFragment extends Fragment {

    public CostsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_costs, container, false);
        return rootView;
    }

}
