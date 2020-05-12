package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        new MergeSortTimer().runTimer();
    }
}

class MergeSortTimer extends SortTimer {

    public String getCsvFileName() {
        return "mergeSort.csv";
    }

    public int[] Sort(int[] array) {
        // if array has just one element, than don't try to divide it further
        if (array.length == 1) return array;

        // Divide array into two equal sized arrays
        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        int[] rightArray = Arrays.copyOfRange(array, mid, array.length);

        // Sort both left and right arrays
        int[] sortedLeftArray = Sort(leftArray);
        int[] sortedRightArray = Sort(rightArray);

        // Merge both sorted arrays into a single array while maintaining sorting
        return merge(sortedLeftArray, sortedRightArray);
    }

    public static int[] merge(int[] leftArray, int[] rightArray) {

        // Create a empty array which will contain all sorted elements
        int[] array = new int[leftArray.length + rightArray.length];

        // Iterators containing current index of subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = 0; i < array.length; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }

        return array;
    }
}