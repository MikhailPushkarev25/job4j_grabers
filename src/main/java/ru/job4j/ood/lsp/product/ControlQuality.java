package ru.job4j.ood.lsp.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControlQuality {

    private List<Store> stores = new ArrayList<>();

    public Long calculate(Food food) {
        long dateAll = food.getExpiryDate().toEpochDay() - food.getExpiryDate().toEpochDay();
        long dateNow = LocalDate.now().toEpochDay() - food.getCreateDate().toEpochDay();
        return dateAll * 100 / dateNow;
   }

   public void distribute(Food food) {
        for (Store store : stores) {
            store.add(food, calculate(food));
        }
   }

   public void resort(Food food) {
        List<Food> foods = new ArrayList<>();
        for (Store store : stores) {
            foods.addAll(store.get());
        }
        distribute(food);
   }
}
