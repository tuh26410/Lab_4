package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {

    TextView background = findViewById(R.id.background);
    TextView display = findViewById(R.id.displayColor);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();

        display.setText(intent.getStringExtra("colorName"));
        display.setBackgroundColor(intent.getIntExtra("colorVal", -1));

    }
}