package com.company;

import com.company.chapter_6.*;
import com.company.chapter_7.StackTraceTest;
import com.company.chapter_8.ArrayAlg;
import com.company.chapter_8.Pair;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Comparator.*;
import java.util.Scanner;
import java.lang.ClassLoader;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /* CHAPTER 6
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(5000, listener);
        t.start();

        Comparator<String> comp = new LengthComparator();
        String[] fr = {"Peter", "Paul", "Ann", "Mary", ""};
        //using comparator
    //    Arrays.sort(fr, comp);
        //using lambda- expression
        Arrays.sort(fr, (String first, String second) -> first.length() - second.length());

        Person[] people = {new Person("WSd", "Sdv", 25),
                new Person("WSsdd", "Sdv", 28),
                new Person("WSsddsdf", null, 24),
                new Person("WSsddsd", "Sdv", 22)
        };

        Arrays.sort(people, Comparator.comparing(Person::getFirstName));
        for (Person p: people)
            System.out.println(p.getFirstName());

        System.out.println(fr[0]);

        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        Object value = new Person();
        InvocationHandler handler = new TraceHandler(value);
        Class[] interfaces = new Class[]{Comparable.class};
        Object proxy = Proxy.newProxyInstance(null, interfaces, handler);

        Thread.sleep(7000);
        */

        /* //CHAPTER 7
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        //assert n >= 0 : n;
        StackTraceTest.factorial(n);
        Logger.getGlobal().info("finished");
        */

        String middle = ArrayAlg.getMiddle("sc", "Wce", "wecw");
        System.out.println(middle);

        LocalDate[] ld =
                {
                        LocalDate.of(1906, 12, 9),
                        LocalDate.of(1945, 2, 2),
                        LocalDate.of(1985, 8, 1),
                        LocalDate.of(2001, 11, 19),
                };

        Pair<LocalDate> mm = ArrayAlg.minmax(ld);

        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());
    }
}
