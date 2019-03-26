package com.rares.android_fundamentals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

// m e mebru al clase
// s e static
//caps lock constanta
//camel case ptr metoda

public class MainActivity extends AppCompatActivity {
    private TextView mTextViewHello;
    private EditText mEditTextEmail;
    private RatingBar mRatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mTextViewHello = findViewById(R.id.text_view_first);
        mTextViewHello.setText(getString(R.string.ana_are_mere));
        mEditTextEmail = findViewById(R.id.edit_text_email);
    }

    public void btnHelloOnClick(View view) {
        if (mEditTextEmail != null) {
            String email = mEditTextEmail.getText().toString();
            if (email != null && !email.isEmpty()) {
                mTextViewHello.setText(email);
            } else {
                mEditTextEmail.setError(getString(R.string.error_null_email));
            }
        } else {
            Toast.makeText(MainActivity.this, "Please make edit text not null!", Toast.LENGTH_LONG).show();
        }
        mRatingBar.setVisibility(View.GONE);
    }
}
