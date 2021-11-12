package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int size = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                size++;
            } else {
                size = 1;
            }
        }
        return size;
    }
}
