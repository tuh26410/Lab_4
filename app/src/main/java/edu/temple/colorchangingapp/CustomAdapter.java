package edu.temple.colorchangingapp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Integer> colorVal= new ArrayList<Integer>();
    ArrayList<String> colorName = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<Integer> colorVal) {
        this.context = context;
        this.colorVal = colorVal;
    }

    @Override
    public int getCount() {
        return colorVal.size();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public View getView(int i, View View, ViewGroup viewGroup) {

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

        TextView text = new TextView(context);
        text.setText(colorName.get(i));
        text.setBackgroundColor(colorVal.get(i));
        text.setTextSize(22);
        text.setPadding(20, 20, 20, 20);

        if(text.getText() == "Black"){
            text.setTextColor(Color.WHITE);
        }

        return text;
    }
}