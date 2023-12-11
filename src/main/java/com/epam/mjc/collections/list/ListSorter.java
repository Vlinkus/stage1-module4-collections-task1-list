package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        try {
            int first = Integer.parseInt(String.valueOf(a));
            int second = Integer.parseInt(String.valueOf(b));
            int newFirst = applicationFunction(first);
            int newSecond =  applicationFunction(second);
            if(newFirst == newSecond) {
                return Integer.compare(first, second);
            } else {
                return Integer.compare(newFirst, newSecond);
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }

    public int applicationFunction(int x){
        return (5 * x * x) + 3;
    }
}
