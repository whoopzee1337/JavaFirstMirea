package ru.mirea.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BadINNException {
        Scanner in = new Scanner(System.in);
        String name , numberOfINN;
        System.out.println("Введите имя");
        name = in.nextLine();
        System.out.println("Введите ИНН (10 цифр)");
        numberOfINN = in.nextLine();
        INN first = new INN(numberOfINN , name);
        first.checkINN();
    }
}
