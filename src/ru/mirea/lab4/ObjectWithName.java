package ru.mirea.lab4;

public class ObjectWithName implements Nameble{
    private String name;
    public ObjectWithName(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
