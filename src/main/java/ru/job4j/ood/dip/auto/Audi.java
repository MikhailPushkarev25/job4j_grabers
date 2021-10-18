package ru.job4j.ood.dip.auto;

public class Audi extends Car {


    public Audi(String name, int price) {
        super(name, price);
    }

    public int fuel(int f) {
        return f;
    }

    public static void main(String[] args) {
        Audi audi = new Audi("Sedan", 1_000_000);
        audi.fuel(95);
        audi.color("Green");
    }
}
