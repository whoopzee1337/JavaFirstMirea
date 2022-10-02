package ru.mirea.task1;

public class TestBook {
    public static void main(String[] args){
        Book bk1 = new Book("Harry Potter" , 1000);
        Book bk2 = new Book(50);
        Book bk3 = new Book();
        bk3.setName("Dragon Lore");
        bk3.setNumberOfPages(35);
        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
        bk1.calcTimeRequiredToRead();
        bk2.calcTimeRequiredToRead();
        bk3.calcTimeRequiredToRead();

    }
}
