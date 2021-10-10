package ru.job4j.cashe;

public class Emulator {
    public static void main(String[] args) {
        DirFile dirFile = new DirFile("./");
        String name = dirFile.get("Names.txt");
        System.out.println(name);
        String address = dirFile.get("Adress.txt");
        System.out.println(address);
    }
}
