package edu.temple.colorchangingapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class PaletteFragment extends Fragment {

    GridView grid;
    TextView label;

    public PaletteFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View palette =  inflater.inflate(R.layout.fragment_palette, container, false);

        label = palette.findViewById(R.id.label);
        label.setText(getResources().getString(R.string.labelText));

        grid = palette.findViewById(R.id.gridView);
        //final BaseAdapter gridAdapter = new CustomAdapter(palette.getContext());
        //grid.setAdapter(gridAdapter);

        return palette;
    }
}