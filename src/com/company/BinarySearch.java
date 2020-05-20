package com.company;

import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) { new BinarySearchTimer(runBinaryTimer());
    }

//    private int[] generateRandomArray(int arraySize) {
//        Random rand = new Random();
//
//        return rand.ints(arraySize, 0, 1000).toArray();
//    }

    public static int generateRandomInt(int arraySize) {

        //returns initialGuess

        Random r = new Random();
        return r.nextInt(arraySize);
    }

    public static int runBinaryTimer() {

        int initialGuess = 0;

        int array[] = {1000, 2000, 3000, 4000};
        for (int arraySize : array) {
            initialGuess = generateRandomInt(arraySize);

            System.out.println(initialGuess);
        }

    return initialGuess;
        }
    }

class BinarySearchTimer {

    public String getCsvFileName() {
        return "binarySearch.csv";
    }

    public void appendtoCsvFile(int arraySize, int count) {

        try {
            FileWriter csvWriter = new FileWriter(getCsvFileName(), true);
            csvWriter.write(arraySize + "," + count + "\n");

            csvWriter.flush();
            csvWriter.close();
        } catch (Exception e) {
            System.err.println("Error: failed to write to file");
        }
    }

   public BinarySearchTimer(int initialGuess) {

        System.out.println("xxxx " + initialGuess);
            int count = 0;
            int MIN = 0;
            int MAX = 4000;
            if (initialGuess < MAX)
                while (true) {
                    int guess = (MAX + MIN)/2;
                    System.out.println("Is your guess " + guess + "?");

                    if (guess == initialGuess) {
                        System.out.println("your number is " + guess);
                        break;
                    } else if (guess < initialGuess) {
                        System.out.println("guessing lower than " + guess + " ...");
                        MIN = guess;
                    } else {
                        System.out.println("guessing higher than " + guess + " ...");
                        MAX = guess;
                    }
                    count++;
                    System.out.println(MIN);
                    System.out.println(MAX);
                }
            else {
                System.out.println("initialGuess is greater than MAX range ");
            }

            System.out.println("thank you for playing " + count + " times");

            appendtoCsvFile(initialGuess, count);
        }
    }




//                String response = s.nextLine();
//                if ("correct".equals(response.toLowerCase())){
//                    break;
//                } else if("lower".equals(response.toLowerCase())){
//                    MAX = guess;
//                } else if("higher".equals(response.toLowerCase())){
//                    MIN = guess;
//                }

//            Scanner s = new Scanner(System.in);