package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnNewGame, btnLoadGame, btnGuide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewGame = findViewById(R.id.btnNewGame);
        btnNewGame.setOnClickListener(this);
        btnLoadGame = findViewById(R.id.btnLoadGame);
        btnLoadGame.setOnClickListener(this);
        btnGuide = findViewById(R.id.btnGuide);
        btnGuide.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
    }

}