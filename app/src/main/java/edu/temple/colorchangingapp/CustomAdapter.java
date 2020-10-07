package edu.temple.colorchangingapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Integer> colors;
    ArrayList<String> colorName = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<Integer> colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

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

        final TextView text = new TextView(context);
        text.setPadding(5, 10, 10, 10);
        text.setText(colorName.get(i));
        text.setTextSize(22);
        text.setBackgroundColor(colors.get(i));

        return text;
    }
}
