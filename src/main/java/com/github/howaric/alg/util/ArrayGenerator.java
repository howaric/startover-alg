package com.github.howaric.alg.util;

import java.util.Arrays;

public class ArrayGenerator {

    private ArrayGenerator() {
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArray()));
        System.out.println(Arrays.toString(randomArray(12, 5)));
        System.out.println(Arrays.toString(randomSortedArray()));
    }

    public static int[] randomArray() {
        return randomArray(10, 100);
    }

    public static int[] randomArray(int maxSize, int maxValue) {
        int size = (int) ((maxSize + 1) * Math.random());
        return generateRandomArray(maxValue, size);
    }

    public static int[] randomPositiveArray() {
        return randomPositiveArray(100, 10);
    }

    public static int[] randomPositiveArray(int maxSize, int maxValue) {
        int size = (int) ((maxSize + 1) * Math.random());
        return generatePositiveRandomArray(maxValue, size);
    }

    public static int[] randomArrayWithFixSize(int size) {
        return generateRandomArray(100, size);
    }

    public static int[] randomArrayWithFixSize(int size, int maxValue) {
        return generateRandomArray(maxValue, size);
    }

    public static int[] randomSortedArray() {
        int[] result = randomArray();
        Arrays.sort(result);
        return result;
    }

    private static int[] generateRandomArray(int maxValue, int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue) * Math.random());
        }
        return result;
    }

    private static int[] generatePositiveRandomArray(int maxValue, int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) ((maxValue) * Math.random());
        }
        return result;
    }

}
