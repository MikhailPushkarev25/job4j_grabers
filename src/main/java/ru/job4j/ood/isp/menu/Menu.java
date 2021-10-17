package ru.job4j.ood.isp.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<Element> list;

    public Menu(List<Element> list) {
        this.list = list;
    }

    public void init() {
        for (Element element : list) {
            element.print();
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu(new ArrayList<>());
        Element element1 = new ElementRes("Задача 1");
        Element element2 = new ElementRes("Задача 2");
        Element element11 = new ElementRes("Задача 1.1");
        element1.add(element11);
        Element element111 = new ElementRes("Задача 1.1.1");
        element11.add(element111);
        Element element112 = new ElementRes("Задача 1.1.2");
        element11.add(element112);
        Element element12 = new ElementRes("Задача 1.2");
        element1.add(element12);
        Element element13 = new ElementRes("Задача 1.3");
        element1.add(element13);
        menu.list.add(element1);
        menu.list.add(element2);
        menu.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пункт ..");
        String str = scanner.nextLine();
        String[] s = str.split("\\.");
        List<Element> el = menu.list;
        Element element = null;
        for (String line : s) {
            element = el.get(Integer.parseInt(line) - 1);
            el = element.getList();
        }
        element.run();
    }
}
