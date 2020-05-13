package com.company;

public class InsertionSort {
    public static void main(String[] args) {
        new InsertionSortTimer().runTimer();
    }
}

class InsertionSortTimer extends SortTimer {

    public String getCsvFileName() {
        return "insertionSort.csv";
    }

        /*Function to sort array using insertion sort*/
        public int[] Sort(int[] arr)
        {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
            return arr;
        }
}

//        /* A utility function to print array of size n*/
//        static void printArray(int arr[])
//        {
//            int n = arr.length;
//            for (int i = 0; i < n; ++i)
//                System.out.print(arr[i] + " ");
//
//            System.out.println();
//        }
    /* This code is contributed by Rajat Mishra. */


