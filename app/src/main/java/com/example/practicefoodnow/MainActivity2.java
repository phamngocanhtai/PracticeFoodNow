package com.example.practicefoodnow;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    ArrayList<Food> arrayList;
    FoodAdaptor foodAdaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.listMenu);
        arrayList = Food.init();
        foodAdaptor = new FoodAdaptor(MainActivity2.this, arrayList);
        listView.setAdapter(foodAdaptor);

    }
}