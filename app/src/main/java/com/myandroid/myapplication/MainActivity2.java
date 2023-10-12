package com.myandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        if (intent.getIntExtra("proverka_ragnarok", 0) == 1){
            ImageButton imageButton = new ImageButton(this);
            imageButton.setLayoutParams(new LinearLayout.LayoutParams(
                  110,144
            ));

            imageButton.setImageResource(R.drawable.ic_launcher_background);
            imageButton.setScaleType(ImageButton.ScaleType.CENTER_CROP);

            LinearLayout linearLayout = findViewById(R.id.parentLayout);
            linearLayout.addView(imageButton);

        }
    }
}