package edu.temple.colorchangingapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements PaletteFragment.gridInterface{

    String[] colorNames;
    int[] colorValues = {Color.RED, Color.BLUE, Color.BLACK, Color.GREEN, Color.WHITE, Color.LTGRAY, Color.DKGRAY, Color.MAGENTA, Color.YELLOW, Color.CYAN};

    CanvasFragment canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorNames = getResources().getStringArray(R.array.colorName);

        canvas = new CanvasFragment();

        FragmentManager manger = getSupportFragmentManager();

        FragmentTransaction transaction = manger.beginTransaction();
        transaction.add(R.id.container1, canvas)
                   .add(R.id.container2, PaletteFragment.newInstance(colorNames, colorValues))
                   .commit();

    }

    public void itemSelected(Bundle color){
        canvas.changeColor(color);
    }

}