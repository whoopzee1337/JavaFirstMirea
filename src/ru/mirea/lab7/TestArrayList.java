package ru.mirea.lab7;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0 , 1);
        list.add(1, 2);
        list.add (2 , 1);
        System.out.println(list.get(1));
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        list.remove(1);
        System.out.println(list);
        list.set(1 , 0);
        System.out.println(list);
        list.sort(Integer::compareTo);
        System.out.println(list);
    }
}
