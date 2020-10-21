package edu.temple.colorchangingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PaletteFragment palette = new PaletteFragment();
        CanvasFragment canvas = new CanvasFragment();

        FragmentManager manger = getSupportFragmentManager();

        FragmentTransaction transaction = manger.beginTransaction();
        transaction.add(R.id.container1, canvas)
                   .add(R.id.container2, PaletteFragment.newInstance())
                   .commit();

    }


}