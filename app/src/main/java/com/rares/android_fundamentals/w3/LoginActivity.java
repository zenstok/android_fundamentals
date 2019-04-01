package com.rares.android_fundamentals.w3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rares.android_fundamentals.R;

public class LoginActivity extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private TextView mTextViewResult;
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
        mTextViewResult = findViewById(R.id.text_view_result);
        mCheckBoxTerms = findViewById(R.id.checkbox_terms);
    }

    private boolean isEmailValid() {
        if (mEditTextEmail != null) {
            String email = mEditTextEmail.getText().toString();
            if (email != null && !email.isEmpty()) {
                return true;
            } else {
                mEditTextEmail.setError("Introduceti emailul!");
                return false;
            }
        } else {
            Toast.makeText(this, "EmailEditText is null!", Toast.LENGTH_SHORT);
            return false;
        }
    }

    private boolean isPhoneValid() {
        if(mEditTextPhone != null) {
            String phone = mEditTextPhone.getText().toString();
            if(phone != null && !phone.isEmpty()) {
                return true;
            } else {
                mEditTextPhone.setError("Introduceti numarul de telefon!");
                return false;
            }
        } else {
            Toast.makeText(this, "PhoneEditText is null!", Toast.LENGTH_SHORT);
            return false;
        }
    }

    private boolean isAccepted() {
        if(mCheckBoxTerms != null) {
            if(mCheckBoxTerms.isChecked()) {
                return true;
            } else {
                mEditTextPhone.setError("Trebuie sa acceptati termenii si conditiile");
                return false;
            }
        } else {
            Toast.makeText(this, "CheckBox is null!", Toast.LENGTH_SHORT);
            return false;
        }
    }

    public void submitDataOnClick(View view) {
        if (isEmailValid() && isPhoneValid() && isAccepted()) {
            mTextViewResult.setText(mEditTextEmail.getText().toString()+" "+mEditTextPhone.getText().toString());
            //TODO create an Authentication object(class) in order to map the data from fields
        }
    }
}
