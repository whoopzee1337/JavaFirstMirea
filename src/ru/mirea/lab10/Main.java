package ru.mirea.lab10;

import java.util.ArrayList;


public class Main {
    public static <E> void convertArrayToList(E[] array, ArrayList<E> list) {
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3};
        ArrayList<Integer> list = new ArrayList<Integer>();
        convertArrayToList(array, list);
        System.out.println(list);
    }
}
