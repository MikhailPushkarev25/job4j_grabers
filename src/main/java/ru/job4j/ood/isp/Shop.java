package ru.job4j.ood.isp;

public interface Shop {
    /**
     * Так же пример нарушения принципа ISP - у сервиса нет продуктов, он выставляет  счет
     * за проделанную работу
     */
    String product();
    int price();
}

 class People implements Shop {

     @Override
     public String product() {
         return "Куртка";
     }

     @Override
     public int price() {
         return 5000;
     }
 }
 class Service implements Shop {

     @Override
     public String product() {
         return null;
     }

     @Override
     public int price() {
         return 0;
     }
 }
