package com.landtanin.ui_hw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button getStartedBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStartedBtn = (Button) findViewById(R.id.getStartedBtn);


        // Bundle
        Coordinate c1 = new Coordinate();
        c1.x = 5;
        c1.y = 10;
        c1.z = 20;

        final Bundle bundle = new Bundle();
        bundle.putInt("x", c1.x);
        bundle.putInt("y", c1.y);
        bundle.putInt("z", c1.z);


        // Serializable
        final CooridnateSerializable c2 = new CooridnateSerializable();
        c2.x = 5;
        c2.y = 10;
        c2.z = 20;

        // Parcelable
        final CoordinateParcelable c3 = new CoordinateParcelable();
        c3.x = 5;
        c3.y = 10;
        c3.z = 20;

        getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent = new Intent(MainActivity.this, hw_sol.class);

                //Bundle
                intent.putExtra("cBundle", bundle);

                //Serializable
                intent.putExtra("cSerializable", c2);

                //Parcelable
                intent.putExtra("cParcelable", c3);

                startActivity(intent);
            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
