package com.example.restaurant;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DifficultyDialog extends Dialog implements View.OnClickListener {
    Button btnEasy, btnMedium, btnHard, btnCancel;

    public DifficultyDialog(Context context) {
        super(context);
        setContentView(R.layout.activity_difficulty_dialog);

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
        String difficulty = "";
        if (v == btnCancel) {
            dismiss();
            return;
        }
        if (v == btnEasy)
            difficulty = "Easy";
        if (v == btnMedium)
            difficulty = "Medium";
        if (v == btnHard)
            difficulty = "Hard";
        if (!difficulty.isEmpty()) {
            startGame(getContext(), difficulty);
        }
    }

    private void startGame(Context context, String difficulty) {
        Intent intent = new Intent(context, GameActivity.class);
        intent.putExtra("difficulty", difficulty);
        context.startActivity(intent);

    }
}
