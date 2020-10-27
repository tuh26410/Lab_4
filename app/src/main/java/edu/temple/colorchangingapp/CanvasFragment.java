package edu.temple.colorchangingapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CanvasFragment extends Fragment {

    private static final String COLOR_NAMES_KEY = "NAME_KEY";
    private static final String COLOR_VALUES_KEY = "VALUES_KEY";


    TextView display;
    String blank = " ";

    public CanvasFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View canvas = inflater.inflate(R.layout.fragment_canvas, container, false);

        display = canvas.findViewById(R.id.canvasTextView);
        display.setTextSize(34);
        display.setText(blank);

        return canvas;
    }

    public void changeColor(Bundle color){
        display.setText(color.getString(COLOR_NAMES_KEY));
        display.setBackgroundColor(color.getInt(COLOR_VALUES_KEY));
        if(display.getText().toString().equals(getResources().getString(R.string.black))){
            display.setTextColor(Color.WHITE);
        }else{
            display.setTextColor(Color.BLACK);
        }
    }

}