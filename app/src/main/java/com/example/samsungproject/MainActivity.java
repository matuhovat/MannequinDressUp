package com.example.samsungproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import top.defaults.colorpicker.ColorObserver;
import top.defaults.colorpicker.ColorPickerPopup;
import top.defaults.colorpicker.ColorPickerView;

public class MainActivity extends AppCompatActivity {

    ImageView baseImage;
    Button eyesTabButton, browsTabButton, mouthTabButton, frontHairTabButton, topTabButton, colorPickerButton;
    ConstraintLayout categoryContainer;
    ColorPickerView colorPickerView;
    FragmentManager categoryFM;
    EyesTab eyesTab;
    BrowsTab browsTab;
    MouthTab mouthTab;
    FrontHairTab frontHairTab;
    TopTab topTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorPickerButton = findViewById(R.id.colorPickerButton);
        eyesTabButton = findViewById(R.id.eyesTabButton);
        browsTabButton = findViewById(R.id.browsTabButton);
        mouthTabButton = findViewById(R.id.mouthTabButton);
        frontHairTabButton = findViewById(R.id.frontHairTabButton);
        topTabButton = findViewById(R.id.topTabButton);
        categoryContainer = findViewById(R.id.categoryContainer);
        categoryFM = getSupportFragmentManager();
        eyesTab = new EyesTab();
        browsTab = new BrowsTab();
        mouthTab = new MouthTab();
        frontHairTab = new FrontHairTab();
        topTab = new TopTab();
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
                topTabButton.setEnabled(true);
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
                topTabButton.setEnabled(true);
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
                topTabButton.setEnabled(true);
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
                topTabButton.setEnabled(true);
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
                topTabButton.setEnabled(false);
            }
        });
    }
}