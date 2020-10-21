package edu.temple.colorchangingapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class PaletteFragment extends Fragment {

    GridView grid;
    TextView label;

    public static final String COLOR_NAMES_KEY = "NAME_KEY";

    public PaletteFragment() {

    }

    public static PaletteFragment newInstance(String[] names, int[] values){
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View palette =  inflater.inflate(R.layout.fragment_palette, container, false);

        label = palette.findViewById(R.id.label);
        label.setText(getResources().getString(R.string.labelText));

        grid = palette.findViewById(R.id.gridView);
        grid.setAdapter(new CustomAdapter(palette.getContext()));

        return palette;
    }

    interface gridInterface{
        void itemSelected(String colorName, int colorVal);
    }
}