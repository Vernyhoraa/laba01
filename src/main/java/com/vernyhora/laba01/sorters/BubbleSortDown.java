package com.vernyhora.laba01.sorters;

/**
 * @author <Vernyhora Elena></>
 *
 */

public class BubbleSortDown extends AbstractBubbleSort {
    public void bubbleSortWithParam(int arr[], int startIndex, int length) {
        for (int i = length - 1; i >= startIndex; i--) {
            for (int j = length - 1; j > length - i - 1; j--) {
                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}

