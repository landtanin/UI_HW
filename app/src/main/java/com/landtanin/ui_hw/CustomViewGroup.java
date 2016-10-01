package com.landtanin.ui_hw;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;

/**
 * Created by landtanin on 9/30/2016 AD.
 */

public class CustomViewGroup extends FrameLayout{

    private Button btnHello;


    public CustomViewGroup(Context context) {
        super(context);
        initInflate();
        initInstance();
    }

    public CustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInflate();
        initInstance();
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
        initInstance();
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInflate();
        initInstance();
    }

    private void initInflate() {

        // inflate(Mr.Context who will talk to layoutInflater, which layout, embed where[itself, hence, this]);
        inflate(getContext(), R.layout.sample_layout, this);
    }

    private void initInstance() {

        btnHello = (Button) findViewById(R.id.btnCustomViewGroupHello);

    }

    public void setButtonText(String text) {

        btnHello.setText(text);

    }

}
