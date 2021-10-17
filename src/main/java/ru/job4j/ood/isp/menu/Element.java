package ru.job4j.ood.isp.menu;

import java.util.List;

public interface Element {

    void print();
    void add(Element element);
    void run();
    List<Element> getList();
}
