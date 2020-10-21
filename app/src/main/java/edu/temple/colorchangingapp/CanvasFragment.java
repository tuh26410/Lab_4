package edu.temple.colorchangingapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CanvasFragment extends Fragment {

    String colorName;
    int colorVal;

    public CanvasFragment(String Name, int Val) {
        colorName = Name;
        colorVal = Val;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View canvas = inflater.inflate(R.layout.fragment_canvas, container, false);
        canvas.setBackgroundColor(colorVal);

        TextView display = canvas.findViewById(R.id.canvasTextView);
        display.setText(colorName);
        display.setTextSize(34);
        if(display.getText().toString().equals(getResources().getString(R.string.black))){
            display.setTextColor(Color.WHITE);
        }

        return canvas;
    }
}