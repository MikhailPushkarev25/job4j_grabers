package ru.job4j.ood.isp;

public interface Auto {
    /**
     * Привожу пример нарушения принципа ISP - у самолета нет октанового числа бензина
     * она на керосине, поэтому нужно разделить интерфейс
     */
    void engine();
    int wight();
    int fuel();
}
 class Audi implements Auto {

    private String info;

     @Override
     public void engine() {
         System.out.println(info + " Мощность");
     }

     @Override
     public int wight() {
         return 1000;
     }

     @Override
     public int fuel() {
         return 92;
     }
 }

 class Plane implements Auto {

    private String info;

     @Override
     public void engine() {
         System.out.println(info + " Мощность");
     }

     @Override
     public int wight() {
         return 100_000;
     }

     @Override
     public int fuel() {
         return 0;
     }
 }
