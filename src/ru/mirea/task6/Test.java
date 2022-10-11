package ru.mirea.task6;

import java.util.Scanner;

public class Test extends InsertionSort{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество студентов");
        int n = in.nextInt();
        Student[] iDNumber = new Student[n];
        int id;
        String name;
        for (int i = 0 ; i < n ; i++){
            id = in.nextInt();
            name = in.next();
            Student q = new Student(name , id);
            iDNumber[i] = q;
        }
        Sort(iDNumber);
    }
}
