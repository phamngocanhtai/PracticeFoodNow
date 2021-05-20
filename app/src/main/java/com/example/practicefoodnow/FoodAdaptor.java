package com.example.practicefoodnow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FoodAdaptor extends ArrayAdapter<Food> {
    public FoodAdaptor(@NonNull Context context, @NonNull List<Food> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.layout_item, parent, false);

        Food food = getItem(position);

        ImageView imageLogo = convertView.findViewById(R.id.imageLogo);
        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtPrice = convertView.findViewById(R.id.txtPrice);

        imageLogo.setImageResource(food.Image);
        txtName.setText(food.Name);
        txtPrice.setText(food.Price);

        return convertView;
    }
}
