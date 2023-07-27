package com.ssoftwares.pickupanddrop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

import androidx.annotation.Nullable;

public class MyRadioButton extends androidx.appcompat.widget.AppCompatRadioButton {


    public MyRadioButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        canvas.setMatrix(new Matrix());
        super.onDrawForeground(canvas);
    }

    @Override
    public void setForeground(Drawable foreground) {

        super.setForeground(foreground);
    }
}
