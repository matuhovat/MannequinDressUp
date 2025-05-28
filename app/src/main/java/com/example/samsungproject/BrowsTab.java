package com.example.samsungproject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BrowsTab extends Fragment implements View.OnClickListener {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView doll;
    LayerDrawable dollLayers;
    ImageButton browsButton1, browsButton2, browsButton3, browsButton4;
    final int eyeColorIndex = 1;

    public BrowsTab() {
        // Required empty public constructor
    }

    public static BrowsTab newInstance(String param1, String param2) {
        BrowsTab fragment = new BrowsTab();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_brows_tab, container, false);
        MainActivity main = (MainActivity) getActivity();
        doll = main.findViewById(R.id.Doll);
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);;
        browsButton1 = v.findViewById(R.id.browsButton1);
        browsButton2 = v.findViewById(R.id.browsButton2);
        browsButton3 = v.findViewById(R.id.browsButton3);
        browsButton4 = v.findViewById(R.id.browsButton4);
        browsButton1.setOnClickListener(this);
        browsButton2.setOnClickListener(this);
        browsButton3.setOnClickListener(this);
        browsButton4.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getTag().toString()) {
            default:
                break;
            case "brows1":
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), R.drawable.brows_1, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "brows2":
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), R.drawable.brows_2, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "brows3":
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), R.drawable.brows_3, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "brows4":
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), R.drawable.brows_4, null));
                doll.setImageDrawable(dollLayers);
                break;
        }
    }
}