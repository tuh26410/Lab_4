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
    ArrayList<Integer> colorVal;
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

        colorName.add(context.getResources().getString(R.string.red));
        colorName.add(context.getResources().getString(R.string.blue));
        colorName.add(context.getResources().getString(R.string.black));
        colorName.add(context.getResources().getString(R.string.green));
        colorName.add(context.getResources().getString(R.string.white));
        colorName.add(context.getResources().getString(R.string.lightGrey));
        colorName.add(context.getResources().getString(R.string.darkGrey));
        colorName.add(context.getResources().getString(R.string.magenta));
        colorName.add(context.getResources().getString(R.string.yellow));
        colorName.add(context.getResources().getString(R.string.cyan));

        TextView text = new TextView(context);
        text.setText(colorName.get(i));
        text.setBackgroundColor(colorVal.get(i));
        text.setTextSize(22);
        text.setPadding(20, 20, 20, 20);

        if(text.getText() == context.getResources().getString(R.string.black)){
            text.setTextColor(Color.WHITE);
        }

        return text;
    }
}