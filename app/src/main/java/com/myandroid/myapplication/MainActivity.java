
package com.myandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
Intent perenos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        perenos = getIntent();
    }
    public void Ragnarok(View v){
        Intent intent = new Intent(this, Ragnarok.class);
        startActivity(intent);
    }

    public void zakladki(View v){
        startActivity(perenos);
    }

}