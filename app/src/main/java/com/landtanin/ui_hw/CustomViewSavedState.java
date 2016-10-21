package com.landtanin.ui_hw;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/**
 * Created by landtanin on 10/12/2016 AD.
 */

public class CustomViewSavedState extends View.BaseSavedState{

    private boolean blue;

    public boolean isBlue() {
        return blue;
    }

    public void setBlue(boolean blue) {
        this.blue = blue;
    }

    public CustomViewSavedState(Parcel source) {
        super(source);

        // Read back

        blue = source.readInt() == 1;
        // if blue is true then 1, if blue is fault then 0;

    }

    public CustomViewSavedState(Parcelable superState) {
        super(superState);

    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);

        // Write vars here

        out.writeInt(blue ? 1 : 0);

    }

    public static final Creator CREATOR = new Creator() {
        @Override
        public Object createFromParcel(Parcel parcel) {
            return new CustomViewSavedState(parcel);
        }

        @Override
        public Object[] newArray(int i) {
            return new CustomViewSavedState[i];
        }
    };
}
