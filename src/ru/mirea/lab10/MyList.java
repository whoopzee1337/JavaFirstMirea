package ru.mirea.lab10;

public interface MyList<E> {
    int DEFAULT_CAPACITY = 10;

    void add(E elem);
    void addAll(Object[] ob);
    E get(int index);
}