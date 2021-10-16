package ru.job4j.ood.lsp;

public class CarWight {
// Пример нарушения Инвариант принцип барбара Лесков - выполнение условия не во всех классах
    // при этом нарушена логика
    private int wight;

    public CarWight() {
        if (wight > 10_000) {
            throw new IllegalArgumentException("Not found!");
        }
    }

    public void result(int res) {
        if (wight > 10_000) {
            throw new IllegalArgumentException("Not found!");
        }
        wight = res;
    }

    static class Car extends CarWight {

        public Car() {
        }

        @Override
        public void result(int res) {
            for (int i = 0; i < res; i++) {
                i += i;
            }
        }
    }

    public static void main(String[] args) {
        CarWight carWight = new Car();
        carWight.result(2000000);
    }
}
