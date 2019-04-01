package com.rares.android_fundamentals.w3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.rares.android_fundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class SpinnerCodeChallengeActivity extends AppCompatActivity {
    private List<String> mSweets;
    private Spinner mSpinnerSweets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_code_challenge);

        initView();
        setSweets();
        setAdapter();
    }

    private void initView() {
        mSpinnerSweets = findViewById(R.id.spinner_sweets);
    }

    private void setAdapter() {
        mSpinnerSweets.setAdapter(new ArrayAdapter<>(SpinnerCodeChallengeActivity.this, android.R.layout.simple_list_item_1, mSweets));
    }

    private void setSweets() {
        mSweets = new ArrayList<>();
        mSweets.add("Cupcake");
        mSweets.add("Donut");
        mSweets.add("Eclair");
        mSweets.add("Kitkat");
        mSweets.add("Pie");
    }
}
