package ru.mirea.lab1;

import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
        int[] a = new int[] {3 , 2 ,1};
        System.out.println(Arrays.toString(a));
        System.out.println(First.summaByFor(a));
        System.out.println(First.summaByWhile(a));
        System.out.println(First.summaByDoWhile(a));
    }
}
