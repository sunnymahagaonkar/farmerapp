package com.example.home3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home3.databinding.FragmentDashfragBinding;
import com.example.home3.databinding.FragmentProduct1infoBinding;

public class product1info extends Fragment {

FragmentProduct1infoBinding fragmentProduct1infoBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentProduct1infoBinding = FragmentProduct1infoBinding.inflate(inflater, container, false);
        //fragmentProduct1infoBinding.infoscreen.setVisibility(View.VISIBLE);

        // Return the inflated view
        return fragmentProduct1infoBinding.getRoot();
    }
}



