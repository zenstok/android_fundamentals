package com.rares.android_fundamentals.w5_w6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.rares.android_fundamentals.R;

public class DebugActivity extends AppCompatActivity {

    private ToggleButton mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        initView();
    }

    private void initView() {
        mSwitch = findViewById(R.id.toggleButton);
    }

    public void displayStatusSwitchOnClick(View view) {
        String message = "";
        if(mSwitch.isChecked()) {
            message = "Switch is on";
        } else {
            message = "Switch is off";
        }

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
