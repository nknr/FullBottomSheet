package com.androidforum.fullbottomsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;


import com.androidforum.fullbottomsheet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init();
    }

    private void init() {
        binding.openBottomSheet.setOnClickListener(view -> {
            BottomSheet bottomSheet = new BottomSheet();
            bottomSheet.show(getSupportFragmentManager(),bottomSheet.getTag());
        });
    }
}
