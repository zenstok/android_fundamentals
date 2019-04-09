package com.rares.android_fundamentals.w5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rares.android_fundamentals.R;

public class FirstActivity extends AppCompatActivity {
    private TextView mTw;
    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void startSecondActivityOnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void callImplicitIntentOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0777777777"));
        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void sendDataOnClick(View view) {
        mTw = findViewById(R.id.tw_send_data);
        String message = "message was null";
        if(mTw != null && mTw.getText().toString() != null && mTw.getText().toString().length() != 0) {
            message = mTw.getText().toString();
            Intent sendMessage = new Intent(FirstActivity.this,SecondActivity.class);
            sendMessage.putExtra(MESSAGE, message);
            startActivity(sendMessage);
        } else {
            Toast.makeText(this,"Please put a text in the input!", Toast.LENGTH_SHORT).show();
        }

    }
}
