package com.landtanin.ui_hw;

import android.content.Intent;
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

        Intent intent = getIntent();

        // Bundle
        Bundle bundle = intent.getExtras().getBundle("cBundle");
        bundle.getInt("x");
        bundle.getInt("y");
        bundle.getInt("z");

        // Serializable
        CooridnateSerializable c2 = (CooridnateSerializable) intent.getSerializableExtra("cSerialiable");

        // Parcelable
        CoordinateParcelable c3 = intent.getParcelableExtra("cParcelable");

        // we can now directly use c2 and c3
        int a = c3.x;
    }
}
