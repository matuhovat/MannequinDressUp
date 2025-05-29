package com.example.samsungproject;

import static android.content.Context.MODE_PRIVATE;

import android.annotation.SuppressLint;
import android.app.Activity;
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
    SharedPreferences drawableValues;
    SharedPreferences.Editor DVEditor;

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
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);
        drawableValues = getActivity().getSharedPreferences("drawable_values", MODE_PRIVATE);
        DVEditor = drawableValues.edit();
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
                DVEditor.putInt("brows", R.drawable.brows_1);
                DVEditor.apply();
                dollLayers.setDrawable(0, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_color", R.drawable.back_hair_1_color), null));
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_line", R.drawable.back_hair_1_line), null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.body_base_full, null));
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
                dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
                dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                dollLayers.setDrawable(7, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_color", R.drawable.socks_1_color), null));
                dollLayers.setDrawable(8, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_line", R.drawable.socks_1_line), null));
                dollLayers.setDrawable(9, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_color", R.drawable.shoes_1_color), null));
                dollLayers.setDrawable(10, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_line", R.drawable.shoes_1_line), null));
                dollLayers.setDrawable(11, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_color", R.drawable.bottom_1_color), null));
                dollLayers.setDrawable(12, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_line", R.drawable.bottom_1_line), null));
                dollLayers.setDrawable(13, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_color", R.drawable.top_1_color), null));
                dollLayers.setDrawable(14, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_line", R.drawable.top_1_line), null));
                dollLayers.setDrawable(15, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
                dollLayers.setDrawable(16, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
                break;
            case "brows2":
                DVEditor.putInt("brows", R.drawable.brows_2);
                DVEditor.apply();
                dollLayers.setDrawable(0, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_color", R.drawable.back_hair_1_color), null));
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_line", R.drawable.back_hair_1_line), null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.body_base_full, null));
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
                dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
                dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                dollLayers.setDrawable(7, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_color", R.drawable.socks_1_color), null));
                dollLayers.setDrawable(8, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_line", R.drawable.socks_1_line), null));
                dollLayers.setDrawable(9, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_color", R.drawable.shoes_1_color), null));
                dollLayers.setDrawable(10, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_line", R.drawable.shoes_1_line), null));
                dollLayers.setDrawable(11, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_color", R.drawable.bottom_1_color), null));
                dollLayers.setDrawable(12, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_line", R.drawable.bottom_1_line), null));
                dollLayers.setDrawable(13, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_color", R.drawable.top_1_color), null));
                dollLayers.setDrawable(14, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_line", R.drawable.top_1_line), null));
                dollLayers.setDrawable(15, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
                dollLayers.setDrawable(16, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
                break;
            case "brows3":
                DVEditor.putInt("brows", R.drawable.brows_3);
                DVEditor.apply();
                dollLayers.setDrawable(0, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_color", R.drawable.back_hair_1_color), null));
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_line", R.drawable.back_hair_1_line), null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.body_base_full, null));
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
                dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
                dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                dollLayers.setDrawable(7, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_color", R.drawable.socks_1_color), null));
                dollLayers.setDrawable(8, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_line", R.drawable.socks_1_line), null));
                dollLayers.setDrawable(9, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_color", R.drawable.shoes_1_color), null));
                dollLayers.setDrawable(10, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_line", R.drawable.shoes_1_line), null));
                dollLayers.setDrawable(11, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_color", R.drawable.bottom_1_color), null));
                dollLayers.setDrawable(12, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_line", R.drawable.bottom_1_line), null));
                dollLayers.setDrawable(13, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_color", R.drawable.top_1_color), null));
                dollLayers.setDrawable(14, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_line", R.drawable.top_1_line), null));
                dollLayers.setDrawable(15, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
                dollLayers.setDrawable(16, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
                break;
            case "brows4":
                DVEditor.putInt("brows", R.drawable.brows_4);
                DVEditor.apply();
                dollLayers.setDrawable(0, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_color", R.drawable.back_hair_1_color), null));
                dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_line", R.drawable.back_hair_1_line), null));
                dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.body_base_full, null));
                dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
                dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
                dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
                dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
                dollLayers.setDrawable(7, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_color", R.drawable.socks_1_color), null));
                dollLayers.setDrawable(8, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_line", R.drawable.socks_1_line), null));
                dollLayers.setDrawable(9, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_color", R.drawable.shoes_1_color), null));
                dollLayers.setDrawable(10, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_line", R.drawable.shoes_1_line), null));
                dollLayers.setDrawable(11, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_color", R.drawable.bottom_1_color), null));
                dollLayers.setDrawable(12, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_line", R.drawable.bottom_1_line), null));
                dollLayers.setDrawable(13, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_color", R.drawable.top_1_color), null));
                dollLayers.setDrawable(14, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_line", R.drawable.top_1_line), null));
                dollLayers.setDrawable(15, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
                dollLayers.setDrawable(16, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
                break;
        }
        doll.setImageDrawable(dollLayers);
    }
}