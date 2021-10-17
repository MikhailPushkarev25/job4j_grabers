package ru.job4j.ood.lsp.product;

import java.util.List;

public interface Store {

    void add(Food food, Long num);
    List<Food> get();
}
