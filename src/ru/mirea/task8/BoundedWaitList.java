package ru.mirea.task8;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public void add (E element){
        if (content.size() < capacity){
            content.add(element);
        }
        else{
            System.out.println("Очередь переполнена");
        }
    }
    public String toString(){
        return content.toString();
    }
}