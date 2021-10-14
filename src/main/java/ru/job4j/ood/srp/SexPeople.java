package ru.job4j.ood.srp;


public class SexPeople {

    /**
     * В классе я показываю нарушение SRP - я изменил параметры обьекта,
     * так же в одном классе осуществил разную логику
     */

    private People people;

    public void male() {
       people =  new People("Mikhail", 25);
    }

    public void female() {
        people = new People("Maria", 30);
    }

    public void print() {
         System.out.println(people);
    }
}
