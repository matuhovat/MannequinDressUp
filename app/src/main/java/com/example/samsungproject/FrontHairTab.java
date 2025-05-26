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

public class FrontHairTab extends Fragment implements View.OnClickListener {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView doll;
    LayerDrawable dollLayers;
    Button colorPickerButton;
    ImageButton frontHairButton1, hairButton2, hairButton3, hairButton4, hairButton5;

    public FrontHairTab() {
        // Required empty public constructor
    }

    public static FrontHairTab newInstance(String param1, String param2) {
        FrontHairTab fragment = new FrontHairTab();
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
        View v = inflater.inflate(R.layout.fragment_front_hair_tab, container, false);
        MainActivity main = (MainActivity) getActivity();
        doll = main.findViewById(R.id.Doll);
        colorPickerButton = main.findViewById(R.id.colorPickerButton);
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);;
        frontHairButton1 = v.findViewById(R.id.frontHairButton1);
        frontHairButton1.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getTag().toString()) {
            default:
                break;
            case "colorPicker":
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), R.drawable.hair1_test, null));
                doll.setImageDrawable(dollLayers);
            case "frontHair1":
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), R.drawable.hair1_test, null));
                doll.setImageDrawable(dollLayers);
        }
    }
}