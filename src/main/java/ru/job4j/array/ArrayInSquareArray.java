package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int result = array.length / 2 == 1 ? array.length / 2 + 1 : array.length / 2;
        int[][] copy = new int[result][result];
        int index = 0;
        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                if (index >= array.length) {
                    copy[i][j] = 0;
                } else {
                    copy[i][j] = array[index++];
                }
            }
        }
        return copy;
    }
}
