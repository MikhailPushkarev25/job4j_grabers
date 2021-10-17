package ru.job4j.ood.lsp.parking.auto;

import java.util.Objects;

public class Auto {

    private String name;
    private int number;

    public Auto(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return number == auto.number &&
                Objects.equals(name, auto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
