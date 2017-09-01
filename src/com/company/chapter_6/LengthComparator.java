package com.company.chapter_6;

import java.util.Comparator;

/**
 * Created by ymukhin on 8/30/2017.
 */
public class LengthComparator implements Comparator<String> {
    @Override public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
