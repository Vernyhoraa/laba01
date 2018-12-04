package com.vernyhora.laba01.sorters;

/**
 * @author <Vernyhora Elena></>
 *
 */

public class MergeBubbleUpSort extends AbstractSorter {
    private final static int BUBBLE_SORT_LENGTH = 8;
    private BubbleSortUp bubbleSortUp = new BubbleSortUp();
    private MergeSort mergeSort = new MergeSort();

    private void mergeSort(int arr[], int left, int right) {
        if (right - left <= BUBBLE_SORT_LENGTH) {
            bubbleSortUp.bubbleSortWithParam(arr, left, right + 1);
        } else {
            mergeSort.mergeSort(arr, left, right);
        }
    }

    public void sort(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);
    }
}


