package com.example.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DifficultyActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnEasy, btnMedium, btnHard, btnCancel;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
        btnEasy = findViewById(R.id.btnEasy);
        btnEasy.setOnClickListener(this);
        btnMedium = findViewById(R.id.btnMedium);
        btnMedium.setOnClickListener(this);
        btnHard = findViewById(R.id.btnHard);
        btnHard.setOnClickListener(this);
        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnCancel)
            startActivity(new Intent(this, MainActivity.class));
        else {
            int budget = 0;
            Intent intent = new Intent(this, GameActivity.class);
            if (v==btnEasy)
                budget = 1500;
            if (v==btnMedium)
                budget = 1000;
            if(v == btnHard)
                budget = 500;
            intent.putExtra("budget",budget);
            startActivity(intent);
        }


    }
}
