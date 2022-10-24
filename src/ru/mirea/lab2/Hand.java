package ru.mirea.lab2;

public class Hand {
    public int lengthOfHand;
    public String name;
    public Hand(int length , String name){
        this.lengthOfHand = length;
        this.name = name;
    }

    public int getLengthOfHand() {
        return lengthOfHand;
    }

    public String getName() {
        return name;
    }
}
