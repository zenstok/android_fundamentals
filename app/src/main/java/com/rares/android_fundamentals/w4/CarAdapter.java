package com.rares.android_fundamentals.w4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rares.android_fundamentals.R;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {
    private List<Car> mCars;

    public CarAdapter(List<Car> mCars) {
        this.mCars = mCars;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.car_item,
                        viewGroup, false);
        return new CarViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder carViewHolder, int i) {
        Car currentCar = mCars.get(i);
        if(currentCar.getmName() != null && currentCar.getmName().length() > 0) {
            carViewHolder.getmTextViewName().setText(currentCar.getmName());
        }
        if(currentCar.getmColor() != null && currentCar.getmName().length() > 0) {
            carViewHolder.getmTextViewColor().setText(currentCar.getmColor());
        }
        if(currentCar.getmHp() > 0) {
            carViewHolder.getmTextViewHp().setText(currentCar.getmHp()+"");
        }
    }

    // get item count indica cate elemente din lista sa deseneze
    @Override
    public int getItemCount() {
        return mCars.size();
    }
}
