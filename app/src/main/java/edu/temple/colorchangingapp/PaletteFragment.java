package edu.temple.colorchangingapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class PaletteFragment extends Fragment {

    GridView grid;
    TextView label;

    gridInterface parentActivity;

    private static final String COLOR_NAMES_KEY = "NAME_KEY";
    private static final String COLOR_VALUES_KEY = "VALUES_KEY";

    String[] colorNames;
    int[] colorValues;

    public PaletteFragment() {

    }

    public static PaletteFragment newInstance(String[] names, int[] values){
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putStringArray(COLOR_NAMES_KEY, names);
        args.putIntArray(COLOR_VALUES_KEY, values);
        fragment.setArguments(args);
        return fragment;
    }

    public void onAttach(@NonNull Context context){
        super.onAttach(context);
        if(context instanceof  gridInterface){
            parentActivity = (gridInterface) context;
        } else {
            throw new RuntimeException("Implement gridInterface on the Activity that the fragment is attached to.");
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
            colorNames = getArguments().getStringArray(COLOR_NAMES_KEY);
            colorValues = getArguments().getIntArray(COLOR_VALUES_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View palette =  inflater.inflate(R.layout.fragment_palette, container, false);

        label = palette.findViewById(R.id.label);
        label.setText(getResources().getString(R.string.labelText));

        grid = palette.findViewById(R.id.gridView);
        grid.setAdapter(new CustomAdapter((Context) parentActivity, colorNames, colorValues));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                parentActivity.itemSelected((Bundle) adapterView.getItemAtPosition(i));
            }
        });

        return palette;
    }

    interface gridInterface{
        void itemSelected(Bundle color);
    }
}