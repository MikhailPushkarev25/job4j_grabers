package ru.job4j.ood.isp.menu;

import java.util.ArrayList;
import java.util.List;

public class ElementRes implements Element {

    String name;
    List<Element> el = new ArrayList<>();

    public ElementRes(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (Element element : el) {
            element.print();
        }
    }

    @Override
    public void add(Element element) {
        el.add(element);
    }

    @Override
    public void run() {

    }

    @Override
    public List<Element> getList() {
        return el;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + '}';
    }
}
