package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> createdLinkedList = new LinkedList<>();
        for (Integer i: sourceList){
            if(i%2 == 0){
                createdLinkedList.addLast(i);
            } else {
                createdLinkedList.addFirst(i);
            }
        }
        return createdLinkedList;
    }
}
