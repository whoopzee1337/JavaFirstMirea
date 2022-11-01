package ru.mirea.task8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList<String> second = new BoundedWaitList<String>(2);
        UnfairWaitList<Double> third = new UnfairWaitList<Double>();
        ConcurrentLinkedQueue<Integer> c = new ConcurrentLinkedQueue<Integer>();
        c.add(3);
        c.add(4);
        WaitList<Integer> first = new WaitList<Integer>(c);
        first.add(1);
        System.out.println(first);
        first.add(2);
        System.out.println(first);
        first.remove();
        System.out.println(first);
        System.out.println(first.containsAll(c));
        System.out.println(first.contains(1));
        System.out.println(first.isEmpty());
        second.add("one");
        second.add("two");
        second.add("three");
        third.add(10.00);
        third.add(11.00);
        third.add(163.00);
        System.out.println(third);
        third.moveToBack(11.00);
        System.out.println(third);


    }
}
