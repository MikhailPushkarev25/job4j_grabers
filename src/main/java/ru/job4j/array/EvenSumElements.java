package ru.job4j.array;

public class EvenSumElements {

    public static boolean checkArray(int[] data) {
        boolean flag = false;
        int result = 0;
       for (int sum : data) {
            result += sum;
        }
        if (result % 2 == 0) {
            flag = true;
        }
        return flag;
    }
}
