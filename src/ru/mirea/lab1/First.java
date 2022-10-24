package ru.mirea.lab1;

public class First {
    public static int summaByFor(int[] a){
        int summa = 0;
        for (int i = 0; i<a.length ; i++){
            summa+=a[i];
        }
        return summa;
    }
    static int summaByWhile(int[] a){
        int i = 0 ,summa = 0 ;
        while (i<a.length){
            summa+=a[i];
            i++;
        }
        return summa;
    }
    static int summaByDoWhile(int[] a){
        int i = 0, summa = 0;
        do{
            summa+=a[i];
            i++;
        }while (i<a.length);
        return summa;
    }




}
