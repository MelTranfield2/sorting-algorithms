package com.company;

public class BubbleSort {

    public static void main(String[] args) {
        new BubbleSortTimer().runTimer();
    }
}

class BubbleSortTimer extends SortTimer {

    public String getCsvFileName() {
        return "bubbleSort.csv";
    }

    public int[] Sort(int[] arr) {

        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr; //assign return value
    }
}


//    public static long getTime(Consumer<Integer> function, int size) {
//            long startTime = System.nanoTime();
//
//            function.accept(size); //comes with library, Consumer interface
//
//            long endTime = System.nanoTime();
//
//            long duration = (endTime - startTime);
//
//            return TimeUnit.NANOSECONDS.toMillis(duration);
//        }


//for loop with :, lambda and consumer

//        bubbleSort(generateRandomArray(500));
//        bubbleSort(generateRandomArray(1000));
//        bubbleSort(generateRandomArray(10_000));
//        bubbleSort(generateRandomArray(50_000));

          //1,5,3,10,4,12,16

        //int[] bubbleSortData =
        //BubbleSortTest.testingArrayValue(bubbleSortData);
//        System.out.println();


//        printIntArray(bubbleSortData);
//        appendtoCsvFile(bubbleSortData, getDurationMillis(bubbleSortData));

