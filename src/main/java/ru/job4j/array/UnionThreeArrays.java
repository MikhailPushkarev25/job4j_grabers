package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] array = new int[2 + middle.length / 2 + right.length / 2];
        int result = Math.min(middle.length, right.length);
       int size = 0;
       array[size] = left[0];
       for (int i = 0; i < result; i++) {
           size++;
           if (i % 2 != 0) {
               array[size] = middle[i];
           } else {
               array[size] = right[i];
           }
       }
       array[array.length - 1] = left[left.length - 1];

        return array;
    }
}
