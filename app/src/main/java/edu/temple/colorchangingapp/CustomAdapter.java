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
    ArrayList<Integer> colorVal = new ArrayList<Integer>();

    public CustomAdapter(Context context) {
        this.context = context;
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
        String[] colorName = context.getResources().getStringArray(R.array.colorName);

        colorVal.add(Color.RED);
        colorVal.add(Color.BLUE);
        colorVal.add(Color.BLACK);
        colorVal.add(Color.GREEN);
        colorVal.add(Color.WHITE);
        colorVal.add(Color.LTGRAY);
        colorVal.add(Color.DKGRAY);
        colorVal.add(Color.MAGENTA);
        colorVal.add(Color.YELLOW);
        colorVal.add(Color.CYAN);

        TextView text = new TextView(context);
        text.setText(colorName[i]);
        text.setBackgroundColor(colorVal.get(i));
        text.setTextSize(22);
        text.setPadding(20, 20, 20, 20);

        if(text.getText().toString().equals(context.getResources().getString(R.string.black))){
            text.setTextColor(Color.WHITE);
        }

        return text;
    }
}