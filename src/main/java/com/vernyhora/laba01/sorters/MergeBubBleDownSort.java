package com.vernyhora.laba01.sorters;

/**
 * @author <Vernyhora Elena></>
 *
 */

public class MergeBubBleDownSort extends AbstractSorter {
    private final static int BUBBLE_SORT_LENGTH = 8;
    private BubbleSortDown bubbleSortDown = new BubbleSortDown();
    private MergeSort mergeSort = new MergeSort();

    private void mergeSort(int arr[], int left, int right) {
        if (right - left <= BUBBLE_SORT_LENGTH) {
            bubbleSortDown.bubbleSortWithParam(arr, left, right + 1);
        } else {
            mergeSort.mergeSort(arr, left, right);
        }
    }

    public void sort(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);
    }
}

