package com.rares.android_fundamentals.w3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.rares.android_fundamentals.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private TextView mEditTextResult;
    private CheckBox mCheckBoxTerms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        mEditTextEmail = findViewById(R.id.edit_text_email_address);
        mEditTextPhone = findViewById(R.id.edit_text_phone);
        mEditTextResult = findViewById(R.id.text_view_result);
        mCheckBoxTerms = findViewById(R.id.checkbox_terms);
    }

    private boolean isEmailValid() {
        if (mEditTextEmail != null) {
            String email = mEditTextEmail.getText().toString();
            if (email != null && !email.isEmpty()) {
                return true;
                //EditText.setError( email pattern
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean isPhoneValid() {
        if (mEditTextPhone != null) {
            String phone = mEditTextPhone.getText().toString();
            if (phone != null && !phone.isEmpty()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean isAccepted() {
        if (mCheckBoxTerms != null) {
            if (mCheckBoxTerms.isChecked()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void submitDataOnClick(View view) {
    }
}
