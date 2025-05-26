package com.example.samsungproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    ImageView baseImage;
    Button frontHairTabButton, eyesTabButton, topTabButton, colorPickerButton;
    ConstraintLayout categoryContainer;
    FragmentManager categoryFM;
    FrontHairTab frontHairTab;
    EyesTab eyesTab;
    TopTab topTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorPickerButton = findViewById(R.id.colorPickerButton);
        eyesTabButton = findViewById(R.id.eyesTabButton);
        frontHairTabButton = findViewById(R.id.frontHairTabButton);
        topTabButton = findViewById(R.id.topTabButton);
        categoryContainer = findViewById(R.id.categoryContainer);
        categoryFM = getSupportFragmentManager();
        frontHairTab = new FrontHairTab();
        eyesTab = new EyesTab();
        topTab = new TopTab();
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
                frontHairTabButton.setEnabled(true);
                eyesTabButton.setEnabled(false);
                topTabButton.setEnabled(true);
            }
        });
        frontHairTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, frontHairTab);
                categoryFT.commit();
                frontHairTabButton.setEnabled(false);
                eyesTabButton.setEnabled(true);
                topTabButton.setEnabled(true);
            }
        });
        topTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, topTab);
                categoryFT.commit();
                frontHairTabButton.setEnabled(true);
                eyesTabButton.setEnabled(true);
                topTabButton.setEnabled(false);
            }
        });
    }
}