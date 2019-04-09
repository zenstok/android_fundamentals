package com.rares.android_fundamentals.w5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.rares.android_fundamentals.R;

public class SecondActivity extends AppCompatActivity {
    private TextView mTextViewSentMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle dataReceived = getIntent().getExtras();
        String message = dataReceived.getString(FirstActivity.MESSAGE);
//        String messageReceived = getIntent().getStringExtra(FirstActivity.MESSAGE);
        mTextViewSentMessage.setText(message);
    }

    private void initView() {
        mTextViewSentMessage = findViewById(R.id.sentMessage);
    }
}
