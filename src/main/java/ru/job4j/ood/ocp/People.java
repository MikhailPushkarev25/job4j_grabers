package ru.job4j.ood.ocp;

public class People {
    /**
     * Показываю простой пример нарушения ОСР - в этом классе
     * можно изменить реализацию, поэтому лучше закрыть класс и
     * и применить его е расширению
     */
    private int age;
    private String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        People people = new People(25, "Mikhail");

        System.out.println(people.toString());
        people.setAge(30);
        people.setName("Mikha");
        System.out.println(people.toString());
    }
}
