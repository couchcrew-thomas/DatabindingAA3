package com.example.databinding_aa.databindingaa;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class BindingViewNoAA extends AppCompatTextView {

    @BindingAdapter("data")
    public static void setData(BindingViewNoAA view, BindingData data) {
        view.setText(data.getFoo() + data.getBar());
    }

    public BindingViewNoAA(Context context) {
        super(context);
    }

    public BindingViewNoAA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BindingViewNoAA(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
