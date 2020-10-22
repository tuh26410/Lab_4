package edu.temple.colorchangingapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;

    int[] colorVal;
    String[] colorName;

    private static final String COLOR_NAMES_KEY = "NAME_KEY";
    private static final String COLOR_VALUES_KEY = "VALUES_KEY";

    public CustomAdapter(Context context, String[] names, int[] values) {
        this.context = context;
        colorName = names;
        colorVal = values;
    }

    @Override
    public int getCount() {
        return colorVal.length;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        Bundle color = new Bundle();
        color.putInt(COLOR_VALUES_KEY, colorVal[i]);
        color.putString(COLOR_NAMES_KEY, colorName[i]);
        return color;
    }

    @Override
    public View getView(int i, View View, ViewGroup viewGroup) {
        TextView text = new TextView(context);
        text.setText(colorName[i]);
        text.setBackgroundColor(colorVal[i]);
        text.setTextSize(22);
        text.setPadding(20, 20, 20, 20);

        if(colorVal[i] ==  Color.BLACK){
            text.setTextColor(Color.WHITE);
        }

        return text;
    }
}