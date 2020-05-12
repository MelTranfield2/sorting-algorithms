package com.company;

public class Loop {
    public static void main(String[]args) {
//        int count = 0; //loop which, everytime it loops adds one to count. max amount of loops is 10
//        //had anything before count, would reset value. iterator is i
//        int N = 100;
//        for (int i = 0; i < N; i = i + 1) {
//            //System.out.println(count); //first value of count it finds is count = 0
//            count = count + 1;
//            //count++
//            System.out.println(count);
//        }
//        //System.out.println(count);
        int a = 0;
        int N = 10;
        for (int i = 0; i < N; i++) {
            System.out.println("outer loop " + i);
            for (int j = N; j > i; j--) {
                a = a + i + j;
                System.out.println("inner loop " + j);
            }
        }
    }
}
