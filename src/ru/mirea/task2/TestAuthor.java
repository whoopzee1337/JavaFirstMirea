package ru.mirea.task2;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Alexander" , "alex@gmail.com" , 'M');
        System.out.println(a1);
        a1.setEmail("bushidozho@icloud.com");
        System.out.println (a1.getEmail());
        System.out.println(a1);
    }
}
