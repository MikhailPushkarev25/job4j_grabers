package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int size = 0;
        int[] array = new int[data.length * data[0].length];
        for (int i = 0; i < data.length; i++) {
           for (int j = 0; j < data[i].length; j++) {
               array[size++] = data[i][j];
           }
        }
        return array;
    }
}
