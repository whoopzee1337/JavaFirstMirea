package ru.mirea.task1;

public class Book {
    private String name;
    private int numberOfPages;

    public Book(String c , int n){
        name = c;
        numberOfPages = n;
    }
    public Book(int n){
        name = "Unknown";
        numberOfPages = n;
    }
    public Book(){
        name ="Unknown";
        numberOfPages = 0;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
    }
    public String getName(String name){
        return name;
    }
    public int getNumberOfPages(){
        return getNumberOfPages();
    }
    public String toString(){
        return "The book named " + this.name + " has " +this.numberOfPages+ " pages";
    }

    public void calcTimeRequiredToRead(){
        System.out.println("Time required to read " +this.name+ " is " + this.numberOfPages*5 + " minutes");
    }
}
