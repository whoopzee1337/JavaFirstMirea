package ru.mirea.task8;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class WaitList<E>  {
    protected Queue<E> content = new ConcurrentLinkedQueue<>();
    WaitList(){
        this
    }
}
