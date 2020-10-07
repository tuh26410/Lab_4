package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity {

    ArrayList<String> colorName;
    ArrayList<Integer> colorVal;

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        colorName = new ArrayList<>();
        colorVal = new ArrayList<>();

        colorName.add("Red");
        colorName.add("Blue");
        colorName.add("Black");
        colorName.add("Green");
        colorName.add("White");
        colorName.add("Light Grey");
        colorName.add("Dark Grey");
        colorName.add("Magenta");
        colorName.add("Yellow");
        colorName.add("Cyan");

        colorVal.add(Color.RED);
        colorVal.add(Color.BLUE);
        colorVal.add(Color.BLACK);
        colorVal.add(Color.GREEN);
        colorVal.add(Color.WHITE);
        colorVal.add(Color.LTGRAY);
        colorVal.add(Color.DKGRAY);
        colorVal.add(Color.MAGENTA);
        colorVal.add(Color.YELLOW);
        colorVal.add(Color.CYAN);

        final BaseAdapter gridAdapter = new CustomAdapter(this,colorVal);
        gridView.setAdapter(gridAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                intent.putExtra("colorName", colorName.get(i));
                intent.putExtra("colorVal", colorVal.get(i));
                startActivity(intent);
            }
        });

    }
}