package com.vernyhora.laba01.sorters;

/**
 * @author <Vernyhora Elena></>
 *
 */

public class BubbleSortUp extends AbstractBubbleSort {
    public void bubbleSortWithParam(int arr[], int startIndex, int length) {
        for (int i = startIndex; i < length - 1; i++) {
            for (int j = startIndex; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}



