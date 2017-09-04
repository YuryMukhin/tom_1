package com.company.chapter_8;

import java.util.function.Supplier;

/**
 * Created by ymukhin on 9/1/2017.
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        this.first = null;
        this.second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public static <T> Pair<T> makePair(Supplier<T> constr){
        return new Pair<T>(constr.get(), constr.get());
    }
/*
    public boolean equals(T value){
        return first.equals(value) && second.equals(value);
    }
*/
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
