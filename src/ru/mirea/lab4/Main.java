package ru.mirea.lab4;

public class Main {
    public static void main(String[] args) {
        ObjectWithPrice book = new ObjectWithPrice(300);
        ObjectWithPrice phone = new ObjectWithPrice(10000);
        System.out.println(book.getPrice());
        System.out.println(phone.getPrice());
        ObjectWithName man = new ObjectWithName("Bobie");
        ObjectWithName airplane = new ObjectWithName("AirBus");
        System.out.println(man.getName());
        System.out.println(airplane.getName());
    }
}
