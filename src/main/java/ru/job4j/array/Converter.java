package ru.job4j.array;

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {
        int index = 0;
        int length = 2;
        for (int[] sell : array) {
            for (int i = 0; i < sell.length; i++) {
                index++;
            }
        }
        int[] num = new int[index];
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                num[size++] = array[i][j];
            }
        }
        for (int i = 2; i < num.length; i++) {
            if (i * i < num.length) {
                length++;
            }
        }
        int puf = 0;
        int[][] arrays = new int[length][length];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = puf >= num.length ? 0 : num[puf++];
            }
        }
       return arrays;
    }
}
