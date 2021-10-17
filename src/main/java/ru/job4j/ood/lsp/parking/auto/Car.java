package ru.job4j.ood.lsp.parking.auto;

import java.util.List;

public interface Car {

    List<Auto> get();
    boolean result(Auto auto, int size);
}
