package com.vernyhora.laba01.sorters;

/**
 * @author <Vernyhora Elena></>
 *
 */

public class QuickSort extends AbstractSorter {
    int partition(int array[], int left, int right) {
        int pivot = array[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        return i + 1;
    }

    public void quickSort(int array[], int left, int right) {
        if (left < right) {
            int pi = partition(array, left, right);

            quickSort(array, left, pi - 1);
            quickSort(array, pi + 1, right);
        }
    }

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
}