package com.rares.android_fundamentals.w4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.rares.android_fundamentals.R;

public class CarViewHolder extends RecyclerView.ViewHolder {
    private TextView mTextViewName;
    private TextView mTextViewColor;
    private TextView mTextViewHp;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        mTextViewName = itemView.findViewById(R.id.text_view_name);
        mTextViewColor = itemView.findViewById(R.id.text_view_color);
        mTextViewHp = itemView.findViewById(R.id.text_view_hp);
    }

    public TextView getmTextViewName() {
        return mTextViewName;
    }

    public void setmTextViewName(TextView mTextViewName) {
        this.mTextViewName = mTextViewName;
    }

    public TextView getmTextViewColor() {
        return mTextViewColor;
    }

    public void setmTextViewColor(TextView mTextViewColor) {
        this.mTextViewColor = mTextViewColor;
    }

    public TextView getmTextViewHp() {
        return mTextViewHp;
    }

    public void setmTextViewHp(TextView mTextViewHp) {
        this.mTextViewHp = mTextViewHp;
    }
}
