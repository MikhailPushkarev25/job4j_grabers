package ru.job4j.ood.lsp.product;

import java.util.ArrayList;
import java.util.List;

public class Trash implements Store {

    private List<Food> foods = new ArrayList<>();

    @Override
    public void add(Food food, Long num) {
        if (num >= 75) {
            System.out.println("скидка на данный товар!");
        }
    }

    @Override
    public List<Food> get() {
        return foods;
    }
}
