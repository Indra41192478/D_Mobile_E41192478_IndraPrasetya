package com.indra.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragstatus extends Fragment {


    public fragstatus() {
        // Required empty public constructor
    }

    public static fragstatus newInstance() {

        Bundle args = new Bundle();

        fragstatus fragment = new fragstatus();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragstatus, container, false);
    }

}