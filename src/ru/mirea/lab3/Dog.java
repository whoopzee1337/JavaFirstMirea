package ru.mirea.lab3;

public abstract class Dog {
    private int length;
    private int weight;
    private String breed;
    public Dog(int length, int weight , String breed){
        this.length = length;
        this.breed = breed;
        this.weight = weight;
    }
    public abstract String toString();

}
