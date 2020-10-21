package edu.temple.colorchangingapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class PaletteFragment extends Fragment {

    GridView grid;

    public PaletteFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View palatte =  inflater.inflate(R.layout.fragment_palette, container, false);

        grid = palatte.findViewById(R.id.gridView);
        final BaseAdapter gridAdapter = new CustomAdapter(this.getContext());
        grid.setAdapter(gridAdapter);

        return palatte;
    }
}