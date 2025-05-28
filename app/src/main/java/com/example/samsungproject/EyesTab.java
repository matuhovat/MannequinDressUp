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

public class EyesTab extends Fragment implements View.OnClickListener {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView doll;
    LayerDrawable dollLayers;
    ImageButton eyesButton1, eyesButton2, eyesButton3, eyesButton4;
    final int eyeColorIndex = 1;

    public EyesTab() {
        // Required empty public constructor
    }

    public static EyesTab newInstance(String param1, String param2) {
        EyesTab fragment = new EyesTab();
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
        View v = inflater.inflate(R.layout.fragment_eyes_tab, container, false);
        MainActivity main = (MainActivity) getActivity();
        doll = main.findViewById(R.id.Doll);
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);;
        eyesButton1 = v.findViewById(R.id.eyesButton1);
        eyesButton2 = v.findViewById(R.id.eyesButton2);
        eyesButton3 = v.findViewById(R.id.eyesButton3);
        eyesButton4 = v.findViewById(R.id.eyesButton4);
        eyesButton1.setOnClickListener(this);
        eyesButton2.setOnClickListener(this);
        eyesButton3.setOnClickListener(this);
        eyesButton4.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getTag().toString()) {
            default:
                break;
            case "eyes1":
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), R.drawable.eye_1_color, null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.eye_1_line, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "eyes2":
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), R.drawable.eye_2_color, null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.eye_2_line, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "eyes3":
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), R.drawable.eye_3_color, null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.eye_3_line, null));
                doll.setImageDrawable(dollLayers);
                break;
            case "eyes4":
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), R.drawable.eye_4_color, null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.eye_4_line, null));
                doll.setImageDrawable(dollLayers);
                break;
        }
    }
}