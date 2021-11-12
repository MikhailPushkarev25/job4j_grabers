package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[src].length; i++) {
           int buff = data[src][i];
           data[src][i] = data[dst][i];
           data[dst][i]= buff;
        }
    }
}
