package ru.mirea.task10;

public class Client {
    public Chair sit(String input){
        Chair chair = null;
        if (input.equals("Victorian")){
            chair = new Valerian();
        }else if (input.equals("Multifunctional")){
            chair = new Multifunctional();
        }else if (input.equals("Magic")){
            chair = new Magic();
        }
        return chair;
    }
}
