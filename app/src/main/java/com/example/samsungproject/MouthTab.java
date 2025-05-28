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

public class MouthTab extends Fragment implements View.OnClickListener {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView doll;
    LayerDrawable dollLayers;
    ImageButton mouthButton1, mouthButton2, mouthButton3, mouthButton4, mouthButton5, mouthButton6;
    final int eyeColorIndex = 1;

    public MouthTab() {
        // Required empty public constructor
    }

    public static MouthTab newInstance(String param1, String param2) {
        MouthTab fragment = new MouthTab();
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
        View v = inflater.inflate(R.layout.fragment_mouth_tab, container, false);
        MainActivity main = (MainActivity) getActivity();
        doll = main.findViewById(R.id.Doll);
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);;
        mouthButton1 = v.findViewById(R.id.mouthButton1);
        mouthButton2 = v.findViewById(R.id.mouthButton2);
        mouthButton3 = v.findViewById(R.id.mouthButton3);
        mouthButton4 = v.findViewById(R.id.mouthButton4);
        mouthButton5 = v.findViewById(R.id.mouthButton5);
        mouthButton6 = v.findViewById(R.id.mouthButton6);
        mouthButton1.setOnClickListener(this);
        mouthButton2.setOnClickListener(this);
        mouthButton3.setOnClickListener(this);
        mouthButton4.setOnClickListener(this);
        mouthButton5.setOnClickListener(this);
        mouthButton6.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getTag().toString()) {
            default:
                break;
            case "mouth1":
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), R.drawable.mouth_1, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "mouth2":
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), R.drawable.mouth_2, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "mouth3":
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), R.drawable.mouth_3, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "mouth4":
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), R.drawable.mouth_4, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "mouth5":
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), R.drawable.mouth_5, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "mouth6":
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), R.drawable.mouth_6, null));
                doll.setImageDrawable(dollLayers);
                break;
        }
    }
}