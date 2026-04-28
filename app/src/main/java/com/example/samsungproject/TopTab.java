package com.example.samsungproject;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TopTab extends Fragment implements View.OnClickListener {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView doll;
    LayerDrawable dollLayers;
    ImageButton topButton1, topButton2, topButton3, topButton4, topButton5;
    SharedPreferences drawableValues;
    SharedPreferences.Editor DVEditor;

    public TopTab() {
        // Required empty public constructor
    }

    public static TopTab newInstance(String param1, String param2) {
        TopTab fragment = new TopTab();
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
        View v = inflater.inflate(R.layout.fragment_top_tab, container, false);
        topButton1 = v.findViewById(R.id.topButton1);
        topButton2 = v.findViewById(R.id.topButton2);
        topButton3 = v.findViewById(R.id.topButton3);
        topButton4 = v.findViewById(R.id.topButton4);
        topButton5 = v.findViewById(R.id.topButton5);
        topButton1.setOnClickListener(this);
        topButton2.setOnClickListener(this);
        topButton3.setOnClickListener(this);
        topButton4.setOnClickListener(this);
        topButton5.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        MainActivity main = (MainActivity) getActivity();
        doll = main.findViewById(R.id.Doll);
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);
        drawableValues = getActivity().getSharedPreferences("drawable_values", MODE_PRIVATE);
        DVEditor = drawableValues.edit();
        switch (v.getTag().toString()) {
            default:
                break;
            case "top1":
                DVEditor.putInt("top_color", R.drawable.top_1_color);
                DVEditor.putInt("top_line", R.drawable.top_1_line);
                DVEditor.apply();
                break;
            case "top2":
                DVEditor.putInt("top_color", R.drawable.top_2_color);
                DVEditor.putInt("top_line", R.drawable.top_2_line);
                DVEditor.apply();
                break;
            case "top3":
                DVEditor.putInt("top_color", R.drawable.top_3_color);
                DVEditor.putInt("top_line", R.drawable.top_3_line);
                DVEditor.apply();
                break;
            case "top4":
                DVEditor.putInt("top_color", R.drawable.top_4_color);
                DVEditor.putInt("top_line", R.drawable.top_4_line);
                DVEditor.apply();
                break;
            case "top5":
                DVEditor.putInt("top_color", R.drawable.top_5_color);
                DVEditor.putInt("top_line", R.drawable.top_5_line);
                DVEditor.apply();
                break;
        }
        dollLayers.setDrawable(0, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_color", R.drawable.back_hair_1_color), null));
        dollLayers.setDrawable(1, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_line", R.drawable.back_hair_1_line), null));
        dollLayers.setDrawable(2, ResourcesCompat.getDrawable(getResources(), R.drawable.body_base_color, null));
        dollLayers.setDrawable(3, ResourcesCompat.getDrawable(getResources(), R.drawable.body_base_line, null));
        dollLayers.setDrawable(4, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null));
        dollLayers.setDrawable(5, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_line", R.drawable.eye_1_line), null));
        dollLayers.setDrawable(6, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("brows", R.drawable.brows_1), null));
        dollLayers.setDrawable(7, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("mouth", R.drawable.mouth_1), null));
        dollLayers.setDrawable(8, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_color", R.drawable.socks_1_color), null));
        dollLayers.setDrawable(9, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_line", R.drawable.socks_1_line), null));
        dollLayers.setDrawable(10, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_color", R.drawable.shoes_1_color), null));
        dollLayers.setDrawable(11, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_line", R.drawable.shoes_1_line), null));
        dollLayers.setDrawable(12, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_color", R.drawable.bottom_1_color), null));
        dollLayers.setDrawable(13, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_line", R.drawable.bottom_1_line), null));
        dollLayers.setDrawable(14, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_color", R.drawable.top_1_color), null));
        dollLayers.setDrawable(15, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_line", R.drawable.top_1_line), null));
        dollLayers.setDrawable(16, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("neck_color", R.drawable.empty), null));
        dollLayers.setDrawable(17, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("neck_line", R.drawable.empty), null));
        dollLayers.setDrawable(18, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hat_color", R.drawable.empty), null));
        dollLayers.setDrawable(19, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hat_line", R.drawable.empty), null));
        dollLayers.setDrawable(20, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null));
        dollLayers.setDrawable(21, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_line", R.drawable.front_hair_1_line), null));
        dollLayers.setDrawable(22, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hat_color", R.drawable.empty), null));
        dollLayers.setDrawable(23, ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hat_line", R.drawable.empty), null));
        doll.setImageDrawable(dollLayers);
    }
}