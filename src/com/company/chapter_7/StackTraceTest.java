package com.company.chapter_7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ymukhin on 8/31/2017.
 */
public class StackTraceTest {
    private static final Logger myLogger = Logger.getLogger("com.company.chapter_7");

    public static int factorial(int n){
        myLogger.setLevel(Level.FINE);
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        myLogger.fine("FRAMES");
        for (StackTraceElement f : frames){
            System.out.println(f);
        }

        return n == 1 ? 1 : n*factorial(n - 1);
    }
}
