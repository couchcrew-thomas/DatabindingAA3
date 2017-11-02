package com.example.databinding_aa.databindingaa;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import org.androidannotations.annotations.EView;

@EView
public class BindingViewAA extends AppCompatTextView {

    @BindingAdapter("data")
    public static void setData(BindingViewAA view, BindingData data) {
        view.setText(data.getBar() + data.getFoo());
    }

    public BindingViewAA(Context context) {
        super(context);
    }

    public BindingViewAA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BindingViewAA(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
