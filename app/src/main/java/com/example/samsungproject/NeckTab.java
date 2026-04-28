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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NeckTab#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NeckTab extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView doll;
    LayerDrawable dollLayers;
    ImageButton neckButton1, neckButton2, neckButton3, neckButton4, neckButton5, neckButton6;
    SharedPreferences drawableValues;
    SharedPreferences.Editor DVEditor;

    public NeckTab() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NeckTab.
     */
    // TODO: Rename and change types and number of parameters
    public static NeckTab newInstance(String param1, String param2) {
        NeckTab fragment = new NeckTab();
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
        View v = inflater.inflate(R.layout.fragment_neck_tab, container, false);
        neckButton1 = v.findViewById(R.id.neckButton1);
        neckButton2 = v.findViewById(R.id.neckButton2);
        neckButton3 = v.findViewById(R.id.neckButton3);
        neckButton4 = v.findViewById(R.id.neckButton4);
        neckButton5 = v.findViewById(R.id.neckButton5);
        neckButton6 = v.findViewById(R.id.neckButton6);
        neckButton1.setOnClickListener(this);
        neckButton2.setOnClickListener(this);
        neckButton3.setOnClickListener(this);
        neckButton4.setOnClickListener(this);
        neckButton5.setOnClickListener(this);
        neckButton6.setOnClickListener(this);
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
            case "neck1":
                DVEditor.putInt("neck_color", R.drawable.empty);
                DVEditor.putInt("neck_line", R.drawable.empty);
                DVEditor.apply();
                break;
            case "neck2":
                DVEditor.putInt("neck_color", R.drawable.neck_1_color);
                DVEditor.putInt("neck_line", R.drawable.neck_1_line);
                DVEditor.apply();
                break;
            case "neck3":
                DVEditor.putInt("neck_color", R.drawable.neck_2_color);
                DVEditor.putInt("neck_line", R.drawable.neck_2_line);
                DVEditor.apply();
                break;
            case "neck4":
                DVEditor.putInt("neck_color", R.drawable.neck_3_color);
                DVEditor.putInt("neck_line", R.drawable.neck_3_line);
                DVEditor.apply();
                break;
            case "neck5":
                DVEditor.putInt("neck_color", R.drawable.neck_4_color);
                DVEditor.putInt("neck_line", R.drawable.neck_4_line);
                DVEditor.apply();
                break;
            case "neck6":
                DVEditor.putInt("neck_color", R.drawable.neck_5_color);
                DVEditor.putInt("neck_line", R.drawable.neck_5_line);
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