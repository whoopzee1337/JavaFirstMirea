package ru.mirea.lab9;

import java.util.Scanner;

public class Exeption1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (NumberFormatException e){
            System.out.println("Введено не число");
        } catch (ArithmeticException e){
            System.out.println("Попытка деления на 0");
        } finally {
            System.out.println("finally");
        }

    }

}