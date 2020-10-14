package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {

    TextView background;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        background = findViewById(R.id.background);
        display = findViewById(R.id.displayColor);

        Intent intent = getIntent();

        display.setText(intent.getStringExtra("colorName"));
        display.setTextSize(34);
        background.setBackgroundColor(intent.getIntExtra("colorVal", -1));

    }
}