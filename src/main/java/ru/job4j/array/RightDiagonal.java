package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int size = 0;
        int[] array = new int[data.length];
        for (int i = 0; i < data.length; i++) {
         for (int j = 0; j < data[i].length; j++) {
                 array[size++] = data[i][data.length - 1 - i];
                 break;
         }
        }
        return array;
    }
}
