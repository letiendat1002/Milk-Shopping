package com.example.milkshop.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.milkshop.R;

public class ChiTietActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}