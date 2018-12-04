package com.vernyhora.laba01.sorters;

/**
 * @author <Vernyhora Elena></>
 *
 */

public class MergeQuickSort extends AbstractSorter {
    private final static int QUICK_SORT_LENGTH = 8;
    private QuickSort quickSort = new QuickSort();
    private MergeSort mergeSort = new MergeSort();

    private void mergeSort(int array[], int left, int right) {
        if (right - left <= QUICK_SORT_LENGTH) {
            quickSort.quickSort(array, left, right + 1);
        } else {
            mergeSort.mergeSort(array, left, right);
        }
    }

    public void sort(int array[]) {
        mergeSort(array, 0, array.length - 1);
    }
}



