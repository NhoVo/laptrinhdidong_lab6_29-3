package com.example.laptrinhdidong_lab6_29_3.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.laptrinhdidong_lab6_29_3.R;

public class MainActivity_Shoes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ShoesFragment shoesFragment = new ShoesFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frmLayout, shoesFragment, "shoesFragment")
                .commit();//gán fragment vào frmLayout
    }
}
