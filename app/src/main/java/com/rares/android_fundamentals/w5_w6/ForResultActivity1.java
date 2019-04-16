package com.rares.android_fundamentals.w5_w6;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.rares.android_fundamentals.R;

public class ForResultActivity1 extends AppCompatActivity {
    private EditText mEditTextName;
    private CheckBox mCheckBox;
    public static final String NAME = "name";
    public static final String INPUT_VALUE = "input_value";
    public static final String CHECKBOX = "checkbox";
    public static final int CHANNEL = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result1);

        initView();
    }

    private void initView() {
        mEditTextName = findViewById(R.id.edit_text_name);
        mCheckBox = findViewById(R.id.checkBox);
    }

    public void sendNametoSecondActivityOnClick(View view) {
        if(mEditTextName != null && mEditTextName.getText() != null) {
            String name = mEditTextName.getText().toString();
            if(!TextUtils.isEmpty(name)) {
                Intent startSecondActivity = new Intent(ForResultActivity1.this,ForResultActivity2.class);
                startSecondActivity.putExtra(NAME, name);
                startActivityForResult(startSecondActivity, CHANNEL);

            } else {
                Toast.makeText(this,"Enter your name, you dummy!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CHANNEL && resultCode == RESULT_OK) {
            if(data != null) {
                String name = data.getStringExtra(NAME);
                mEditTextName.setText(name);

            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(mEditTextName != null && mEditTextName.getText().toString().length() != 0) {
            outState.putString(INPUT_VALUE, mEditTextName.getText().toString());
        }

        if(mCheckBox != null) {
            outState.putBoolean(CHECKBOX, mCheckBox.isChecked());
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null) {
            String inputValue = savedInstanceState.getString(INPUT_VALUE);
            Boolean checkBoxValue = savedInstanceState.getBoolean(CHECKBOX);
            if(mEditTextName != null && !TextUtils.isEmpty(inputValue)) {
                mEditTextName.setText(inputValue);
            }

            if(mCheckBox != null) {
                mCheckBox.setChecked(checkBoxValue);
            }
        }
    }
}
