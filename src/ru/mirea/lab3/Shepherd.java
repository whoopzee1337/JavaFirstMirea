package ru.mirea.lab3;

public class Shepherd extends Dog{
    private int age;
    public Shepherd(int length, int weight , String breed , int age){
        super(length , weight , breed);
        this.age = age;
    }
    @Override
    public String toString() {
        return "Порода - овчарка";
    }
}
