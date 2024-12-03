package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrList = new LinkedList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.removeFirst();
        arrList.removeFirst();
        System.out.println(arrList);
    }
}