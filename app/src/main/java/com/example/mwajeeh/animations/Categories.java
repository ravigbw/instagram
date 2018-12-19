package com.example.mwajeeh.animations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Categories {
    private static List<Category> categories = generateItems();

    public static List<Category> getCategories() {
        return categories;
    }

    private static List<Category> generateItems() {
        Random rand = new Random();
        List<Category> items = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            items.add(new Category("title:" + i, getImage(i)));
        }
        return items;
    }

    public static class Category {
        public final String title;
        public final int image;

        private Category(String title, int image) {
            this.title = title;
            this.image = image;
        }
    }

    private static int getImage(int position) {
        if (position%2==0){
            return R.drawable.image_1;

        }else{
            return R.drawable.image_2;

        }
        /*switch (position) {
            case 0:
                return R.drawable.image_1;
            default:
                return R.drawable.image_2;
        }*/
    }
}
