package com.example.samsungproject;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import top.defaults.colorpicker.ColorObserver;
import top.defaults.colorpicker.ColorPickerPopup;
import top.defaults.colorpicker.ColorPickerView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences drawableValues;
    SharedPreferences.Editor DVEditor;
    ImageView doll;
    LayerDrawable dollLayers;
    Button eyesTabButton, browsTabButton, mouthTabButton, frontHairTabButton, backHairTabButton, topTabButton, bottomTabButton, socksTabButton, shoesTabButton, colorPickerButton;
    ConstraintLayout categoryContainer;
    ColorPickerView colorPickerView;
    FragmentManager categoryFM;
    EyesTab eyesTab;
    BrowsTab browsTab;
    MouthTab mouthTab;
    FrontHairTab frontHairTab;
    BackHairTab backHairTab;
    TopTab topTab;
    BottomTab bottomTab;
    SocksTab socksTab;
    ShoesTab shoesTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doll = findViewById(R.id.Doll);
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);
        colorPickerButton = findViewById(R.id.colorPickerButton);
        eyesTabButton = findViewById(R.id.eyesTabButton);
        browsTabButton = findViewById(R.id.browsTabButton);
        mouthTabButton = findViewById(R.id.mouthTabButton);
        frontHairTabButton = findViewById(R.id.frontHairTabButton);
        backHairTabButton = findViewById(R.id.backHairTabButton);
        topTabButton = findViewById(R.id.topTabButton);
        bottomTabButton = findViewById(R.id.bottomTabButton);
        socksTabButton = findViewById(R.id.socksTabButton);
        shoesTabButton = findViewById(R.id.shoesTabButton);
        categoryContainer = findViewById(R.id.categoryContainer);
        categoryFM = getSupportFragmentManager();
        eyesTab = new EyesTab();
        browsTab = new BrowsTab();
        mouthTab = new MouthTab();
        frontHairTab = new FrontHairTab();
        backHairTab = new BackHairTab();
        topTab = new TopTab();
        bottomTab = new BottomTab();
        socksTab = new SocksTab();
        shoesTab = new ShoesTab();
        drawableValues = getSharedPreferences("drawable_values", MODE_PRIVATE);
//        DVEditor = drawableValues.edit();
//        DVEditor.putInt("eye_color", R.drawable.eye_1_color);
//        DVEditor.putInt("eye_line", R.drawable.eye_1_line);
//        DVEditor.putInt("brows", R.drawable.brows_1);
//        DVEditor.putInt("mouth", R.drawable.mouth_1);
//        DVEditor.putInt("front_hair_color", R.drawable.front_hair_1_color);
//        DVEditor.putInt("front_hair_line", R.drawable.front_hair_1_line);
//        DVEditor.apply();
//        colorPickerButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int defaultColor = 0;
//                new ColorPickerPopup.Builder(MainActivity.this)
//                        .initialColor(Color.RED) // Set initial color
//                        .enableBrightness(true) // Enable brightness slider or not
//                        .enableAlpha(true) // Enable alpha slider or not
//                        .okTitle("Choose")
//                        .cancelTitle("Cancel")
//                        .showIndicator(true)
//                        .showValue(true)
//                        .build()
//                        .show(v, new ColorPickerPopup.ColorPickerObserver() {
//                            @Override
//                            public void onColorPicked(int color) {
//                                v.setBackgroundColor(colorPickerView.getColor());
//                            }
//                        });
//            }
//        });
        FragmentTransaction categoryFT = categoryFM.beginTransaction();
        if (savedInstanceState == null) {
            categoryFT.add(R.id.categoryContainer, eyesTab);
            categoryFT.commit();
            eyesTabButton.setEnabled(false);
        }
        eyesTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, eyesTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(false);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
            }
        });
        browsTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, browsTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(false);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
            }
        });
        mouthTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, mouthTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(false);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
            }
        });
        frontHairTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, frontHairTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(false);
                backHairTabButton.setEnabled(true);
                topTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
            }
        });
        backHairTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, backHairTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(false);
                topTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
            }
        });
        topTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, topTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                topTabButton.setEnabled(false);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
            }
        });
        bottomTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, bottomTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                topTabButton.setEnabled(true);
                bottomTabButton.setEnabled(false);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
            }
        });
        socksTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, socksTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                topTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(false);
                shoesTabButton.setEnabled(true);
            }
        });
        shoesTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, shoesTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                topTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(false);
            }
        });
    }
}