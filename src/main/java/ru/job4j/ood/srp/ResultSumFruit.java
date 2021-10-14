package ru.job4j.ood.srp;

public class ResultSumFruit implements Fruit {

    /**
     * В моем классе я нарушаю принцип SRP есть два метода фруктов
     * и метод вычисления их
     * @return
     */
    @Override
    public String apple() {
        return null;
    }

    @Override
    public String orange() {
        return null;
    }

    @Override
    public int sum() {
        return 0;
    }
}
