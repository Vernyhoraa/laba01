package com.vernyhora.laba01.fillers;

import java.util.Random;

/**
 * @see FillerProcessor
 * @see Random
 * @author <Vernyhora Elena></>
 *
 */

public class ArrayGenerator {

    @FillerProcessor
    public static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(length);
        }
        return arr;
    }

    @FillerProcessor
    public static int[] generateReversSortedArray(int length) {
        int[] arr = new int[length];
        int j = 0;
        for (int i = length - 1; i >= 0; i--, j++) {
            arr[j] = i;
        }
        return arr;
    }

    @FillerProcessor
    public static int[] generateSortedArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    @FillerProcessor
    public static int[] generateSortedWithRandomArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i;
        }
        arr[length - 1] = random.nextInt(length);

        return arr;
    }
}
