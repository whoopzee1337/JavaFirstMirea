package ru.mirea.task12;

public class Person {
    private String name, fam, ot;
    public Person(String fam, String name, String ot) {
        this.fam = fam;
        this.name = name;
        this.ot = ot;
    }

    public String getFIO() {
        return String.format("%s %s %s", fam, name, ot);
    }
}
