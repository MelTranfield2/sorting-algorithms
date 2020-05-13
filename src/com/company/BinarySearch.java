package com.company;

import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) { new BinarySearchTimer().runTimer();
    }
}

class BinarySearchTimer extends SortTimer {

    public int[] Sort(int[] arr) {

            int count = 0;
            int MIN = arr[0];
            int MAX = arr[50];
            while (true) {
                int guess = (MAX + MIN)/2;
                System.out.println("Is your guess " + guess + "?");

                String response = System.console().readLine();
                if ("correct".equals(response.toLowerCase())){
                    break;
                } else if("lower".equals(response.toLowerCase())){
                    MAX = guess;
                } else if("higher".equals(response.toLowerCase())){
                    MIN = guess;
                }
                count++;
                System.out.println(MIN);
                System.out.println(MAX);
            }
            System.out.println("thank you for playing");
        }
        return arr;
    }
}
