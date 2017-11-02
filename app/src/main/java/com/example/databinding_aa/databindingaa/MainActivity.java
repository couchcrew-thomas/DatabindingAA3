package com.example.databinding_aa.databindingaa;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.binding_layout);
        binding.setVariable(BR.greeting, "Hello");
        binding.setVariable(BR.data, new BindingData("foo", "bar"));
    }
}
