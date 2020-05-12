package com.company;

import java.util.concurrent.TimeUnit;

public class Stopwatch { //created SW class
    long startTime;
    public Stopwatch() {
        startTime = System.nanoTime();
    } //constructor. when creating a new instance of the class, calls Stopwatch() as constructor automatically.
    public long getTime() {
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        return TimeUnit.NANOSECONDS.toMillis(duration);
    }
}

//a function class