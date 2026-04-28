package com.example.samsungproject;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.jaredrummler.android.colorpicker.ColorPickerDialog;
import com.jaredrummler.android.colorpicker.ColorPickerDialogListener;

public class MainActivity extends AppCompatActivity implements ColorPickerDialogListener {

    SharedPreferences drawableValues;
    ImageView doll;
    LayerDrawable dollLayers;
    Button eyesTabButton, browsTabButton, mouthTabButton, frontHairTabButton, backHairTabButton, topTabButton, bottomTabButton, socksTabButton, shoesTabButton, hatTabButton, neckTabButton, colorPickerButton, skinColorPickerButton;
    ConstraintLayout categoryContainer;
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
    HatTab hatTab;
    NeckTab neckTab;
    int colorId = 0;
    final int skinColorId = 9;
    SharedPreferences.Editor DVEditor;

    private void createColorPickerDialog(int id) {
        ColorPickerDialog.newBuilder()
                .setColor(Color.RED)
                .setDialogType(ColorPickerDialog.TYPE_PRESETS)
                .setAllowCustom(true)
                .setAllowPresets(true)
                .setDialogId(id)
                .show(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doll = findViewById(R.id.Doll);
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);
        colorPickerButton = findViewById(R.id.colorPickerButton);
        skinColorPickerButton = findViewById(R.id.skinColorPickerButton);
        eyesTabButton = findViewById(R.id.eyesTabButton);
        browsTabButton = findViewById(R.id.browsTabButton);
        mouthTabButton = findViewById(R.id.mouthTabButton);
        frontHairTabButton = findViewById(R.id.frontHairTabButton);
        backHairTabButton = findViewById(R.id.backHairTabButton);
        topTabButton = findViewById(R.id.topTabButton);
        bottomTabButton = findViewById(R.id.bottomTabButton);
        socksTabButton = findViewById(R.id.socksTabButton);
        shoesTabButton = findViewById(R.id.shoesTabButton);
        hatTabButton = findViewById(R.id.hatTabButton);
        neckTabButton = findViewById(R.id.neckTabButton);
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
        hatTab = new HatTab();
        neckTab = new NeckTab();
        drawableValues = getSharedPreferences("drawable_values", MODE_PRIVATE);
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
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(true);
                colorId = 0;
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
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(false);
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
                topTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(false);
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
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(true);
                colorId = 1;
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
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(true);
                colorId = 2;
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
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(true);
                colorId = 3;
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
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(true);
                colorId = 4;
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
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(true);
                colorId = 5;
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
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(true);
                colorId = 6;
            }
        });
        hatTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, hatTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                topTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
                hatTabButton.setEnabled(false);
                neckTabButton.setEnabled(true);
                colorPickerButton.setEnabled(true);
                colorId = 7;
            }
        });
        neckTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction categoryFT = categoryFM.beginTransaction();
                categoryFT.replace(R.id.categoryContainer, neckTab);
                categoryFT.commit();
                eyesTabButton.setEnabled(true);
                browsTabButton.setEnabled(true);
                mouthTabButton.setEnabled(true);
                frontHairTabButton.setEnabled(true);
                backHairTabButton.setEnabled(true);
                topTabButton.setEnabled(true);
                bottomTabButton.setEnabled(true);
                socksTabButton.setEnabled(true);
                shoesTabButton.setEnabled(true);
                hatTabButton.setEnabled(true);
                neckTabButton.setEnabled(false);
                colorPickerButton.setEnabled(true);
                colorId = 8;
            }
        });
        colorPickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createColorPickerDialog(colorId);
            }
        });
        skinColorPickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createColorPickerDialog(skinColorId);
            }
        });
    }

    @Override
    public void onColorSelected(int dialogId, int color) {
        dollLayers = (LayerDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.doll_layers, null);
        switch (dialogId) {
            case 0:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("eye_color", R.drawable.eye_1_color), null).setTint(color);
                break;
            case 1:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hair_color", R.drawable.front_hair_1_color), null).setTint(color);
                break;
            case 2:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hair_color", R.drawable.back_hair_1_color), null).setTint(color);
                break;
            case 3:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("top_color", R.drawable.top_1_color), null).setTint(color);
                break;
            case 4:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("bottom_color", R.drawable.bottom_1_color), null).setTint(color);
                break;
            case 5:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("socks_color", R.drawable.socks_1_color), null).setTint(color);
                break;
            case 6:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("shoes_color", R.drawable.shoes_1_color), null).setTint(color);
                break;
            case 7:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("back_hat_color", R.drawable.empty), null).setTint(color);
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("front_hat_color", R.drawable.empty), null).setTint(color);
                break;
            case 8:
                ResourcesCompat.getDrawable(getResources(), drawableValues.getInt("neck_color", R.drawable.empty), null).setTint(color);
                break;
            case 9:
                ResourcesCompat.getDrawable(getResources(), R.drawable.body_base_color, null).setTint(color);
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

    @Override
    public void onDialogDismissed(int dialogId) {

    }
}