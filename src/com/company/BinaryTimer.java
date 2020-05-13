package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class BinaryTimer {

//assign time before executing the method

//create function to empty and call it

        public abstract int[] Sort(int[] array);

        public abstract String getCsvFileName();

        public void appendtoCsvFile(int arraySize, long durationInMillis) {

            try {
                FileWriter csvWriter = new FileWriter(getCsvFileName(), true);
                csvWriter.write(arraySize + "," + durationInMillis + "\n");

                csvWriter.flush();
                csvWriter.close();
            } catch (Exception e) {
                System.err.println("Error: failed to write to file");
            }
        }

        private long getDurationMillis(int arraySize) {
            int[] unSorted1 = generateRandomArray(arraySize);
            int[] unSorted2 = generateRandomArray(arraySize);
            int[] unSorted3 = generateRandomArray(arraySize);
            long startTime = System.nanoTime();
            Sort(unSorted1);
            Sort(unSorted2);
            Sort(unSorted3);
            long endTime = System.nanoTime();

            long duration = (endTime - startTime) / 3;

            return TimeUnit.NANOSECONDS.toMillis(duration);
        }

        private int[] generateRandomArray(int arraySize) {
            Random rand = new Random(); //generates random numbers

            return rand.ints(arraySize, 0, 10001).toArray();
        }

        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

        public void runTimer() {

            new File(getCsvFileName()).delete();
            int array[] = {50, 500, 1000, 10_000, 50_000};
            for (int arraySize : array) {
                long durationInMillis = getDurationMillis(arraySize);

                System.out.println(durationInMillis);

                appendtoCsvFile(arraySize, durationInMillis);
            }
        }

    }
}
