package ru.mirea.lab2;

public class Leg {
    public int weightOfLeg ;
    public String name;
    public Leg(int weightOfLeg, String name){
        this.weightOfLeg = weightOfLeg;
        this.name = name;
    }

    public int getWeightOfLeg() {
        return weightOfLeg;
    }

    public String getName() {
        return name;
    }
}
