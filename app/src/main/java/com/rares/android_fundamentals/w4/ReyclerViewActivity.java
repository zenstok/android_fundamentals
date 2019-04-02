package com.rares.android_fundamentals.w4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rares.android_fundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class ReyclerViewActivity extends AppCompatActivity {
    private RecyclerView mReyclerViewCars;
    private List<Car> mCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reycler_view);

        initView();
        setLayoutManager();
        setCars();
        setAdapter();
    }

    private void setAdapter() {
        CarAdapter carAdapter = new CarAdapter(mCars);
        mReyclerViewCars.setAdapter(carAdapter);
    }

    private void initView() {
        mReyclerViewCars = findViewById(R.id.recycler_view_cars);
    }

    private void setLayoutManager() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mReyclerViewCars.setLayoutManager(layoutManager);
    }

    private void setCars() {
        mCars = new ArrayList<>();
        mCars.add(new Car("BMW", "black", 350));
        mCars.add(new Car("Audi", "white", 700));
        mCars.add(new Car("Mercedes-Benz", "brown", 550));
        mCars.add(new Car("Dacia", "silver", 90));
        mCars.add(new Car("Fiat", "black", 155));
        mCars.add(new Car("Audi", "white", 300));
        mCars.add(new Car("Mercedes-Benz", "black", 550));
        mCars.add(new Car("Dacia", "white", 90));
        mCars.add(new Car("Fiat", "yellow", 155));
        mCars.add(new Car("Audi", "brown", 300));
    }
}
