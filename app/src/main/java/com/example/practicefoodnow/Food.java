package com.example.practicefoodnow;

import java.util.ArrayList;

public class Food {
    String Name;
    String Price;
    int Image;

    public Food(String name, String price, int image) {
        Name = name;
        Price = price;
        Image = image;
    }

    static ArrayList<Food> init () {
        ArrayList<Food> tmp = new ArrayList<>();
        tmp.add(new Food("Coffee", "20000", R.drawable.ic_black_coffee));
        tmp.add(new Food("Banh Mi", "40000", R.drawable.ic_banh_mi));
        tmp.add(new Food("Coffee", "20000", R.drawable.ic_black_coffee));
        tmp.add(new Food("Banh Mi", "40000", R.drawable.ic_banh_mi));
        tmp.add(new Food("Coffee", "20000", R.drawable.ic_black_coffee));
        tmp.add(new Food("Banh Mi", "40000", R.drawable.ic_banh_mi));
        tmp.add(new Food("Coffee", "20000", R.drawable.ic_black_coffee));
        tmp.add(new Food("Banh Mi", "40000", R.drawable.ic_banh_mi));

        return tmp;
    }
}
