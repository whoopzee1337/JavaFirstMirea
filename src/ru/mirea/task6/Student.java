package ru.mirea.task6;


public class Student {
    protected String name;
    protected int id;

    public Student(String name , int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return name + " " + id;
    }
    public int getId() {
        return id;
    }
}
