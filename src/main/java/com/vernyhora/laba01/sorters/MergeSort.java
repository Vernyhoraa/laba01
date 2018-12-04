package com.vernyhora.laba01.sorters;

/**
 * @author <Vernyhora Elena></>
 *
 */

public class MergeSort extends AbstractSorter {
    private void merge(int arr[], int left, int middle, int right) {
        int i, j, k;
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (j = 0; j < n2; j++) {
            rightArr[j] = arr[middle + 1 + j];
        }

        i = 0;
        j = 0;
        k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int arr[], int left, int right) {
        if (left < right) {

            int m = left + (right - left) / 2;

            mergeSort(arr, left, m);
            mergeSort(arr, m + 1, right);

            merge(arr, left, m, right);
        }
    }

    public void sort(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);

    }
}
