package ru.job4j.ood.lsp.product;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Store {

    private List<Food> foods = new ArrayList<>();

    @Override
    public void add(Food food, Long num) {
        if (num >= 25 && num <= 75) {
            foods.add(food);
        } else {
            System.out.println("Данный продукт не подходит для этого хранилища!");
        }
    }

    @Override
    public List<Food> get() {
        return foods;
    }

    @Override
    public void remove(Food food) {
         foods.remove(food);
    }
}
