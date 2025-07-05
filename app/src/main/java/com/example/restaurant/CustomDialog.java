package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomDialog extends AppCompatActivity implements View.OnClickListener {
    private Button btnEasy, btnMedium, btnHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);

        btnEasy = findViewById(R.id.btnEasy);
        btnEasy.setOnClickListener(this);
        btnMedium = findViewById(R.id.btnMedium);
        btnMedium.setOnClickListener(this);
        btnHard = findViewById(R.id.btnHard);
        btnHard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int initBudget = 0;
        Intent intent = new Intent(this, GameActivity.class);
        if (v == btnEasy)
            initBudget = 1500;
        if (v == btnMedium)
            initBudget = 1000;
        if (v == btnHard)
            initBudget = 500;
        intent.putExtra("initBudget", initBudget);
        startActivity(intent);
    }
}