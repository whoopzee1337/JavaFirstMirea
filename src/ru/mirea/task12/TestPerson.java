package ru.mirea.task12;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Malikov" , "Alexander" , "Eduardovich");
        Person person2 = new Person("Malikov" , "" , "Eduardovich");
        System.out.println(person1.getFIO());
        System.out.println(person2.getFIO());

    }

}
