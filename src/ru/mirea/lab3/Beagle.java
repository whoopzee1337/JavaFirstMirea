package ru.mirea.lab3;

public class Beagle extends Dog{
    public Beagle(int length, int weight , String breed){
        super(length , weight , breed);
    }

    @Override
    public String toString() {
        return "Порода - гончая";
    }
}
