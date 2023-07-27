package com.ssoftwares.pickupanddrop.fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.ssoftwares.pickupanddrop.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PickupFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PickupFragment extends Fragment {

    public PickupFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_pickup, container, false);
        EditText searchBox = view.findViewById(R.id.search_et);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//            searchBox.setOutlineAmbientShadowColor(getContext().getColor(R.color.colorPrimary));
//            searchBox.setOutlineSpotShadowColor(getContext().getColor(R.color.colorPrimary));
//        }
        return view;
    }
}