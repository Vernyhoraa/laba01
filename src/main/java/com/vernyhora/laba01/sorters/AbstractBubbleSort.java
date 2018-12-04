package com.vernyhora.laba01.sorters;

/**
 * @author <Vernyhora Elena></>
 */

public abstract class AbstractBubbleSort extends AbstractSorter {

    public void sort(int arr[]) {
        bubbleSortWithParam(arr, 0, arr.length);
    }

    protected abstract void bubbleSortWithParam(int arr[], int startIndex, int length);
}
