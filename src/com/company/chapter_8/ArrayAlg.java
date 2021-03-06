package com.company.chapter_8;

import java.util.function.Supplier;

/**
 * Created by ymukhin on 9/1/2017.
 */
public class ArrayAlg {

    public static final String className = "ArrayAlg";

    public static <T> T getMiddle(T... a){
        return a[a.length/2];
    }

    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if (a==null || a.length==0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++){
            if (min.compareTo(a[i])<0) min = a[i];
            if (max.compareTo(a[i])>0) max = a[i];
        }
        return new Pair<T>(min, max);
    }
}
