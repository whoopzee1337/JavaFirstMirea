package ru.mirea.task1;

public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Lonchik" , 10 , "White");
        Dog d2 = new Dog();
        Dog d3 = new Dog("Dash" , "Black");
        d2.setAge(5);
        System.out.println(d2);
        d1.getAvgWeightOfBody();
        d2.getAvgWeightOfBody();
    }
}
