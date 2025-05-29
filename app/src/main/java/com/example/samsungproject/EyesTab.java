package com.example.samsungproject;

import static android.content.Context.MODE_PRIVATE;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
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
    SharedPreferences drawableValues;
    SharedPreferences.Editor DVEditor;

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
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);
        drawableValues = getContext().getSharedPreferences("drawable_values", MODE_PRIVATE);
        DVEditor = drawableValues.edit();
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
                DVEditor.putInt("eye_color", R.drawable.eye_1_color);
                DVEditor.putInt("eye_line", R.drawable.eye_1_line);
                DVEditor.apply();
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
                dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
                break;
            case "eyes2":
                DVEditor.putInt("eye_color", R.drawable.eye_2_color);
                DVEditor.putInt("eye_line", R.drawable.eye_2_line);
                DVEditor.apply();
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
                dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
//                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
//                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                break;
            case "eyes3":
                DVEditor.putInt("eye_color", R.drawable.eye_3_color);
                DVEditor.putInt("eye_line", R.drawable.eye_3_line);
                DVEditor.apply();
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
                dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
                break;
            case "eyes4":
                DVEditor.putInt("eye_color", R.drawable.eye_4_color);
                DVEditor.putInt("eye_line", R.drawable.eye_4_line);
                DVEditor.apply();
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
                dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
                break;
        }
        doll.setImageDrawable(dollLayers);
    }
}