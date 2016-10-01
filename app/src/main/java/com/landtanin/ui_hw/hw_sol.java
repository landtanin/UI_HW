package com.landtanin.ui_hw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by landtanin on 10/1/2016 AD.
 */

public class hw_sol extends AppCompatActivity {

    private CustomViewGroup viewGroup1, viewGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw_sol);

        viewGroup1 = (CustomViewGroup) findViewById(R.id.viewGroup1);
        viewGroup2 = (CustomViewGroup) findViewById(R.id.viewGroup2);

        viewGroup1.setButtonText("Hello");

    }
}
