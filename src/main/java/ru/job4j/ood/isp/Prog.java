package ru.job4j.ood.isp;

import java.util.List;

public interface Prog {
    /**
     * Нарушение принципа ISP - в том что если в интерфейсе больше 3-х методов
     * их нужно раскидать по по интерфейсам
     * @return
     */
    String name();
    int price();
    List<Integer> number();
    String computer();
    String System();
}
