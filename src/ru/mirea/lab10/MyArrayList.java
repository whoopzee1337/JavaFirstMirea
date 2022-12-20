package ru.mirea.lab10;

import java.util.*;

public class MyArrayList<E> implements MyList<E> {
    private int size;
    private int capacity;
    Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= DEFAULT_CAPACITY) capacity = DEFAULT_CAPACITY;
        array = new Object[capacity];
    }

    // Проверяет, достаточно ли вместимости массива
    private boolean checkOverflow(int size) {
        return size >= capacity;
    }

    // Увеличивает емкость массива в 1.5 раза
    private void increaseArray() {
        capacity = (int) (capacity * 1.5f);
        Object[] newArray = new Object[capacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public void add(E element) {
        if (checkOverflow(size + 1)) increaseArray();

        array[size] = element;
        size++;
    }

    @Override
    public void addAll(Object[] ob) {
        while (checkOverflow(size + ob.length)) increaseArray();

        for (int i = size; i < size + ob.length; i++) {
            array[i] = ob[i - size];
        }
        size += ob.length;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" + "size=" + size + ", capacity=" + capacity + ", array=" + Arrays.toString(array) + '}';
    }


    public static void main(String[] args) {

        MyArrayList<Integer> listik = new MyArrayList<>();
        listik.add(12);
        listik.add(12);


        Integer[] arr = {1, 2, 3, 4};
        listik.addAll(arr);
        System.out.println(listik);

        System.out.println(listik.get(3)); // Почему работает приведение к типу E
    }
}