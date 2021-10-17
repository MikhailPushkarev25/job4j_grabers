package ru.job4j.ood.lsp.parking.auto.parking;

import ru.job4j.ood.lsp.parking.auto.Auto;
import ru.job4j.ood.lsp.parking.auto.Car;

import java.util.ArrayList;
import java.util.List;

public class CarParking implements Car {

    private List<Auto> autos = new ArrayList<>();

    @Override
    public List<Auto> get() {
        return autos;
    }

    @Override
    public boolean result(Auto auto, int size) {
        boolean flag = false;
        if (size == 1) {
            autos.add(auto);
            flag = true;
        } else {
            System.out.println("Автомобиль не должен здесь стоять!");
        }
        return flag;
    }
}
