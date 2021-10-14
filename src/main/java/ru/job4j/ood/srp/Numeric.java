package ru.job4j.ood.srp;

import java.util.List;

public class Numeric {
    /**
     * принцип SRP - я показываю нарушение принципа единственной ответственности
     * в моем классе три метода, сложение, добавления списка, возврат списка по индексу
     */
    private List<String> str;

    public int plus(int i) {
       return i + i;
    }

    public boolean add(String line) {
       return str.add(line);
    }

    public String get(int i) {
        return str.get(i);
    }
}
