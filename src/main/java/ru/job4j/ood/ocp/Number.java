package ru.job4j.ood.ocp;

public class Number {
    /**
     * Простой код показывает нарушение двух принципов OCP and SRP
     * @param num
     * @return
     */
    public int Number(int num) {
        return 25;
    }

    public String line(String ln) {
        return "Error";
    }
}
