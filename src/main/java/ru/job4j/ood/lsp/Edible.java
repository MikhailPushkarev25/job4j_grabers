package ru.job4j.ood.lsp;

public class Edible {
// Пример нарушения принципа LSP - не могут быть усилены в подклассе
    private String name;

    public Edible(String name) {
        this.name = name;
    }

    public void result(String res) {
        System.out.println(res + " Можно есть!");
    }

    static class EdibleTwo extends Edible {

        public EdibleTwo(String name) {
            super(name);
        }

        @Override
        public void result(String res) {
            if (res.equals("поганки") && res.equals("Яд")) {
                throw new IllegalArgumentException("Это нельзя кушать!");
            }
            System.out.println(res + " Можно есть!");
        }
    }

    public static void main(String[] args) {
        Edible edible = new EdibleTwo("Mikhail");
        edible.result("Яд");
    }
}
